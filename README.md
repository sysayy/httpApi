# AutoExiuCarApi
Java 版本 基于rest-assured的接口测试


# 目录结构
```ruby
.
├── Configs 存放数据文件 以类名命名 数据已 key value 模式存储
│   └── Test001_getBook.properties
├── README.md
├── lib
│   ├── commons-beanutils-1.7.0.jar
│   ├── commons-codec-1.9.jar
│   ├── commons-collections-3.2.1.jar
│   ├── commons-httpclient-3.1.jar
│   ├── commons-lang-2.3.jar
│   ├── commons-lang3-3.4.jar
│   ├── commons-logging-1.1.1.jar
│   ├── commons-logging-1.2.jar
│   ├── ezmorph-1.0.3.jar
│   ├── groovy-2.4.9.jar
│   ├── groovy-json-2.4.9.jar
│   ├── groovy-xml-2.4.9.jar
│   ├── hamcrest-core-1.3.jar
│   ├── hamcrest-library-1.3.jar
│   ├── httpclient-4.5.3.jar
│   ├── httpcore-4.4.6.jar
│   ├── httpmime-4.5.1.jar
│   ├── jettison.jar
│   ├── json-lib-2.2.3-jdk15.jar
│   ├── poi-3.17.jar
│   ├── poi-examples-3.17.jar
│   ├── poi-excelant-3.17.jar
│   ├── poi-ooxml-3.17.jar
│   ├── poi-ooxml-schemas-3.17.jar
│   ├── poi-scratchpad-3.17.jar
│   ├── rest-assured-3.0.5.jar
│   └── tagsoup-1.2.1.jar
└── src 
    └── api
        └── test
            ├── case
            │   └── douban
            │       └── Test001_getBook.java
            ├── obj
            │   ├── Account
            │   │   ├── Get.java
            │   │   └── LoginJsonObj.java
            │   ├── clientCommonInfo.java
            │   └── douban
            └── util
                ├── Assertion.java
                ├── AssertionListener.java
                ├── BaseTest.java
                └── JsonToObj.java
```                
