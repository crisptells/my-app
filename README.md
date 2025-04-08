POC

#Technologies
- Project built with Maven (https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- Kommunikation läuft mit java.net -> nicht mit ZeroMQ wie in der Aufgabenstellung! Müsstet ihr anpassen!

# First example is just a Echo Client / Server 
For a baseline understanding of communication inbetween client and server
Do the following to try it out:
1. Run Portscanner class once -> see no server at port 7
2. Start EchoServer 
3. Run Portscanner again -> see a server at port 7 (this is the EchoServer)
4. Start EchoClient
5. Type something in the console -> see the same thing getting returned from the server in the console
6. Type stop! to stop the EchoServer (or do it manually)


# Reisebroker - Portfolioaufgabe
Ich denke ihr könnt das prinzip vom Echo Client / Server einfach ausbauen. D.h. ihr könnt den EchoServer zum TravelBroker (Middleware) machen, der erstmal die booking requests vom BookingService (EchoClient) entgegennimmt. Dann würde ich noch eine neue Klasse (z.B. HotelServer) erstellen die erstmal aussieht wie der EchoServer. 

Vom gundlegenden Ablauf her wäre es dann so -> 
1. BookingService schickt booking request zum TravelBroker
2. TravelBroker schickt booking request weiter zum HotelServer
3. HotelServer checkt ob die buchung erfolgreich ist -> Speichert die -> schickt antwort zum TravelBroker
4. TravelBroker schickt antwort zum BookingService
