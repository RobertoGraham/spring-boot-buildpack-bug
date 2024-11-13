> [!NOTE]  
> This does not work.

```sh
./gradlew bootBuildImage
```

> [!NOTE]  
> This works.

```sh
pack build --builder paketobuildpacks/builder-jammy-base --buildpack paketo-buildpacks/java --buildpack docker.io/paketobuildpacks/new-relic --trust-extra-buildpacks --volume $(pwd)/paketo-bindings:/platform/bindings spring-boot-buildpack-bug
```
