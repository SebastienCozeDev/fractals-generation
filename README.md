# Autour des Fractales

## Description

Ce projet fournit une implantation de base pour votre projet de SAÉ S3.A.01.
Pour pouvoir développer votre propre implantation de ce projet, vous devez
en créer une **divergence** en cliquant sur le bouton `Fork` en haut à droite
de cette page.

Lorsque ce sera fait, vous pourrez inviter les membres de votre groupe en tant
que *Developer* pour vous permettre de travailler ensemble sur ce projet.

## Exécution

Pour exécuter l'application, vous pouvez exécuter la tâche `run` de *Gradle*.
Afin de vous permettre de facilement contrôler la création des fractales depuis
la ligne de commande, la classe `fr.univartois.butinfo.fractals.Fractals` (qui
définit la méthode `main`) gère déjà pour vous les arguments de cette ligne
de commande (les options données sont stockées dans les attributs de cette
classe).
Vous pouvez en particulier l'exécuter à l'aide des options suivantes :

```
-f,--fractal-name  <name>      Spécifie le nom de la fractale à générer.
-h,--height        <pixels>    Spécifie la hauteur de l'image à générer.
-n,--nb-iterations <integer>   Spécifie le nombre d'itérations à appliquer pour générer la fractale.
-o,--output        <file>      Spécifie le nom du fichier dans lequel la fractale doit être sauvegardée.
-p,--palette-name  <name>      Spécifie le nom de la palette de couleurs à appliquer lors de la génération.
-s,--scale         <ratio>     Spécifie l'échelle à appliquer sur l'image.
-w,--width         <pixels>    Spécifie la largeur de l'image à générer.
-x,--focus-x       <real>      Spécifie le point central de l'image sur l'axe des abscisses.
-y,--focus-y       <real>      Spécifie le point central de l'image sur l'axe des ordonnées.
```

Évidemment, vous devrez compléter la classe `Fractals` pour qu'il se passe
quelque chose lors de l'exécution !

## JAR exécutable

Vous avez également la possibilité de générer un JAR à l'aide de *Gradle*, en
exécutant la tâche `jar`.
Ce JAR constitue un exécutable que vous pouvez facilement distribuer, et que
vous pouvez exécuter de la manière suivante :

```bash
java -jar build/libs/sae-2022-2023.jar --help
```

Les options acceptées par ce JAR sont les mêmes que celles décrites dans la
section précédente.

## To do 
- Le code source de votre bibliothèque sur GitLab, dont vous déposerez le lien sur Moodle.
- Le diagramme de classes de votre application, à la racine de votre dépôt GitLab, idéalement en
intégrant dans le README de votre projet un diagramme PlantUML.
- Différents scripts permettant d’exécuter votre application, que vous ajouterez dans un répertoire
scripts à la racine de votre dépôt GitLab (voir la section dédiée plus loin).
- Un rapport (au format Markdown) décrivant le travail réalisé par chacun, ainsi que la justification
du choix des patrons de conception et des structures de données utilisées. Vous y indiquerez
également en quoi les différentes ressources de votre formation vous ont aidés à réaliser ce
projet, et les difficultés que vous avez rencontrées pendant son développement. Ce rapport
devra également être ajouté à la racine de votre dépôt GitLab.

## Diagramme UML

