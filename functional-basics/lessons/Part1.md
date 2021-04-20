# Part 1
Wir wollen ein selbstfahrendes Auto programmieren.

- Das Fahrzeug soll vorwärts, links, rechts fahren und angehalten werden können
- Das Fahrzeug soll gestartet werden können
- Das Fahrzeug soll ausgeschaltet werden können
- Das Fahrzeug soll ein- und ausparken können
- Ich möchte, dass mein Auto eine Fahrt unternimmt:
  - starten (Motor)
  - ausparken
  - Geradeaus
  - Links
  - Rechts
  - anhalten
  - einparken
  - stoppen

Wir wollen, dass unser Fahrzeug eine Steuerung besitzt. Die Bewegungssteuerung soll also
nicht im Fahrzeug selbst, sondern als eigene Klasse implementiert werden.

Dies hat den Vorteil, dass wir die Funktionen des Fahrzeugs wie zum Beispiel "Fahren" und die eigentliche Bewegungssteuerung trennen können.


*Tipp: Verwende eine Fluent-API, also verzichte auf void Methoden und gib das Objekt zurück, welches als nächstes im Flow 
verwendet werden soll.*