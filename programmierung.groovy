apply plugin: 'java'

sourceSets.main.java.srcDir('.')
sourceSets.test.java.srcDir('.')
sourceSets.main.output.classesDir('klassen')

repositories { mavenCentral(); }
dependencies {
  compile "junit:junit:4.12"
}

def java(String x, String i = "") {
  def arguments = x.split(" ")
  def t = arguments.tail() as List
  def ins = new ByteArrayInputStream(i.getBytes())
  new ByteArrayOutputStream().withStream { os ->
    javaexec {
      main = arguments.head()
      classpath = sourceSets.main.runtimeClasspath
      args = t
      standardOutput = os
      standardInput = ins
    }
    os.toString();
  }
}

ext {
  java = this.&java
}