```plantuml
@startuml

package fr.univartois.butinfo.fractals {
    class Fractals
}

class Fractals {
    - help : boolean
    - width : int
    - height : int
    - foxusX : double
    - foxusY : double
    - fractaleName : String
    - nbIterations : int
    - paletteName : String
    - outputFile : String
    - classParser : ClasseParser<Fractals>
    - Fractals()

    + parseCliArguments(String[]) 
    + usage() : void 
    + buildFractals() : void 
    + main(String[])
}
package fr.univartois.butinfo.fractals.complex {
    class Complex
    interface IComplex
    class ComplexPlan
    class ComplexPlanTranslationDecorator
    class ComplexPlanZoomDecorator
    interface IComplexPlan
    class AdaptateurComplex
    interface IPlanPoint
}

class AdaptateurComplex implements IPlanPoint {
      - complex :IComplex   

      + X() : double
      + Y() : double
      + distance(IPlanPoint) : double
      + convertirEnIComplex() : IComplex
}
interface IPlanPoint {
      + X() : double
      + Y() : double
      + distance(IPlanPoint) : double
      + convertirEnIComplex() : IComplex
}
class Complex implements IComplex {
    - re : double
    - im : double 

    + Complexe(double,double)
    + getImaginaryPart() : double
    + abs() : double
    + negate() : IComplex
    + conjugate() : IComplex
    + add(IComplex) : IComplex
    + subtract(IComplex) : IComplex
    + multiply(double) : IComplex
    + multiply(IComplex) : IComplex
    + divide(IComplex) : IComplex
    + equals(Object) : boolean
    + hasCode() : int 
    + toString() : String
}

interface IComplex {
    + getRealPart() : double
    + getImaginaryPart() : double 
    + abs() : double
    + negate() : IComplex
    + conjugate() : IComplex
    + add(IComplex) : IComplex
    + subtract(IComplex) : IComplex
    + multiply(double) : IComplex
    + multiply(IComplex) : IComplex
    + divide(IComplex) : IComplex
}
interface IComplexPlan{
   +  asComplex(IComplex) : IComplex;
}
class ComplexPlanZoomDecorator implements IComplexPlan {
    + constant : double

    + ComplexPlanZoomDecorator(double)
    + asComplex(IComplex) : IComplex;
}
class ComplexPlanTranslationDecorator implements IComplexPlan {
    + constant : double

    + ComplexPlanTranslationDecorator(double)
    + asComplex(IComplex) : IComplex;
}
class ComplexPlan {
     + decorated : IComplexPlan
     + height : int
     + width : int
   
     +ComplexPlanTranslationDecorator(double,double,height,width)
     + asComplex(IComplex) : IComplex
}

package fr.univartois.butinfo.fractals.color {
    class ColorPalette
    interface IColorPaletteStrategy
  abstract class MaskColorPaletteDecorator
}

class  ColorPalette {
    + ITERATION_NUMBER_MAX : int
    + colorPaletteStrategy : IColorPaletteStrategy

    + ColorPalette(int) 
    + getColor(int) : Color
}
interface IColorPaletteStrategy {
    + getColor(int,int) : Color
}
abstract class MaskColorPaletteDecorator implements IColorPaletteStrategy{
   + decorated : decorated

   + MaskColorPaletteDecorator(IColorPaletteStrategy)
   +  {abstract} getColor(int, int) : Color
}
package fr.univartois.butinfo.fractals.color.strategies {
          class BlueColorPaletteStrategy
          class GrayColorPaletteStrategy
          class GreenColorPaletteStrategy
          class RedColorPaletteStrategy
}
 class BlueColorPaletteStrategy implements IColorPaletteStrategy
{
     + {final} TINT_MAX : int
     + getColor(int, int) : Color
}
class GrayColorPaletteStrategy implements IColorPaletteStrategy
{
     + {final} TINT_MAX : int
     + getColor(int, int) : Color
}
class GreenColorPaletteStrategy implements IColorPaletteStrategy
{
     + {final} TINT_MAX : int
     + getColor(int, int) : Color
}
class RedColorPaletteStrategy implements IColorPaletteStrategy
{
     + {final} TINT_MAX : int
     + getColor(int, int) : Color
}
package fr.univartois.butinfo.fractals.color.decorators {
          class OnlyBlueDecorator
          class OnlyRedDecorator
           class OnlyGreenDecorator
}

class OnlyBlueDecorator extends MaskColorPaletteDecorator {
   
    +  OnlyBlueDecorator(IColorPaletteStrategy)
    +  getColor(int, int) : Color
}
class OnlyGreenDecorator extends MaskColorPaletteDecorator {
   
    +  OnlyGreenDecorator(IColorPaletteStrategy)
    +  getColor(int, int) : Color
}
class OnlyRedDecorator extends MaskColorPaletteDecorator {
   
    +  OnlyRedDecorator(IColorPaletteStrategy)
    +  getColor(int, int) : Color
}

package fr.univartois.butinfo.fractals.image {
    class Pixel
    interface IFractalImage
    class BufferedImageAdaptor
    class FractalImage
    class FractalImageBuilder
}
class FractalImageBuilder {
     + height : int
     + width : int
     + scale : int
     + centralPoint : Pixel
     + sequence : Sequence
     + colorPalette : ColorPalette
     + file : String
     + FractalImageBuilder

     + {static} FractalImageBuilder()
     + getHeight : int
     + FractalImageBuilder withHeight(height)
     + getWidth() : int
     + getScale() : int
     + getCentralPoint() :Pixel
     + getSequence() : Sequence
     + withCentralPoint(Pixel) : FractalImageBuilder
     + withSequence(Sequence) : FractalImageBuilder
     + getColorPalette() : ColorPalette
     + withColorPalette(ColorPalette) : FractalImageBuilder
     + getFile() : String
     + withFile(String) : FractalImageBuilder
     + build() : FractalImageFractalImage
}
class FractalImage {
     + height : int
     + width : int
     + scale : int
     + centralPoint : Pixel
     + sequence : Sequence
     + colorPalette : ColorPalette
     + file : String

     + FractalImage(FractalImageBuilder)
     + createImage(maxIteration) : void
}
class BufferedImageAdaptor implements IFractalImage {
    + bufferedimage : BufferedImage
    + pixel : Pixel
   
    + BufferedImageAdaptor(BufferedImage)
    + getHeight() : int
    + getWidt() : int
    + getPixel(row,column) : int
    + saveAs(String) : void
    + setColor(Color,row;column) : void
}
class Pixel {
    - image : IFractalImage
    - row : int
    - column : int

    + Pixel(IFractalImage,row,column)
    + getRow() : int
    + getColumn() : int
    + getImage() : IFractalImage
    + setColor(Color) : void
}

interface IFractalImage{
    + getHeight() : int
    + getWidt() : int
    + getPixel(row,column) : int
    + saveAs(String) : void
    + setColor(Color,row;column) : void
}
Pixel o-- "1" IFractalImage
FractalImage o-- "1" Sequence
FractalImageBuilder o-- "1" Sequence
BufferedImageAdaptor o-- "1" Pixel

package fr.univartois.butinfo.fractals.sequences{
    interface INextTerm
    class Sequence
    class SequenceIterator
    class JuliaGeneralizationNextTerm
    class JuliaNextTerm
    class MandelbrotGeneralizationNextTermx
    class MandelbrotNextTerm
}
class JuliaGeneralizationNextTerm implements INextTerm{
     + firstTerm : IComplex
     + presentTerm : IComplex
     + z : IComplex
     + c : IComplex
     + binaryOperator : BinaryOperator<IComplex>

     + JuliaGeneralizationNextTerm(IComplex,IComplex, BinaryOperator<IComplex>)
     + calculateNextTerm(IComplex) : IComplex
     + setFirstTerm(IComplex) : void
     + setPresentTerm(IComplex) : void
}
class JuliaNextTerm implements INextTerm {
       + firstTerm : IComplex
       + presentTerm : IComplex
       + z : IComplex
       + c : IComplex
    
       + JuliaNextTerm(IComplex,IComplex)
       + calculateNextTerm(IComplex) : IComplex
       + setFirstTerm(IComplex) : void
       + setPresentTerm(IComplex) : void
}
class MandelbrotGeneralizationNextTerm implements INextTerm {
       + firstTerm : IComplex
       + presentTerm : IComplex
       + z : IComplex
       + c : IComplex
       + binaryOperator : BinaryOperator<IComplex>

       +MandelbrotGeneralizationNextTerm(IComplex,IComplex, BinaryOperator<IComplex>)
       + calculateNextTerm(IComplex) : IComplex
       + setFirstTerm(IComplex) : void
       + setPresentTerm(IComplex) : void
}
class MandelbrotNextTerm implements INextTerm {
       + firstTerm : IComplex
       + presentTerm : IComplex
       + z : IComplex
       + c : IComplex

       + MandelbrotNextTerm (IComplex,IComplex)
       + calculateNextTerm(IComplex) : IComplex
       + setFirstTerm(IComplex) : void
       + setPresentTerm(IComplex) : void
}  
     
class Sequence  implements Iterable {
    + nextTerm : INextTerm
    + firstElement : IComplex
    + presentTerm : IComplex

    + Sequence(INextTerm,IComplex)
    + getPresentTerm() : IComplex
    + setPresnetTerm(IComplex) : void
    + toString() : String
    + iterator() : Iterator<IComplex>
    + getNextTerm() : INextTerm
    + getFirstTerm() : IComplex
    + setFirstTerm(IComplex) : void
}
interface INextTerm {
     + setFirstTerm(IComplex) : void
     + setPresentTerm(IComplex) : void
     + calculateNextTerm(IComplex) : IComplex
}
class SequenceIterator implements Iterator {
    + sequence : Sequence
   
    + SequenceIterator(Sequence)
    + hasNext() : boolean
    + next() : IComplex
}
SequenceIterator o-- "1" Sequence
SequenceIterator o-- "1" IComplex
Sequence o-- "1" IComplex

@enduml
```

