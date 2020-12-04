# techmojo
Find the top 10 trending hashtags in twitter. You can write a standalone java class(es) / interfaces as deemed to be fit. 
Assumptions & notes : 
1) A tweet is a text being input by tweeters. 
2) A main method in a java class to be implemented which takes the tweet as an input. 
3) You need to extract hashtag from a tweet text (Ex: sachin is hashtag in the tweet -> " Worlds best cricketer is #sachin") 
4) Maintain a data structure that keeps tracking of the count of each hashtag that is coming to your main method 
5) print the list of top 10 hashtags at the end of main method execution 

# Input:-

1) Testing #nature #love#instacool#anothertogether #likeforlike, #relax. \\nmulti-line... #festival-- some more text #aaa \\n#anotherhashtag
2) Worlds best cricketer is #sachin #shubham #shubham #shubham #singhal #singhal

# Output:-
```java
"C:\Program Files\Amazon Corretto\jdk11.0.8_10\bin\java.exe" -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\lib\idea_rt.jar=64048:C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Shubham Singhal\Documents\GitHub\techmojo\target\classes;C:\Users\Shubham Singhal\.m2\repository\org\springframework\boot\spring-boot-starter\2.4.0\spring-boot-starter-2.4.0.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\boot\spring-boot\2.4.0\spring-boot-2.4.0.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\spring-context\5.3.1\spring-context-5.3.1.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\spring-aop\5.3.1\spring-aop-5.3.1.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\spring-beans\5.3.1\spring-beans-5.3.1.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\spring-expression\5.3.1\spring-expression-5.3.1.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.4.0\spring-boot-autoconfigure-2.4.0.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.4.0\spring-boot-starter-logging-2.4.0.jar;C:\Users\Shubham Singhal\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\Shubham Singhal\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\Shubham Singhal\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.13.3\log4j-to-slf4j-2.13.3.jar;C:\Users\Shubham Singhal\.m2\repository\org\apache\logging\log4j\log4j-api\2.13.3\log4j-api-2.13.3.jar;C:\Users\Shubham Singhal\.m2\repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;C:\Users\Shubham Singhal\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\spring-core\5.3.1\spring-core-5.3.1.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\spring-jcl\5.3.1\spring-jcl-5.3.1.jar;C:\Users\Shubham Singhal\.m2\repository\org\yaml\snakeyaml\1.27\snakeyaml-1.27.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\boot\spring-boot-devtools\2.4.0\spring-boot-devtools-2.4.0.jar;C:\Users\Shubham Singhal\.m2\repository\org\springframework\boot\spring-boot-configuration-processor\2.4.0\spring-boot-configuration-processor-2.4.0.jar;C:\Users\Shubham Singhal\.m2\repository\org\projectlombok\lombok\1.18.16\lombok-1.18.16.jar;C:\Users\Shubham Singhal\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar" com.shubham.techmojo.TechmojoApplication
{spring.web.resources.chain.cache=false, spring.web.resources.cache.period=0}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.0)

2020-12-04 14:48:34.728  INFO 17808 --- [  restartedMain] c.shubham.techmojo.TechmojoApplication   : Starting TechmojoApplication using Java 11.0.8 on LAPTOP-J6VK2O3D with PID 17808 (C:\Users\Shubham Singhal\Documents\GitHub\techmojo\target\classes started by ShubhamSinghal in C:\Users\Shubham Singhal\Documents\GitHub\techmojo)
2020-12-04 14:48:34.730  INFO 17808 --- [  restartedMain] c.shubham.techmojo.TechmojoApplication   : No active profile set, falling back to default profiles: default
2020-12-04 14:48:34.760  INFO 17808 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2020-12-04 14:48:35.128  INFO 17808 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2020-12-04 14:48:35.142  INFO 17808 --- [  restartedMain] c.shubham.techmojo.TechmojoApplication   : Started TechmojoApplication in 0.651 seconds (JVM running for 1.372)
Top 10 hashtags: 
#instacool : 1
#anotherhashtag : 1
#likeforlike : 1
#relax : 1
#festival : 1
#nature : 1
#love : 1
#anothertogether : 1
#aaa : 1

Top 10 hashtags: 
#shubham : 3
#singhal : 2
#instacool : 1
#anotherhashtag : 1
#likeforlike : 1
#relax : 1
#festival : 1
#nature : 1
#sachin : 1
#love : 1


Process finished with exit code 0
```
