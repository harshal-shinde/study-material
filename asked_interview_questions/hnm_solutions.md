
# Difference between @Controller & @RestController
- These annotation are used during REST web service in spring
- These annotation are writtern over class
- When we declared annotation we need specify **@ResponseBody** annotation to serialize output
- @Restcontroller simplifies implementation of API , interanally it used @ResponseBody so we get seralized return object into HTTP Response
- @RestController is specailized implementation of controller


# Dependencies required to create spring rest controller service
- spring-mvc
- spring-webmvc
- jackson-databind
- jaxb-api
- jaxb-runtime
- javax-activation-api
- spring-context
Jackson and jaxb are used to get response in JSON or XML format

# Why Strings are immutable
Strings are immutable because of **String pool** 
for Example 
String str1 = "Harshal"
String str2 = "Harshal"

On Stack
str1 = 101
str2 = 101

Heap
String pool
101 - Harshal

str1 = "Shinde"

heap will be
101 - harshal
102 - Shinde

Stack 
On Stack
str1 = 102
str2 = 101

When we update the value of any String its value is not changes its references change because same value may be refered by other Strings

String immutability
- Thread Safety in multithreading
- Secure for class loader to load correct classes properly


# Different scopes of Bean in spring framework
- singleton - Single object create per IOC container
- prototype - Multiple object instance
- request - Per Request
- Session - Per HTTP Session
- application 
- Session


# Microservice design patterns

# What are the ways to test API's ?


# Async implementation in spring microservices

# iOC (Inversion of Control)
Also known as **dependency injection**

Object defines there dependencies through
- Constructor arguments
- Argument to factory method or properties are set when instance of object created or returned from facotry method
- Bean itself controlling installation of dependencies by using direct construction of classses. This type of pattern knows **service locator pattern**

Application context
- Sub interface of **Bean Factory**


# How to call another REST API from one REST service ?
  