## Rapport

### Les nombres complexes

__Implantation des opérations sur les nombres complexes__

Shahin s'est occupé de cette partie. Il n'a pas dû faire de choix.

Il a eu des difficultés pour la conception des différentes opérations.

__Implantation des opérations sur le plan complexe__

Shahin s'est occupé de cette partie. Il a choisi de faire la translation et le zoom à l'aide d'un *decorator* car il n'est pas obligatoire d'appliquer une translation ou un zoom. Il a aussi dû faire un adaptateur pour permettre de calculer la distance entre deux points et de convertir un point du plan en un objet de type `IComplex`.

C'est grâce à la formation qu'il a su choisir les patrons de conception. Plus précisement, le *design pattern*.

Enfin, il a eu des difficultés dans le conception des *decorators*.

### Suites complexes et fractales

__Généralités sur les suites__

Sébastien s'est occupé de cette partie. Pour la représentation de la suite, il a choisi de la faire à l'aide d'une *strategy* car elle permet de rendre interchangeables des algorithmes qui ont des rôles similaires. Effectivement, les suites sont toutes pareils, sauf au niveau du calcul du prochain terme. De plus, pour le parcours de la suite, il a décidé de le faire avec un *iterator* car il faut pouvoir passer du terme courant au terme suivant.

C'est grâce à la ressources de qualité de développement qu'il a pu identifier le patron de conception qu'il fallait utiliser.

