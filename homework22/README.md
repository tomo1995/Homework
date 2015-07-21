TASK 1

Napraviti klasu LinkedListBoolean koja predstavlja LinkedList-u Boolean tipa. Klasa sadrzi 

link na prvi element liste. Metode koje lista mora imati su:

 add(Boolean b) – Doda element u listu

 remove(Boolean b) – Obrise prvi element liste koji jednak datom parametru

 remove(int index, Boolean b) – Slicno prethodnoj, samo sto gleda poslije datog indeksa

 contains(Boolean b) – Vraca true ako dati parametar postoji u listi, false u suprotnom

 isAlternating() – Vraca true ako poslije svakog true dolazi false, a poslije false true

TASK 2

Napraviti klasu UniqueStackInt koja predstavlja Stack Integer tipa, ali takav da ne postoje 

duplikati u strukturi podataka, tj. nemoguce je imati dva ista broja. Metode koje stack ima su:

 push(Integer i) – Doda element na stack

 pop() – Izbacuje prvi element sa stacka

 isIncreasing() – Vraca true ako se elementi povecavaju kako se ide prema dnu 

TASK 3

Napraviti listu brojeva. Koristeci samo ListIterator modifikovati listu da uradi sljedece:

 Prva dva elementa liste prave treci pomocu zbira

 Prva dva elementa se brisu

 Treci ulazi u listu

Ako je data lista 2, 4, 3, 5, 2, 9, 2 onda je dobijena lista 6, 8, 11, 2.

TASK 4

Napraviti mapu tako da jedan cijeli broj odgovara listi brojeva. Broj 1 odgovara listi brojeva 

{1, 2, 3, 4, 5, 6, . . .}, broj 2 odgovara listi {1, 3, 5, 7, 9, . . .}, broj 3 odgovara listi {1, 4, 7, 10, 13, . . .}, itd. 

Korisnik unosi granicu dokle idu brojevi u listi i unosi i granicu dokle kljucevi idu.