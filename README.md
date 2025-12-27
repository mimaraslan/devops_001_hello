# DevOps

### Hello 002

Bu benim ilk DevOps projemdir.

---

### Docker'a terminalden login olmak için

``` 
docker login  -u KULLANICI_ADI    -p  PAROLA  
```

---

### CLI

```
KonuştuğumYer   emir        araç        :     sürüm
---------------------------------------------------------------------
docker          pull        nginx       :     stable-alpine3.23-perl
docker          pull        nginx       :     latest
docker          pull        nginx


docker          push	    kullaniciadi/nginx    :   sürümno


docker 	        run 	    -it        -d       -p  9998:80      --name mydemo2       nginx:alpine

docker          login        -p  123456789    -u kullaniciadi

docker          ps
```


---
```
yağ + domates + tuz + soğan + patates + su + salça + ateş + kibrit + tencere + bıçak + kaşık + kapak + tabak = yemek v1.0

algoritma    
malzemeleri alınacak
ocağa kontrol
tencereyi ocağın üstüne koy
bıçak kontrol et
bıçağı al
domatesi doğra
```
---

###  Docker  Image


### ============= Kendi projemizi Docker image haline çevimek =============


### Maven

#### Version 1
```
docker   build     --build-arg   JAR_FILE=target/devops_001_hello-1.0.0.jar       --tag  mimaraslan/devops_001_hello:v001     .
```


#### Version 2
```
docker   build     --build-arg   JAR_FILE=target/devops_001_hello-1.0.2.jar       --tag  mimaraslan/devops_001_hello:v002     .
```


#### Version 3
```
docker buildx  build     --build-arg   JAR_FILE=target/devops_001_hello-1.0.3.jar       --tag  mimaraslan/devops_001_hello:v003     .
```

---

### ============= kendi projemizi Docker image'den container haline çevimek =============

```
docker  run  -it  -d   -p  9091:8080     --name my-app1     mimaraslan/devops_001_hello:v001
```


http://localhost:9091

```
docker  run  -it  -d   -p  9092:8080     --name my-app2     mimaraslan/devops_001_hello:v002
```

http://localhost:9092


```
docker  run  -it  -d   -p  9093:8080     --name my-app3     mimaraslan/devops_001_hello:v003
```

http://localhost:9093

---

### ============= Docker Hub'a image göndermek =============

```
docker push mimaraslan/devops_001_hello:v001
```

```
docker push mimaraslan/devops_001_hello:v002
```

```
docker push mimaraslan/devops_001_hello:v003
```

---

### ============= Docker Hub'dan image çekmek =============

```
docker pull mimaraslan/devops_001_hello:v001
```

```
docker pull mimaraslan/devops_001_hello:v002
```

```
docker pull mimaraslan/devops_001_hello:v003
```


---

## Gradle

### Build v1
```
docker build     --build-arg   JAR_FILE=build/libs/devops_002_hello-1.0.0.jar       --tag  mimaraslan/devops_002_hello:v001     .
```

### Build v2
```
docker build     --build-arg   JAR_FILE=build/libs/devops_002_hello-1.0.2.jar       --tag  mimaraslan/devops_002_hello:v002     .
```

### Build v3
```
docker build     --build-arg   JAR_FILE=build/libs/devops_002_hello-1.0.3.jar       --tag  mimaraslan/devops_002_hello:v003     .
```

---

### ============= Docker Hub'a image göndermek =============

```
docker push mimaraslan/devops_002_hello:v001
```

```
docker push mimaraslan/devops_002_hello:v002
```

```
docker push mimaraslan/devops_002_hello:v003
```

---

### ============= Docker Hub'dan image çekmek =============

```
docker pull mimaraslan/devops_002_hello:v001
```

```
docker pull mimaraslan/devops_002_hello:v002
```

```
docker pull mimaraslan/devops_002_hello:v003
```


