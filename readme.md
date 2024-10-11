# Alura Latam - Oracle ONE - Backend

## Table of contents

- [Overview](#overview)
    - [The challenge](#the-challenge)
    - [Screenshot](#screenshot)
- [My process](#my-process)
    - [Built with](#built-with)
    - [What I learned](#what-i-learned)
- [Author](#author)
- [Course](#Course)

## Overview

### The challenge

Users should be able to:

- Configuration Environment Java
- Consume APIs

### Screenshot

![](/ScreenShotConversor.png)

## My process

### Built with

- Map
- Scanner
- Api:  [Exchange Api](https://www.exchangerate-api.com/docs/java-currency-api)
- HTTP Client
- HTTP Request
- HTTP Response
- Library Gson

### What I learned

In this lesson, I learn how to encode about the consume APIs, I can create a simple menu
about Money Exchange COP, BOB, USD, ARS.

To see how you can add code snippets, see below, about filterRates:

```java
 Map<String, Double> filteredRates=new HashMap<>();

        for(String moneda:monedasInteres){
        if(conversionRates.containsKey(moneda)){
        filteredRates.put(moneda,conversionRates.get(moneda));
        }
        }

        return filteredRates;
```

## Author

- Website - [Juan Pablo Cristancho](https://my-portafolio-mygi-dvu8swsn6-juan-cris-projects.vercel.app)

# Course

- [Oracle ONE](https://my-portafolio-mygi-dvu8swsn6-juan-cris-projects.vercel.app)
- [Alura](https://www.linkedin.com/company/alura-latam/mycompany/)