Enfin, il a eu des difficultés à trouver le patron de conception. En effet, il pensais, au début, qu'il fallait faire un constructeur abstrait. Il a aussi eu des difficultés dans la conception de l'*iterator*.

__Ensembles de Julia__

Sébastien s'est occupé de cette partie. Il n'a pas du faire de choix.

__Ensemble de Mandelbrot__

Sébastien s'est occupé de cette partie. Il n'a pas du faire de choix.

__Ensemble de Julia et de Mandelbrot généralisés__

Sébastien s'est occupé de cette partie. Il n'a pas du faire de choix.

### Choix des couleurs

Théo et Sébastien se sont occupés de cette partie. Pour pouvoir représenter les différentes palettes de couleurs, ils ont choisi d'implémanter une *strategy*. Effectivement, plusieurs choix de palettes doivent être possible. Pour ce qui est du masque de couleurs, ils ont choisi de mettre un place un *decorator* car il ne faut pas forcément qu'un masque soit appliqué sur la palette.

C'est grâce à la ressource de qualité de développement que Théo et Sébastien ont pu faire ces choix.

Enfin, ils ont eu des difficultés à trouver le dernier patron de conception. Effectivement, ils pensaient, au début, qu'il fallait faire un *composite*.

### Suites chaotiques et diagrammes de bifurcation

__Suites chaotiques__

*Description*

__Diagramme de bifurcation__

*Description*

### Création d'images en Java

