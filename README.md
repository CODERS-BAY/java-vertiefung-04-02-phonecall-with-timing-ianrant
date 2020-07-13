# Java 

In dieser Übung geht es darum, ein functional interface zu deklarieren und durch Anwendung verschiedener Lambdas zu implementieren.

## Lambdas - call someone with timing

Implementiere ein funktionales Interface `Calling` welches eine Methode `void call()` hat. Schreibe Dann eine Methode in deiner Main Klasse `timeCalling` 
welches die Zeit eines solchen Anrufs misst und auf die Konsole schreibt. 
Schreibe dann in der Main Methode einige Verwendungen dieser Methode `timeCalling` in dem du ein Telefongespräch mit einem Freund, 
ein Telefongespräch mit deiner Mutter und ein Telefongespräch mit deiner Großmutter misst. Die Implementierungen sollten mit einer Lambda umgesetzt werden und 
die Funktionen enthalten lediglich einen call zu `Thread.sleep(n)` um die Dauer des Anrufs zu simulieren. 

Zum messen der Zeit kannst du dir einfach vor und nach dem Aufruf der Funktion mit `Instant.now()` die akutelle Zeit holen und die Differenz errechnen. 
Oder du verwendest die [Stopwatch](https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/time/StopWatch.html) aus der Apache commons library, 
dafür müsstest du allerdings eine [Gradle dependency](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.1) im build.gradle hinzufügen.

💡 Ein funktionales Interface ist ein Interface welches genau eine abstrakte Methode hat. 
Dieses Interface muss mit `@FunctionalInterface` annotiert werden. Ein funktionales Interface darf zusätzlich statische und default Methoden haben.

💡 Eine Annotation ist eine Art syntaktische Metainformation die zu Klassen, Methoden, Variablen, Parametern oder Packages hinzugefügt werden kann. 
Viele Frameworks verwenden Annotationen um einer Methode oder Klasse besonderes Verhalten hinzuzufügen.