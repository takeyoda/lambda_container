FROM public.ecr.aws/lambda/java:11

ENV JAVA_TOOL_OPTIONS="-Duser.language=ja -Duser.country=JP -Duser.timezone=Asia/Tokyo"

CMD [ "ore.exam.lambdacontainer.OreHandler" ]

COPY build/dependency/* ./lib/
COPY build/libs/lambda_container.jar ./lib/
