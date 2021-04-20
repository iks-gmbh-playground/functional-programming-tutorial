# Part 3 - Java Functional Interfaces
Die Route, die wir als Interface angelegt haben, ist im Grunde genommen so etwas wie ein FunctionalInterface, wenn sie nur
diese eine Methode (starten) vorgibt. Dies kann auch mit @FunctionalInterface kenntlich gemacht werden.

Manchmal kann es sinnvoll sein, direkt mit den Java's Functional Interfaces zu arbeiten.
Dadurch können wir uns sogar das gesamte Routenpackage sparen, denn: Diese bestehen sowieso nur aus 
der Steuerung und dem Fahrzeug und beinhalten immer einen Übergabeparameter und einen Return-Wert.

Ein FunctionalInterfaces besteht aus genau einer zu implementierenden Methode und kann dadurch in Lambdas verwendet werden.
Dort wird nämlich immer eine Implementierung eben dieser einen Methode verwendet.

### Aufgabe
Refactore den Code, sodass die Route nicht mehr benötigt wird und stattdessen ein FunctionalInterface verwendet wird