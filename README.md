echo # karatetest - API


`mvn clean test -Dtest=DemoRunner`

        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>
        </plugins>
        
        
        <testResources>
            <testResource>
                <directory>src/test/java</directory>
                <excludes>
                    <exclude>**/*.java</exclude>
                </excludes>
            </testResource>
        </testResources>
        
        
        
        https://github.com/damianszczepanik/cucumber-reporting
        https://www.coder.work/article/874426
        
        
        