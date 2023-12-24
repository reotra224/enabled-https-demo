# Enabled-https-demo
Demonstration to enable HTTPS into Spring boot application

## Generate keystore commands

### PKCS12
    keytool -genkeypair -alias demossl -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore src/main/resources/keystore/demossl.p12 -validity 3650

### JKS
    keytool -genkeypair -alias demossl-jks -keyalg RSA -keysize 2048 -keystore src/main/resources/keystore/demossl.jks -validity 3650

## Convert JKS to PKCS12
    keytool -importkeystore -srckeystore src/main/resources/keystore/demossl.jks -destkeystore src/main/resources/keystore/demossl-jks.p12  -deststoretype pkcs12
