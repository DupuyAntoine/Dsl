# Projet DSL (compiler and interpreter)

## Organisation des projets

Le répertoire dsl contient le modèle de machine à états finis avec le fichier .ecore et le fichier .xmi utile à l'interpréteur.
Le répertoire org.sample.k3project.dsl contient les codes de l'interpréteur (sous la route org.sample.k3project.dsl/src/dsl/aspects/).
Le répertoire org.xtext.example.mydsl contient le fichier xtext MyDsl.xtext (sous la route org.xtext.example.mydsl/src/org/xtext/example/mydsl/) et le fichier xtend de génération MyDslGenerator.xtend (sous la route org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/).

## Notes pour utilisation

Il ne faut pas oublier de changer la route du fichier .xmi dans le fichier dslAspects.xtend du K3 Project, sans quoi l'interpréteur ne peut pas lire le fichier.
