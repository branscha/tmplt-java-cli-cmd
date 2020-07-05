#!/bin/sh

DIR=$(dirname "$0")
FULL_DIR=$(cd "${DIR}" && pwd)
${FULL_DIR}/run-java.sh run "$@"