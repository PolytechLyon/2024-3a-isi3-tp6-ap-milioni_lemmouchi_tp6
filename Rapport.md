# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : Axel MILIONI

## Exercices 1

Ce patron illustre le patron de conception "Composite". 
MobileObject est l'interface Component du patron de conception Composite. Cette interface définit l'interface pour les objets dans la composition et permet d'accéder aux propriétés communes comme la vitesse (velocity) et la masse (mass).
La relation entre Vehicle et MobileObject indique que Vehicle implémente l'interface MobileObject et peut également avoir une liste de MobileObject, qui sont ses composants.

Nous ne devons pas récrire la méthode getVelocity() et getMass()

## Exercices 2

La méthode getVelocity() utilise un patron de conception Iterator pour parcourir la collection d'objets components de Vehicle. Ce patron permet de parcourir une collection sans exposer ses détails d'implémentation sous-jacents (par exemple, si components est un HashSet, une ArrayList, etc.).

et donc nous n'avons pas besoin de la réalisation de la méthode getVelocity().


## Exercices 3

Pour mettre en œuvre le Singleton dans Clock : il faut rendre le constructeur privé, ajouter un champ statique privé pour conserver l'unique instance, et fournir une méthode statique publique getInstance() pour obtenir cette instance

## Exercices 4

Non, les classes Bike et Wheel ne sont pas dans le même paquetage.
La dépendance est que Wheel a besoin de Bike pour calculer la vitesse, car elle utilise la fonctionnalité getPush() de Bike
Oui, il y a déjà une abstraction : Vehicle implémente getPush() et se trouve dans le paquetage fr.polytech.sim.transport, qui est le même que celui de Wheel

## Exercices 5

## Exercices 6

## Exercices 7

## Exercices 8


