#!/bin/bash

# http://redsymbol.net/articles/unofficial-bash-strict-mode/
set -euo pipefail
IFS=$'\n\t'


POSTGRES_VERSIONS=(
	"9.6"
	"9.5"
	"9.4"
)

JOOQ_VERSIONS=(
	"3.9.3"
	"3.9.0"
	"3.8.7"
)

rm -rf target target-*

for POSTGRES_VERSION in ${POSTGRES_VERSIONS[@]}; do

	docker run \
		--name postgres \
		--env POSTGRES_PASSWORD=test \
		--env POSTGRES_USER=test \
		--env POSTGRES_DB=test \
		--publish 5432 \
		--detach \
		postgres:${POSTGRES_VERSION}

	sleep 5

	POSTGRES_PORT=$(docker port postgres 5432 | cut -d : -f 2)
	POSTGRES_HOST=$(docker-machine ip)

	for JOOQ_VERSION in ${JOOQ_VERSIONS[@]}; do

		echo ">> "
		echo ">> Running with Postgres = ${POSTGRES_VERSION}; jOOQ = ${JOOQ_VERSION}"
		echo ">> "

		mvn clean install \
			-Djooq.version=${JOOQ_VERSION} \
			-Ddatabase.host=${POSTGRES_HOST}:${POSTGRES_PORT}

		mv target target-${POSTGRES_VERSION}-${JOOQ_VERSION}

	done

	docker stop postgres
	docker rm -f postgres

done

find target-* \
	-name Test.java \
	-print \
	-exec grep STATUS {} \;

