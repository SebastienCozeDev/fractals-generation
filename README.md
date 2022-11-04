# Génération de fractales

## Description

Ce projet consiste en la création d'un programme en Java permettant de générer quelques fractales. 

- Version de Java : `17.0.4`
- Version de Gradle : `7.3.3`

## Exécution

### A partir des scripts bash

Vous pouvez générer des fractales à l'aide des différents scripts bash présent à la racine du projet. Chaque scripts créé un dossier au nom de la fractale comporte trois images au format `.PNG`. Ces trois images sont trois représentations de la fractale avec différents zooms. La syntaxe pour lancer le script est la suivante :

```sh
./script.sh -p <palette-name>
```

Les différents palettes possibles sont les suivantes :
- `Red` pour une palette de rouge.
- `Green` pour une palette de vert.
- `Blue` pour une palette de bleu.
- `Gray` pour une palette de gris.

Les différents scripts possibles sont les suivants :
- `julia.sh` qui génére la fractale issue de la suite imaginaire avec :
    - `z(0) = z**2 + c` où *z = -0,4 + 0,6i*
    - `z(n+1) = (z(n))**2 + c`
- `julia2.sh` qui génére la fractale issue de la suite imaginaire avec :
    - `z(0) = z**2 + c` où *z = 0,32 + 0,043i*
    - `z(n+1) = (z(n))**2 + c`
- `julia3.sh` qui génére la fractale issue de la suite imaginaire avec :
    - `z(0) = z**2 + c` où *z = -0,0986 - 0,65186i*
    - `z(n+1) = (z(n))**2 + c`
- `julia4.sh` qui génére la fractale issue de la suite imaginaire avec :
    - `z(0) = z**2 + c` où *z = -0,772691322542185 + 0.124281466072787*
    - `z(n+1) = (z(n))**2 + c`
- `general-julia.sh` qui génére la fractale généralisée de Mandelbrot avec :
    - `z(x) = (x**2 + z)/(x**2 + c)`
- `mandelbrot.sh` qui génére la fractale de Mandelbrot.

__Exemple d'exécution :__

```sh
./julia3.sh -p Green
```

On aura, dans le dossier `julia3` les images suivantes :

![Julia3-0](/readme-img/julia3-0.png)

![Julia3-1](/readme-img/julia3-1.png)

![Julia3-2](/readme-img/julia3-2.png)

### A partir du JAR exécutable

Vous pouvez aussi générer des fractales à l'aide du JAR exécutable présent à la racine du projet. Vous pouvez en particulier l'exécuter à l'aide des paramètres suivantes :

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

Vous pouvez aussi exécuter `java -jar fractales-base.jar --help` pour obtenir l'ensemble de ces paramètres.

__Exemples d'utilisation :__

```bash
java -jar fractales-base.jar -f Mandelbrot -h 2048 -n 200 -o mandelbrot-it-200.png -p Blue -s 0.002048 -w 2048 -x 0 -y 0
```
On aura cette image :

![Mandelbrot-it-200](/readme-img/mandelbrot-it-200.png)

```bash
java -jar fractales-base.jar -f Mandelbrot -h 2048 -n 50 -o mandelbrot-it-50.png -p Green -s 0.002048 -w 2048 -x 0 -y 0
```
On aura cette image :

![Mandelbrot-it-200](/readme-img/mandelbrot-it-50.png)

## Diagramme UML

![Diagramme-UML](/readme-img/UML_diagram.png)