Théo s'est occupé de cette partie. Il a choisi, pour la manipulation des images, d'utiliser un *adaptator* pour permettre à des classes initialement incomptables de communiquer ensemble. Ici, on parle de l'interface `IFractalImage` et de la classe `BufferedImage`.

C'est grâce à la ressource de qualité de développement que Théo a pu faire ces choix.

### Génération des images

Sébastien s'est occupé de cette partie. Il a décidé de l'implémenter à l'aide d'un *builder* pour éviter qu'il n'y ait trop d'arguments dans le constructeur.

C'est grâce à la ressource de qualité de développement qu'il a pu faire ces choix. Plus spécifiquement, les deux diagrammes UML du cours.

Enfin, il a eu des difficultés à effectué cette partie. Effectivement, c'était la première fois qu'il faisait un *builder*.

### Figures et transformations géométriques

__Représentation des différentes figures__

Théo s'est occupé de cette partie. Il a fait un composite pour les figures car cela permet de traiter les différentes figures.

C'est grâce à la ressource de qualité de développement qu'il a pu déterminé le patron de conception qu'il fallait utiliser.

__Construction de fractales à partir de figures géométriques__

*Description*

__Quelques fractales à base de figures géométriques__

*Description*

__Génération des fractales__

*Description*

### Scripts de lancement pour votre application

__La classe principale__

Sébastien a réalisé cette partie. Il n'a pas dû faire de choix pour cette partie.

__Exécution de l'application__

*Description*

__Scripts de lancement__

*Description*

### Diagramme UML et rapport

Théo s'est occupé de mettre à jour, pour chaque jalon, le diagramme UML. De la même manière, Sébastien s'est occupé de mettre à jour le rapport.

### Description du travail réalisé et justifications.

*Lundi 24 octobre 2022.*

- Sébastien a réalisé la partie sur la généralités des suites. Il a décidé de le faire à l'aide d'une *strategy* car elle permet de rendre interchangeable des algorithmes qui ont des rôles similaires. Effectivement, les suites sont toutes pareils, sauf au niveau du calcul du prochain terme.
- Théo a réalisé la partie du choix des couleurs et a mis à jour le diagramme UML. Il a choisi a choisi de prendre une stratégie *strategy* pour gérer le choix des palettes. Il a choisi de faire un composite pour traiter les élément de la classe `java.awt.color`.
- Shahin a implémenter les opérations pour les nombres complexes.

*Mardi 25 octobre 2022.*

- Sébastien a implémenté l'ensemble de Julia et de Mandelbrot. Il a aussi implémenté les généralités pour ces deux ensembles. Il a tenté de faire la génération de l'image mais n'a pas réussi. Effectivement, la palette de couleur ne permet pas de récupérer une couleur pour un nombre réel.
- Théo a implémenté la création des images et a mis à jour le diagramme UML.
- Shahin a implémenté le code pour faire une relation entre l'image en pixel et les nombres complexe. Il a ensuite dû faire une translation à chacun des nombres complexes obtenus et aussi implémenté le code pour pouvoir zoomer.

### Justification de nos choix.

*Mardi 25 octobre 2022.*

Pour la création d'une image, Théo a décidé d'utiliser un adaptateur car cela permet à des classes initialement incompatibles de communiquer ensemble.

### Comment la formation nous a aidé ?

*Lundi 24 octobre 2022.*

Sébastien et Théo ont su faire le choix du patron de conception grâce à la ressource de qualité de développement

*Mardi 25 octobre 2022*

Nous avons su faire les différents choix des patrons de conception grâcé à la ressource de qualité de développement.

### Difficultés rencontrées

*Lundi 24 octobre 2022.**

- Sébastien a eu des difficultés à trouver le patron de conception. En effet, il pensait, au début, qu'il fallait faire un constructeur abstrait. Il a aussi eu des difficultés pour la création de l'Itérateur *Iterator*..- Théo a eu des difficultés à trouver les patron de conception. Effectivement, il ne pensait pas du tout à faire une stratégie *strategy* mais à faire un singleton ou un proxy.

*Mardi 25 octobre 2022.*

- Shahin a eu des difficultés dans l'implémentation des codes en utilisant le décorateur..