#!/bin/sh

# i.g: ./protoc.sh java APIService/src/main/java StockTrading.proto

PROTOC_HOME=
INPUT=resources/proto
TARGET=$1      # java | ts
OUTPUT=$2
FILE=$3

CMD="$PROTOC_HOME/bin/protoc -I=$INPUT"

if [ $TARGET = "java" ] ; then
    CMD="$CMD --java_out=$OUTPUT"
    CMD="$CMD --grpc_out=$OUTPUT"
    CMD="$CMD --plugin=protoc-gen-grpc=$PROTOC_HOME/protoc-gen-grpc-java-1.51.1-linux-x86_64.exe"
elif [ $TARGET = "ts" ]; then
    CMD="$CMD --js_out=\"import_style=commonjs,binary:$OUTPUT\""
    CMD="$CMD --ts_out=$OUTPUT"
    CMD="$CMD --plugin=protoc-gen-ts=nodejs-client/node_modules/.bin/protoc-gen-ts"
fi

CMD="$CMD $FILE"

# $PROTOC_HOME/bin/protoc -I=$INPUT \
#     --java_out=$OUTPUT \
#     --grpc_out=$OUTPUT \
#     --plugin=protoc-gen-grpc=$PROTOC_HOME/protoc-gen-grpc-java-1.51.1-linux-x86_64.exe \
#     $FILE \

echo "Run: $CMD"
bash -c "$CMD"
echo "Done!"
