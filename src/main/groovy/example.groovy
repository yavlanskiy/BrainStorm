import groovy.sql.Sql

import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodType
import java.net.URL
import java.net.URLClassLoader

def addUrlToClasspath(URL url) {
    MethodHandles.lookup().in(URLClassLoader.class).findStatic(
            URLClassLoader.class, "getSystemClassLoader", MethodType.methodType(URLClassLoader.class)
    ).invokeExact().addURL(url)
}

addUrlToClasspath(new URL("file:/var/lib/jenkins/libs/ojdbc8.jar"))


def sql = Sql.newInstance("jdbc:oracle:thin:@qarep:1521:rep", "csqa", "c67")
def result = sql.rows("SELECT VERSION FROM VERSIONLIST")
result.each { row ->
    println row
}
sql.close()
