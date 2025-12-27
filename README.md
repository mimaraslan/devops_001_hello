# DevOps 

### Hello 001

Bu benim ilk DevOps projemdir.

---

### Docker'a terminalden login olmak için

``` 
docker login  -u KULLANICI_ADI    -p  PAROLA  
```




CLI


Konuştuğum			 emir        neyi        :     sürüm

					 çekme
docker               pull        nginx       :     stable-alpine3.23-perl
docker               pull        nginx       :     latest
docker               pull        nginx

					 itmek
docker 				 push	     kullaniciadi/nginx       :   sürümno


docker 				 run 		 -it        -d       -p  9998:80      --name mydemo2       nginx:alpine

docker               login                  -p  123456789    -u kullaniciadi

docker               ps

---
yağ + domates + tuz + soğan + patates + su + salça + ateş + kibrit + tencere + bıçak + kaşık + kapak + tabak = yemek v1.0

algoritma    
malzemeleri alınacak
ocağa kontrol
tencereyi ocağın üstüne koy
bıçak kontrol et
bıçağı al
domatesi doğra

---

###  Docker  Image

docker build     --build-arg   JAR_FILE=target/devops_001_hello-1.0.0.jar       --tag  mimaraslan/devops_001_hello:v001     .






