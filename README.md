# lambdacontainer

An AWS Lambda container image example.

## Build
```
./gradlew build
docker build -t ore/lambdacontainer:latest .
```

## Run
```
docker run -p 9000:8080 ore/lambdacontainer:latest
```

## Send event
```
curl -XPOST "http://localhost:9000/2015-03-31/functions/function/invocations" -d '{"payload":"hello world!"}'
```

## Docs
- https://docs.aws.amazon.com/lambda/latest/dg/lambda-java.html
- https://aws.amazon.com/jp/builders-flash/202104/new-lambda-container-development-2/?awsf.filter-name=*all
- https://github.com/aws/aws-lambda-java-libs
- https://github.com/aws/aws-lambda-runtime-interface-emulator/
- https://hub.docker.com/r/amazon/aws-lambda-java

## Container requirements
- https://docs.aws.amazon.com/lambda/latest/dg/images-create.html#images-reqs
