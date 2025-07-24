

<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/index.adoc ===== -->

# Java
Universo Santa Tecla <USantaTecla@gmail.com>
:toc-title: Índice
:toc: left

:idprefix:
:idseparator: -
:imagesdir: images

[cols="60,40"]
|===

^.^a|
image:sintesis.png[]
^.^a|
image:java.jpg[width=250, height=330]
|===

[CAUTION]
Códigos disponibles en link:https://github.com/USantaTecla-tech-java[git]

include::ust1_why.adoc[]
include::ust2_what.adoc[]
include::ust3_what_for.adoc[]
include::ust4_how/ust0_index.adoc[]
include::ust5_synthesis.adoc[]
include::ust6_bibliography.adoc[]
include::ust7_speaker.adoc[]





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust1_why.adoc ===== -->

## *¿Por qué?*

[plantuml, contexto, svg]
....
skinparam ActivityBarColor #white
skinparam titleBorderColor #222222
skinparam titleBackgroundColor #222222
skinparam titlefontColor #orange
skinparam titleFontStyle bold
skinparam titleFontSize 30
    
skinparam handwritten true
skinparam shadowing false
skinparam backgroundColor #222222
skinparam padding 3
skinparam StateStartColor #white
skinparam StateEndColor #white

skinparam note {
    backgroundColor #222222
    borderColor #white
    FontColor #white
    fontSize 20
}

skinparam class {
    fontColor #white
    fontColor<<¿Dónde?>> #cyan
    fontColor<<¿Cuándo?>> #cyan
    fontColor<<¿Por qué?>> #red
    fontColor<<¿Quién?>> #green
    fontColor<<¿Qué?>> #orange
    fontColor<<¿Para qué?>> #green
    StereotypeFontColor #white
    fontStyle bold
    arrowColor #white
    backgroundColor #222222
    borderColor #white
    circleCharacterFontName #white
    fontSize 20
}

hide circle
hide members

title Java

class donde as "Sun\nMicrosystems" <<¿Dónde?>>
note left
<color:cyan>Fabricante de hardware</color>
<color:cyan>y desarrollo de software</color>
<color:cyan>Pionero de Sillycon Valley</color>
end note

class cuando as "1991" <<¿Cuándo?>>
note right
<color:cyan>Coincidiendo con</color>
<color:cyan>la World Wide Web</color>
end note

class por as "Dependencia de\nla plataforma" <<¿Por qué?>>
note left
<color:red>Un programa compilado en</color>
<color:red>una máquina con un sitema operativo,</color>
<color:red>no funcionará ejecutado sobre </color>
<color:red>otro sistema operativo</color>
end note

class quien as "James Gosling" <<¿Quién?>>
note right
<color:green>Doctor/Desarrollador</color>
<color:green>en SunMicrosystem, Google</color>
<color:green>Medalla John von Neumann, IEEE</color>
end note

class que as "Java" <<¿Qué?>>
note left
<color:green>Primero llamado Oak, Green finalemente Java</color>
<color:green>Plataforma con intérprete, biblioteca y lenguaje</color>
<color:green>fuertemente tipado, imperativo, </color>
<color:green>orientado a objetos cob clases y concurrente</color>
<color:green>Ámbito general: web, sistemas, ... </color>

end note

class para as "Independencia de\nla Plataforma" <<¿Para qué?>>
note right
<color:green>un único desarrollo vale para</color>
<color:green>ejecutar la aplicación independientemente</color>
<color:green>del sistema operativo de la máquina</color>
end note

class como as "Descripción" <<¿Cómo?>>

por -up-> cuando
por -up-> donde

quien -up-> cuando
quien -up-> donde
quien -up-> por

que -up-> quien

para -up-> que

como -up-> que
como -up-> para
....

[cols="25,25,25,25", options="header"]
|===

2+a| [red]#Lenguajes Compilados#
2+a| [green]#Lenguajes Interpretados#

2+a|
[plantuml, compilador, svg]
....
node machine as "machine X" {

component compiler as "compiler XA"
file text as "prog.ext" <<highLevelCode>>
component exe as "prog.exe" <<binaryCode X>>

compiler -down-> text
compiler -down-> exe

}

node machine2 as "machine Y" {

component exe2 as "prog.exe" <<binaryCode X>> #red


}
....

2+a|
[plantuml, interprete, svg]
.....
node machine as "machine X" {

component interprete as "interprete XA"
file in as "prog.ext" <<code>>

interprete -down-> in


}

node machine2 as "machine Y" {

component interprete2 as "interprete YA" 
file in2 as "prog.ext" <<code>>

interprete2 -down-> in2


}
....

a| 
- Máquina X
[source, xxx]
....
>compiladorXA prog.ext
>prog.exe
....

a|
- Máquina Y
[source, xxx]
....
>prog.exe 
ERROR!!!
....

a|
- Máquina X
[source, xxx]
....
>interpreteXA prog.ext
....
a|
- Máquina Y
[source, xxx]
....
>interpreteYA prog.ext
....

2+a| - soluciones [red]*sin portabilidad* y [green]*rápida ejecución* (sin análisis)

2+a| - soluciones [green]*con portabilidad* y [red]*lenta ejecución* (con análisis)
|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust2_what.adoc ===== -->

## *¿Qué?*

[cols="25,45,35", options="header"]
|===

3+^.^a| [blue]*Plataforma de Desarrollo* de _Sun MicroSystems_ y _Oracle_

a|
* link:http://www.oracle.com/technetwork/java[El lenguaje de programación Java]
** sencillo
** fuertemente tipado
** imperativo
** secuencial/ concurrente
** orientado a objetos con clases

a| 
* [blue]#Biblioteca estándar#, _Application Programming Interface_ (*API*)
** Conjunto de utilidades predefinidas que permiten desarrollar
aplicaciones y comunicarse con el sistema operativo
** Ej. Gestión de Ficheros, Conexiones de Red, Estructuras de Datos,
Expresiones Regulares, Bases de Datos

a|
* [blue]#Intérprete#, _Java Virtual Machine_, (*JVM*)
** Programa que ejecuta programas escritos en Java
** Existe una máquina virtual por sistema operativo y procesador
** Permite que el mismo programa Java pueda ejecutarse en
cualquier sistema operativo

|===

[cols="50,50"]
|===

.2+a|
image:plataforma0.svg[]
[source, xxx]
....
>javac prog.java
>java prog.class
....
- compilación _Just in Time_: compila el bytecode a código nativo en tiempo de ejecución y luego ejecuta, evitando el re-análisis del _bytescode_ cada vez

a|
image::plataforma1.png[]
a|
image::plataforma2.webp[]

|===

[cols="35,65"]
|===

a|
image::JavaFeatures.png[]
a|
image::HistoryOfJava.jpg[]

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust3_what_for.adoc ===== -->

## *¿Para qué?*

[cols="50,50"]
|===

a|
- *__Java Standard Edition__* (_Java SE_)
*  versión usada en ordenadores personales
- *__Java Enterprise Edition__* (_Java EE_)
* Define un conjunto de librerías para el desarrollo de aplicaciones web
* Necesita Java SE para ejecutarse
- *__Java Micro Edition__* (_Java ME_)
* Entorno para desarrollar aplicaciones en dispositivos con recursos limitados como dispositivos móviles, software empotrado en electrodomésticos, etc

a|
image::plataforma4.png[]

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust0_index.adoc ===== -->

## *¿Cómo?*

[cols="20,60,20", options="header"]
|===

a| Multi-paradigma
a| Elementos de Programación
a| _Capacitación_

a| [blue]*Programación Imperativa*
a| 
* la gestión de datos con *valores de tipos primitivos* 
* evaluacion de *expresiones de su jerarquía de operadores*
* la sentencia de *asignación, entrada y salida*
a| - _"pequeñísimo" programa secuencial_

a| [blue]*Programación Estructurada*
a| 
* las sentencias *secuencial, alternativas e iterativas* sobre datos primitivos
* y sobre datos compuestos en *colecciones homogéneas*, _**array**_
a| - _cualquier "pequeño" programa_ 

a| [blue]*Programación basada en Objetos*
a|
* la organización/estructuración/modularización del código con *clases*, nueva unidad (compuesto de datos y funciones) 
a| - _"mediano/gran" programa organizado en objetos_

a| [blue]*Programación Orientada a Objetos*
a|
* gestionar las relaciones de *herencia* para la clasificación
a| - _"mediano/gran" programa organizado en objetos_

a| [blue]*Programación Modular*
a|
* la organización/estructuración/modularización del código con *paquetes*, nueva unidad (compuesto de clases, ...)
* *Exportación e importación de paquetes*
a| - _"grandísimo" programa organizado en módulos_

a| [blue]*Programación con Excepciones*
a|
* gestión de *fallos, defecto y errores lógicos o excepcionales* frente a las *aserciones*
* *sentencia __try/catch/finally__*
a| - _programa con tratamiento de errores excepcionales_

a| [blue]*Programación Parametrizada*
a|
* *Plantilla y encarnación*
a| - _programa con clases parametrizadas en tipos_

a| [blue]*Programación Recursiva*
a|
* *Listas, Árboles, ...*
a| - _programa con clases recursivas_

a| [blue]*Programación Orientada a Procesos*
a|
* *Funciones __lambda__, flujos, __Optional__, ...*
a| - _programa con inmutabilidad_

a| [blue]*Programación Concurrente*
a|
* *_Threads_, Fibras, _CompletableFuture_, ...*
a| - _programa con varios flujos de ejecución_

a| [blue]*Programación Reactiva*
a|
* *_Reactor_, ...*
a| - _programa asíncrono no bloqueante con flujos de eventos_

|===

include::ust0_program/ust0_index.adoc[]
include::ust1_imperative/ust0_index.adoc[]
include::ust2_structured/ust0_index.adoc[]
include::ust4_object_based/ust0_index.adoc[]
include::ust5_object_oriented/ust0_index.adoc[]
include::ust6_modular/ust0_index.adoc[]
include::ust7_exceptions/ust0_index.adoc[]
include::ust8_parametrized/ust0_index.adoc[]
include::ust3_process_oriented/ust0_index.adoc[]
//include::ust9_recursive/ust0_index.adoc[]
//include::ust10_functional/ust0_index.adoc[]
//include::ust11_streams/ust0_index.adoc[]
//include::ust12_concurrent/ust0_index.adoc[]
//include::ust13_metaprogramming/ust0_index.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust0_program/diagramaItinerario.adoc ===== -->

[plantuml, como, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor<<a>> #DC143C
    BorderColor<<b>> #228B22
    BorderColor<<c>> #DarkGrey
    BorderColor<<d>> #1E90FF
    BorderColor<<e>> #FFFFFF
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor<<a>> #DC143C
    FontColor<<b>> #228B22
    FontColor<<c>> #DarkGrey
    FontColor<<d>> #1E90FF
    FontColor<<e>> #FFFFFF
}
skinparam package {
    BorderThickness 3
    BorderColor #white
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #white
}
hide members

class Program <<e>>
class Package <<e>>
class Class <<e>>
class Enum <<e>>
class Method <<e>>
class Sentence <<e>>
class Expression <<e>>
class Operator <<e>>
class Data <<e>>
class Object <<e>>
class Exception <<e>>
class Variable <<e>>{
constante: boolean
}
class Clasificador <<e>>
class PrimitiveType <<e>>

Program *-down-> "+" Package
Package *-down-> "*" Package
Package *-down-> "*" Class
Class *-down-> "*" Class : anidada
Class *-down-> "*" Clasificador : dependecy
Class *-down-> "*" Data : atributte
Class *-down-> "+" Method
Class <\|-down- Enum
Method *-down-> "+" Sentence
Method *-down-> "*" Data : parameter
Method *-down-> "*" Data : local
Sentence *-down-> "+" Expression
Expression *-down-> "*" Operator
Expression *-down-> "+" Data : reference
Expression *-down-> "*" Method : invocation
Method ..> "?" Clasificador : return
Method ..> "*" Clasificador : parameter
Data <\|-down- Variable
Data <\|-down- Object
Object <\|-down- Exception
Operator ..> Data
Data --> Clasificador : estático
Clasificador <\|-down- Class
Clasificador <\|-down- PrimitiveType

....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust0_program/ust0_index.adoc ===== -->

## Programa

[cols="40,60"]
|===

a|
- Un [blue]*programa* se compone de [blue]*paquetes* que se componen de otros paquetes y [blue]*clases*, bajo el [red]*paradigma de la programación modular*
* cada clase reúne [blue]*atributos* presentes en todas sus instancias, que pueden ser de [blue]*tipo primitivo* o de alguna clase junto con sus [blue]*métodos*
* cada método reúne parámetros y un conjunto de sentencias:
* crear dato, [blue]*sentencias de declaración de variables/constantes*
* modificar datos, [blue]*sentencias de asignación*, [blue]*entrada* y [blue]*salida*
* eliminar datos, asociados a los [blue]*ámbitos* de los métodos
* consultar datos, mediante [blue]*referencias* desde las [blue]*expresiones*
- Las sentencias contienen [blue]*expresiones* que pueden ser 
* [blue]*expresiones simples* mediante la [blue]*mención* de los datos o [blue]*literales*
* [blue]*expresiones compuestas* mediante la combinación de [blue]*operadores*
a|
include::diagramaItinerario.adoc[]

a|
- Las sentencias pueden ser [blue]*compuestas*, bajo el [red]*paradigma de la programación estructurada*
* [blue]*sentencia secuencial*, para la creación de ámbitos anidados en el ámbito del progrma,
* [blue]*sentencia alternativa*, para alternar la ejecución de sentencias,
* [blue]*sentencia iterativa*, para repetir la ejecución de sentencias.
* [blue]*sentencias con excepciones*, para elevar, capturalas y delegarlas.

a|
- Los datos, [blue]*constantes* o [blue]*variables*, pueden ser de [blue]*tipo*
* [blue]*primitivo*, para átomos de información sin propiedades e inmutables 
* [blue]*array*, para colecciones compuestas de datos homogéneas
* [blue]*objetos*, para colecciones compuestas de datos heterogéneas bajo el [red]*paradigma de la programación orientada a objetos*


|===

// [cols="50,50"]
// |===

// a|
// image::ModeloSantaTecla.jpeg[]

// a|
// - [green]*Modelo*:
// * la ejecución de una programa genera un *pasillo* (_contexto de ejecución_, espacio/tiempo)
// ** este primer pasillo se denomina *global* (_cuerpo de una función anónima_)
// * que un *robot* (_control de flujo de información_) recorre desde el fondo hacia atrás
// * creando en su lateral izquierdo, bajo un gran *ventanal* (_anidación de ámbito léxico_), unos *tetraedros* (variables y constantes) 
// ** con *globos* (_valores_) con dibujos de datos simples e inmutables (_tipos primitivos_)
// ** con *cordeles* (_referencias_) a *plataformas* flotantes para compuestos hetergéneos (_objetos_) u homogeneos (_arrays_) que ...
// * siguiendo las *instrucciones* (_sentencias_) del *suelo* (_código_)
// * alternando e iterando según el *globo* (_valor_) resultante de 
// * una jeraquía de *tuberías* (_expresiones_) con entradas para varios globos (_variables, constantes_ y _literales_) 
// * cuando la espalda del robot alcanza tu nariz, [red]*desaparece* el pasillo (contexto de ejecución) 

// |===

[cols="50,50", options="header"]
|===

a| [blue]#Programa#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=* _<sentenciaSalida>_ 
* _<sentenciaSalida>_ [red]*::=* *console.writeln* *(* [red]*[* _<expresion>_ [red]*]* *)* *;* 
* _<expresion>_ [red]*::=* _<literal>_
* _<literal>_ [red]*::=* _<cadenaCaracteres>_ 
- [blue]*Semántica*:
* Se ejecutan secuencialmente de arriba a abajo todas las sentencias
- [red]_**Advertencia**:_
* _Las ocho primeras líneas y dos últimas se explilcarán en los sucesivos apartados de este documento!!!_
* _Todos los códigos deben ir acompañandos en carpeta "utils" el fichero:_ link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/utils/Console.java[utils/Console.java]

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a0_programa/v0/App.java[]
....

|===

[cols="45,55", options="header"]
|===

a| [blue]#Comentarios#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<comnetario>_ [red]*::=* *//* _<caracter>_ [red]#*# _<saltoLinea>_ 
* _<comnetario>_ [red]*::=* */* *** _<caracter>_ [red]#*# *** */* 
* Válidos entre la secuencia de valores, operadores, identificadores, ... [red]#nunca dentro de éstos!!!# 
* [red]#Invalidos si anidan dentro de comentarios del mismo o distinto tipo#
- [blue]*Semántica*:
* No se ejecutan los caracteres internos al comentraio
* [red]*No recomendados*, _clean code_

a|
[source, java]
....
include::../../../../../..//src/src/main/java/es/usantatecla/a0_itinerario/a0_programa/v1/App.java[]
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust0_index.adoc ===== -->

## Programación Imperativa

[cols="25,25,25,25", options="header"]
|===

a| [blue]#Tipos Primitivos#
a| [blue]#Sentencias simples#
a| [blue]#Operadores#
a| [blue]#Expresiones#

a| [blue]#Tipo **numericos**, valores y operadores aritméticos unarios y binarios#
a| [blue]#**Salida de datos** por consola#
a| [blue]#**Operadores de de bits**, unario y binarios#
a| [blue]#**Precedencia y asociatividad** de operadores#

a| [blue]#Tipo *__char__* y literales *__String__*, valores y operadores de concatenación#
a| [blue]#**Entrada de datos** por consola#
a| [blue]#Operadores y *conversión de tipos*#
a| [blue]#**Operador paréntesis**#

a| [blue]#Tipo **__boolean__**, valores y operadores lógicos unario y binarios#
a| [blue]#Sentencias de **declaración** de variables y constantes#
a| [blue]#**Operadores de ternario**#
a|

a| [blue]#**Operadores relacionales**, operadores de igualdad, desigualdad y ordenacion#
a| [blue]#**Sentencia de asignación**#
a| [blue]#**Operadores con efectos laterales**: acumulación e incremento/decremente y coma#
a|

|===

include::ust1_types/ust0_index.adoc[]
include::ust2_simple_sentences/ust0_index.adoc[]
include::ust3_operators/ust0_index.adoc[]
include::ust4_expressions/ust0_index.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/diagramaTiposPrimitivos.adoc ===== -->

[plantuml, 1-tiposPrimitivos-tiposPrimitivos, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
hide circle
hide stereotype
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor<<a>> #1E90FF
    BorderColor<<b>> #DC143C
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor<<a>> #1E90FF
    FontColor<<b>> #DC143C
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor<<a>> #1E90FF
    FontColor<<b>> #DC143C
}
skinparam legend {
    BorderThickness 1
    BorderColor #DarkGrey 
    backgroundColor #222222
    FontSize 15
    FontName courier
    FontStyle italic
    FontColor #DarkGrey 
}
legend
añadir + como concatenación!!!
end legend

abstract Tipo as "tipo" <<b>>
class "<b>number</b>" as number <<b>> {
valor decimal: 666, -1, 0.42, 
valor octal: 024
valor hexadecimal: 0x42
...
}
class "<b>string</b>" as string <<b>> {
valor: "cadena"
valor: 'cadena'
...
}
class "<b>boolean</b>" as boolean <<b>> {
valor: true
valor: false
}

Tipo <\|-down- string
Tipo <\|-down- number
Tipo <\|-down- boolean

class Operador <<a>>
class "operador\nrelacional" as OperadorRelacional <<a>> {
igualdad: ==, ===, !=
comparación: >, >=, <, <=
}
class "operador\naritmético" as OperadorAritmetico <<a>> {
unarios: +, -
multiplicativos: **, *, /, %
aditivos: +, -
}
class "operador\nlógico" as OperadorLogico <<a>> {
negación: !
conjunción: &&
disyunción: \|\|
}

Operador <\|-down- OperadorRelacional
Operador <\|-down- OperadorAritmetico
Operador <\|-down- OperadorLogico

OperadorRelacional -down-> "2" Tipo : in
OperadorRelacional -down-> boolean : out

OperadorAritmetico -down-> "1..2" number : in
OperadorAritmetico -down-> number : out

OperadorLogico -down-> "1..2" boolean : in
OperadorLogico -down-> boolean : out
....



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust0_index.adoc ===== -->

### Tipos Primitivos

[cols="50,50"]
|===

2+a|
image::tiposPrimitivos.svg[]
// abstract class Tipo 

// abstract class "<i>Numérico</i>" as number  {
// valor decimal: 666, -1, 0.42, 
// valor octal: 024
// valor hexadecimal: 0x42
// operador unarios: +, -
// operador binarios: +, -, *, /, %, ==, !=, >, >=, <, <=
// }

// abstract class "<i>Entero</i>" as entero  {
// }
// number <|-down- entero

// class "<b>byte</b>" as byte {
// min: -128
// max: 127
// }
// entero <|-down- byte

// class "<b>short</b>" as short {
// min: -32768
// max: 32767
// }
// entero <|-down- short

// class "<b>int</b>" as int {
// min: -2147483648
// max: 2147483647
// }
// entero <|-down- int

// class "<b>long</b>" as long {
// min: -922117036854775808
// max: 922117036854775807
// }
// entero <|-down- long

// abstract class "<i>Real</i>" as real  {
// }
// number <|-down- real

// class "<b>float</b>" as float  {
// min: +-3.40282347e+38
// max: +-1.40239846e-45
// }
// real <|-down- float

// class "<b>double</b>" as double  {
// min: +-1.79769313486231570e+308
// max: +-4.94065645841246544e-324
// }
// real <|-down- double


// class "<b>char</b>" as char  {
// min: /u0000
// max: /uFFFF
// operador binario: ==, !=, >, >=, <, <=
// }

// class "<b>String</b>" as string  {
// valor: "cadena de caracteres"
// ...
// }

// class "<b>boolean</b>" as boolean  {
// valor: true
// valor: false
// operador unario: !
// operador binario: &&, ||, ==, !=
// }

// Tipo <|-down- string
// Tipo <|-down- char
// Tipo <|-down- number
// Tipo <|-down- boolean

a|
- Un [blue]*Tipo* es un [blue]*conjunto de valores* que comparten un [blue]*conjunto de operadores*: 
* Los valores de tipo [blue]**numéricos** corresponden con los [blue]*números reales/decimales y enteros*
* Las valores de tipo [blue]_**char**_ y [blue]_**String**_ corresponden respectivamente con [blue]*un único caracter* (cualquier letra mayúscula o minúscula, dígito, signo de puntuación, caracter especial, ...) y con [blue]*cualquier secuencia de caracteres* (cualquier frase, párrafo, texto, ...)
* Los valores de tipo [blue]_**boolean**_ corresponden con la dualidad, sólo dos posibles valores, [blue]*cierto y falso*

a|
- [blue]*Operador* es una [blue]*función pura matemática* (correspondencia: a tal entrada de datos, corresponde tal salida de datos) con una notación simbólica:
* prefija (_<operador> <expresion>_): -x
* infija (_<exprsión> <operador> <expresion>_): x+1 
* sufija (_<expresión> <operador>_): x!
* La [blue]*notación nominal*: _funcion([red]**[**<parámetro>, <parametro>, ... [red]**]**)_ es propuesta por *Euler* para evitar la [red]#confusión de símbolos# arrastrados desde los sumerios: +,-,...,!,%,..., gradiente, derivada, integral, sumatorio, ... 
- Ciertos operadores ([blue]*asignación, incremento y decremento*) no son funciones puras puesto que tienen [red]*efectos laterales*

a|
image::tiposPrimitivos.svg[]

// abstract Tipo as "tipo" 
// class "<b>numérico</b>" as number  {
// valor decimal: 666, -1, 0.42, 
// valor octal: 024
// valor hexadecimal: 0x42
// ...
// }
// class "<b>string</b>" as string  {
// valor: "cadena"
// valor: 'cadena'
// ...
// }
// class "<b>boolean</b>" as boolean  {
// valor: true
// valor: false
// }

// Tipo <|-down- string
// Tipo <|-down- number
// Tipo <|-down- boolean

// class Operador 
// class "operador\nrelacional" as OperadorRelacional  {
// igualdad: ==, ===, !=
// comparación: >, >=, <, <=
// }
// class "operador\naritmético" as OperadorAritmetico  {
// unarios: +, -
// multiplicativos: **, *, /, %
// aditivos: +, -
// }
// class "operador\nlógico" as OperadorLogico  {
// negación: !
// conjunción: &&
// disyunción: ||
// }

// Operador <|-down- OperadorRelacional
// Operador <|-down- OperadorAritmetico
// Operador <|-down- OperadorLogico

// OperadorRelacional -down-> "2" Tipo : in
// OperadorRelacional -down-> boolean : out

// OperadorAritmetico -down-> "1..2" number : in
// OperadorAritmetico -down-> number : out

// OperadorLogico -down-> "1..2" boolean : in
// OperadorLogico -down-> boolean : out

//include::diagramaTiposPrimitivos.adoc[]

|===

include::ust1_numbers/ust0_index.adoc[]
include::ust2_boolean/ust0_index.adoc[]
include::ust3_char/ust0_index.adoc[]
include::ust4_string/ust0_index.adoc[]
include::ust5_relationals/ust0_index.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust1_numbers/ust0_index.adoc ===== -->

#### Tipos numéricos

include::ust1_values.adoc[]
include::ust2_unaries.adoc[]
include::ust3_binaries.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust1_numbers/ust1_values.adoc ===== -->

##### Literales

[cols="50,50"]
|===

a|
- [blue]*Sintaxis*:
* _<literal>_ [red]*::=* _<valorNumerico>_
* _<valorNumerico>_ [red]*::=* _<parteEntera>_ [red]*[* _<parteDecimal>_ [red]*]* [red]*[* _<exponente>_ [red]*]*
* _<parteEntera>_ [red]*::=* [red]*[* *0b* [red]*\|* *0x* [red]*]*
_<signo>_ *[0.9]* [red]*+* 
* _<parteDecimal>_ [red]*::=* *.[0.9]* [red]*+*
* _<exponente>_ [red]*::=* *e* _<signo>_ *[0-9]* [red]*+*
* _<signo>_ [red]*::=* [red]*[* *+* [red]*\|* *-* [red]*]*

- [blue]*Semántica*:
* prefijos *0b* y *0x* son respectivamente para notación binaria y hexadecimal
* todos los literales enteros serán de tipo [blue]_**int**_
* todos los literales con decimales o notación científica serán de tipo [blue]_**double**_

a|    
[source, java]
....   
include::../../../../../../../../ust0_scenarios/ust1_imperative/ust1_types/ust1_numbers/ust1_values/src/main/java/App.java[]
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust1_numbers/ust2_unaries.adoc ===== -->

##### Operadores unarios

[cols="55,45"]
|===

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<operadorAritmeticoUnario>_ _<expresion>_
* _<operadorAritmeticoUnario_ [red]*::=* *-* [red]*\|* *+*
- [blue]*Semántica*: 
* operan sobre valores numéricos del mismo tipo, y devuelven un valor del tipo de los operandos (menos _byte, short_ y _char_, que devuelven _int_) 
** *+*, identidad, devuelve el mismo valor numérico dado; 
** *-*, opuesto, delvuelve el valor con cambio de signo respecto al valor numérico dado
a|
[source, java]
....
include::../../../../../../../../ust0_scenarios/ust1_imperative/ust1_types/ust1_numbers/ust2_unary/src/main/java/App.java[]

....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust1_numbers/ust3_binaries.adoc ===== -->

##### Operadores binarios

[cols="35,65"]
|===

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion>_ _<operadorAritmetico>_ _<expresion>_
* _<operadorAritmetico>_ [red]*::=* *-* [red]*\|* *** [red]*\|* */* [red]*\|* *%*

- [blue]*Semántica*: 
* operan sobre valores numéricos del mismo tipo, y devuelven un valor del tipo de los operandos (menos _byte, short_ y _char_, que devuelven _int_) 
** *+*, suma
** *-*, resta
** ***, multiplicación
** */*, división
** *%*, módulo resto

a|
[source, java]
.... 
include::../../../../../../../../ust0_scenarios/ust1_imperative/ust1_types/ust1_numbers/ust3_binary/src/main/java/App.java[]   
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust2_boolean/ust0_index.adoc ===== -->

#### Tipo _boolean_

include::ust1_values.adoc[]
include::ust2_unaries.adoc[]
include::ust3_binaries.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust2_boolean/ust1_values.adoc ===== -->

##### Valores de tipo _boolean_

[cols="30,70", options="header"]
|===

a| [blue]#boolean#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<literal>_ [red]*::=* _<valorLogico>_
* _<valorLogico>_ [red]*::=* *true* [red]*\|* *false*
- [blue]*Semántica*:
* correspondientes con cierto y false respectivamente
a|    
[source, java]
....  
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a3_boolean/a1_valores/App.java[]

....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust2_boolean/ust2_unaries.adoc ===== -->

##### Operadores unarios

[cols="20,80", options="header"]
|===

a| [blue]#operador unario prefijo#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* *!* _<expresion>_
- [blue]*Semántica*: 
* *!*, negación lógica, el opuesto

a|
[source, java]
....    
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a3_boolean/a2_unarios/App.java[]

....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust2_boolean/ust3_binaries.adoc ===== -->

##### Operadores binarios

[cols="40,60", options="header"]
|===

a| [blue]#operadores binarios infijos#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion>_ _<operadorBinarioLogico>_ _<expresion>_
* _<operadorBinarioLogico>_ [red]*::=* *&&* [red]*\|* *\|\|* 
- [blue]*Semántica*:
* *&&*, y-lógico: devuelve la evaluación de la primera expresión, [red]*no __true__*, cuando *ambos operandos son evalúan a cierto*
* *\|\|* , o-lógico: *devuelve la evaluación de la primera expresión*, [red]*no __true__* *cuando es cierto o, caso contrario, la evaluación de la segunda expresión cuando es cierta*
* [green]*__false__* en casos contrarios

a|
[source, java]
....
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a3_boolean/a3_binarios/App.adoc[]

....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust3_char/ust0_index.adoc ===== -->

#### Tipo _char_

include::ust1_values.adoc[]


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust3_char/ust1_values.adoc ===== -->

##### Literales de tipo _char_

[cols="45,55", options="header"]
|===

a| [blue]#char#
a| [blue]_java_

a|
* _<literal>_ [red]*::=* _<valorCaracter>_
* <valorCaracter> [red]*::=* *'* _<caracter>_ *'* [red]*\|*  *'* *\* _<caracter>_  *'*
*** _<caracter>_ son los caracteres imprimibles del código link:https://cs.stanford.edu/people/miles/iso8859.html[ASCII]  (espacio, letras, dígitos, símbolos de puntuación, ...)
*** los caracteres "escapados" son aquellos que no son imprimibles (salto de línea, ...) o con sobrecarga de significados (apostrofe para comienzo de cadena, ...) que deben precederse del caracter escape: '\n', '\t', ... '\"', '\'', '\"' y '\\',  
**** _\uXXXX_ para caracteres de link:https://asecuritysite.com/coding/asc2[UTF-16 de Unicode] 
***** donde X será un valor hexadecimal: _[0-9AF]_

a|    
[source, java]
....   
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a4_char/a1_valores/App.java[]

....

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust4_string/ust0_index.adoc ===== -->

#### Literales _String_

include::ust1_values.adoc[]
include::ust2_concatenation.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust4_string/ust1_values.adoc ===== -->

##### Literales de tipo _string_

[cols="45,55", options="header"]
|===

a| [blue]#string#
a| [blue]_java_

a|
* <cadenaCaracteres> [red]*::=* [red]*(* *"* [red]*\|* *'* [red]*)* _<caracter>_ [red]*** [red]*(* *"* [red]*\|* *'* [red]*)* 
** donde 
*** las comillas simples o compuestas de apertura y cierre deben ser iguales y distintas de cualquier caracter interior
*** _<caracter>_ es 
**** cualquiera caracter link:https://cs.stanford.edu/people/miles/iso8859.html[ASCII]  (espacio, letras, dígitos, símbolos de puntuación, ...)
**** excluyendo aquellos no imprimibles (salto de línea, ...) o con significado (comienzo de cadena, ...) que deben precederse del caracter escape: \n, \t, ... \", \', \" y  \\ (link:https://developer.mozilla.org/es/docs/Web/java/Reference/Global_Objects/String#notaci%C3%B3n_de_escape[tabla]),  
**** _\uXXXX_ para caracteres de link:https://asecuritysite.com/coding/asc2[UTF-16 de Unicode] 
**** _\xXX_ para caracteres de link:https://cs.stanford.edu/people/miles/iso8859.html[ASCII / ISO 8859-1 (Latin-1)]
**** _\u{XXXXXX}_ para caracteres de link:https://docs.microsoft.com/es-es/dotnet/api/system.text.encoding.utf32?view=net-6.0[UTF-32]
**** en todos los casos anteriores, X será un valor hexadecimal: _0, ..., 9, A, ..., F_
* <cadenaCaracteres> [red]*::=* *\`* [red]*(* _<caracter>_ [red]*\|* *${* _<expresion>_ *}* [red]*)* [red]*** *`*
** para *plantillas literales*, cadenas literales que habilitan el uso de expresiones incrustadas
** con los mismos caracteres que las cadenas anteriores pero sin necesidad de caracter de escape para las comillas, ni saltos de línea, ...

a|    
[source, java]
....   
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a2_string/a1_valores/App.java[]

....
- link:https://es.lipsum.com/[Lorem Ipsum]

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust4_string/ust2_concatenation.adoc ===== -->

##### Operador de Concatenación

[cols="25,75", options="header"]
|===

a| [blue]#Concatenación#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion> *+* <expresion>_
- [blue]*Semántica*: 
* *+*, operador binario que, dados dos _string_, *devuelve otra cadena de caracteres con los primeros caracteres iguales al primer __string__ y los últimos caracteres iguales a los del segundo __string__*
a|
[source, java]
.... 
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a2_string/a2_concatenacion/App.java[]
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust5_relationals/ust0_index.adoc ===== -->

#### Operadores Relacionales

include::ust1_number.adoc[]
include::ust2_char.adoc[]
include::ust3_boolean.adoc[]
include::ust4_string.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust5_relationals/ust1_number.adoc ===== -->

##### Tipo numerico

[cols="35,65", options="header"]
|===

a| [blue]#Operadores binarios infijos#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion> <operadorRelacional> <expresion>_
* _<operadorRelacional>_ [red]*::=* [red]*(* *==* [red]*\|* *!=* [red]*\|* [red]*)*
- [blue]*Semántica*: dados dos valores del mismo tipo numérico, devuelve un valor de tipo __boolean__ correspondiente a la relación de cada operador según el orden de los números reales
* *==*, igualdad en valor; *!=*, desigualdad en valor; *<*, menor; *<=*, menor o igual; *>*, mayor; *>=*, mayor o igual 

a|
[source, java]
....
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a4_relacional/a2_numericos/App.java[]

....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust5_relationals/ust2_char.adoc ===== -->

##### Tipo _char_

[cols="35,65", options="header"]
|===

a| [blue]#Operadores binarios infijos#,
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion> <operadorRelacional> <expresion>_
* _<operadorRelacional>_ [red]*::=* [red]*(* *==* [red]*\|* *!=* [red]*)*
- [blue]*Semántica*: dados dos _char_, devuelve un valor de tipo __boolean__ correspondiente a la relación de cada operador según la exacta [blue]*igualdad* de los caracteres
* *==*, igualdad en valor; *!=*, desigualdad en valor; 

a|
[source, java]
....
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a4_relacional/a4_char/App.java[]

....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust5_relationals/ust3_boolean.adoc ===== -->

##### Tipo _boolean_

[cols="35,65", options="header"]
|===

a| [blue]#Operadores binarios infijos#
a| [blue]_java_

a|
* _<expresion>_ [red]*::=* _<expresion> <operadorRelacional> <expresion>_
* _<operadorRelacional>_ [red]*::=* [red]*(* *==* [red]*\|* *!=* [red]*)*
- [blue]*Semántica*: : dados dos valores de tipo _boolean_, devuelve un valor de tipo __boolean__ correspondiente a la igualdad o no de los respectivos operadores 
* *==*, igualdad en valor; *!=*, desigualdad en valor; 

a|
[source, java]
....
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a4_relacional/a3_boolean/App.java[]
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust1_types/ust5_relationals/ust4_string.adoc ===== -->

##### Tipo _string_

[cols="35,65", options="header"]
|===

a| [blue]#Operadores binarios infijos#,
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion> <operadorRelacional> <expresion>_
* _<operadorRelacional>_ [red]*::=* [red]*(* *==* [red]*\|* *!=* [red]*)*
- [blue]*Semántica*: 
* dados dos _string_, devuelve un valor de tipo __boolean__ correspondiente a la relación de cada operador según la exacta [blue]*igualdad* de la secuencia de caracteres
** *==*, igualdad en valor; 
***!=*, desigualdad en valor; 

a|
[source, java]
....
include::../../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a1_tipos/a4_relacional/a1_string/App.java[]

....

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust2_simple_sentences/ust0_index.adoc ===== -->

### Sentencias Simples

include::ust1_output.adoc[]
include::ust2_input.adoc[]
include::ust3_variable.adoc[]
include::ust4_asiggment.adoc[]
include::ust5_constant.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust2_simple_sentences/ust1_output.adoc ===== -->

#### Salida de Datos

[cols="35,65", options="header"]
|===

a| [blue]#Salida de Datos#
a| _java_

a|
- [blue]*Sintáxis*:
* _<sentencia>_ [red]*::=* *console.writeln(* [red]*[* _<expresion>_ [red]*]* *)* *;* [red]*\|* *console.write(* _<expresion>_ *)* *;*
- [blue]*Semántica*:  
* *Muestra por consola* el valor resultado de la evaluación de la expresión

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a2_sentenciasSimples/a1_salida/App.java[]

....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#0-regardsv0[2-texts/0-regards/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v0_0/App.java[v0.0] 

a| - https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#0-regardsv1[2-texts/0-regards/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v1_0/App.java[v1.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v1_1/App.java[v1.1] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v1_2/App.java[v1.2] 
a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#0-regardsv2[2-texts/0-regards/v2] : link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v2_0/App.java[v2.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#0-multiplicationtable[3-numbers/0-multiplicationTable/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_0/App.java[v0.0]

a| 
a|
a|

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust2_simple_sentences/ust2_input.adoc ===== -->

#### Entrada de Datos

[cols="45,55", options="header"]
|===

a| [blue]#Entrada de datos#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* *console.* *read*[red]*(* *Byte* [red]*\|* *Short* [red]*\|* *Int* [red]*\|* *Long* [red]*\|* *Float* [red]*\|* *Double* [red]*\|* *Char* [red]*\|* *Boolean* [red]*\|* *String* [red]*)* *(* [red]*[* _<String>_ [red]*]* *)*
- [blue]*Semántica*: devuelve el valor del tipo correspondiente (numérico, carácter, lógico vs _string_) introducido por el usuario tras la interrumpción de la ejecución hasta que el usuario pulsa _enter_ (introducir, [red]#no entrar#!!!) 
* El parámetro opcional indica el _string_ que se mostrará antes de la entrada de datos para guiar al usuario

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a2_sentenciasSimples/a2_entrada/App.java[]

....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#0-regardsv3[2-texts/0-regards/v3] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v3_0/App.java[v3.0]

a| - https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#1-echov0[2-texts/1-echo/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v0_0/App.java[v0.0]

a| 
a|
a|

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust2_simple_sentences/ust3_variable.adoc ===== -->

#### Sentencia de Declaración de Variable

[cols="45,55", options="header"]
|===

a| [blue]#Sentencia de Declaración de Variable#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=*  [red]*(* *byte* [red]*\|* *short* [red]*\|* *int* [red]*\|* *long* [red]*\|* *float* [red]*\|* *double* [red]*\|* *char* [red]*\|* *String* [red]*\|* *boolean* [red]*)* _<identificador> [red]#[# **=** <expresion>** [red]#]#;**_
* _<identificador>_ [red]*::=* [red]#[# a [red]#-# zA [red]#-# Z\_$ [red]#]# [red]#[#  a [red]#-# zA [red]#-# z0 [red]#-# 9_$ [red]#]*#
** [red]*distinto* de cualquier [red]*otro identificador* del mismo ámbito y de cualquier [red]*palabra reservada*: _const, let, if, for, function, new, ..._
** [green]*estilo*: _**camelCase**_: palabras yuxtapuestas con la inicial en mayúsculas a partir de la segunda palabra
- [blue]*Semántica*:  
* [blue]*Reserva de memoria* para 
** [blue]*almacenar un único valor*, y posteriormente,
** [blue]*consultar su valor* si [red]#ha sido inicializada o asignada previamente# y
** [blue]*modificar su valor mediante la asignación del valor de la evalución de una expresión*, 
** [blue]*desde la línea de la declaración hasta el final del ámbito que encierra la declaración*

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a2_sentenciasSimples/a3_variable/App.java[]

....

// a|
// * [green]*Modelo __"Software"__*:
// ** se crea en el lateral izquierdo del pasillo ([green]*contexto de ejecución*) que recorre hacia atrás el robot
// ** un tetraedro con un globo ([green]*valor*), si lo tiene (por la [green]*evaluación de expresión de inicialización*), sin cordel con el valor dibujado
// ** y solo mirar el robot el tetraedro por las instrucciones del suelo ([green]*evaluación de una expresión*)
// *** el globo vuela donde se menciona ([green]*identificador de variable o constante*) desde las tuberías ([green]*expresión*) y desaparece para siempre ([green]*temporal*) apareciendo un globo nuevo ([green]*valor*) en la raiz de la tubería ([green]*resultado*)
// *** apareciendo otro globo ([green]*valor*) en el pico del tetraedro 

// a|
// - [green]*Modelo__"Hardware"__*:
// ** caja con ranura a la derecha para meter un valor en un papel
// ** entra en la bandeja de la fotocopiadora que puede empujar al único papel sobre la fotocopiadora
// ** el papel previo cae sobre una trituradora
// ** con un botón para fotocopiar el único papel actual

2+^.^a|
*Palabras Reservadas*
2+^.^a|
image::palabrasReservadas.png[]

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#0-regardsv3[2-texts/0-regards/v3] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v3_0/App.java[_v3.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v3_1/App.java[v3.1]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#0-regardsv4[2-texts/0-regards/v4] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a0_regards/v4_0/App.java[v4.0]

a| - https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#1-echov0[2-texts/1-echo/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v0_1/App.java[v0.1]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/0-time.md#0-unitsv0[0-time/0-units/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a0_units/v0_0/App.java[v0.0] 

a|
a|

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust2_simple_sentences/ust4_asiggment.adoc ===== -->

#### Sentencia de Asignación

[cols="40,60", options="header"]
|===

a| [blue]#Operador de asignación#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<identificador>_ *=* _<expresion>_ *;*
- [blue]*Semántica*:  
* como "sentencia", asigna/ actualiza/ "iguala", ..., _set, move, :=_, ..., con [red]*efecto lateral*: asignando a la variable identificada a la izquierda el resultado de la evaluacíon de la expresión [blue]*con restricción al tipo de la variable, lenguaje con sistema de tipos estático!!!*
* como operador, [red]*devuelve*, el [blue]*valor recién asignado* a la variable 
** [red]*No recomendado como parte de otra expresión*

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a2_sentenciasSimples/a4_asignacion/App.java[]

....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#5-changecoinsv0[3-numbers/5-changeCoins/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v0_0/App.java[v0.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v0_01/App.java[v0.01]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#0-digitsv0[4-numberingSystems/0-digits/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a0_digits/v0_0/App.java[v0.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#3-binaryToDecimalv0[4-numberingSystems/3-binaryToDecimal/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a3_binaryToDecimal/v0_0/App.java[v0.0] 

a|
a|

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust2_simple_sentences/ust5_constant.adoc ===== -->

#### Sentencia de Declaración de Constante

[cols="40,60", options="header"]
|===

a| [blue]#Sentencia de Declaración de Constante#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=* *final* [red]*(* *byte* [red]*\|* *short* [red]*\|* *int* [red]*\|* *long* [red]*\|* *float* [red]*\|* *double* [red]*\|* *char* [red]*\|* *boolean* [red]*\|* *String* [red]*)* _<identificador> **=** <expresion>_ *;*
- [blue]*Semántica*:  
* referenciable desde las expresiones del ámbito de la declaración pero [red]*no mutable!!!*

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a2_sentenciasSimples/a5_constante/App.java[]

....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#1-echov0[2-texts/1-echo/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v0_1/App.java[_v0.1_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v0_2/App.java[v0.2]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#1-echov1[2-texts/1-echo/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v1_0/App.java[v1.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/0-time.md#0-unitsv0[0-time/0-units/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a0_units/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a0_units/v0_1/App.java[v0.1] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a0_units/v0_2/App.java[v0.2]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/1-space.md#0-squarev0[1-space/0-square/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a0_square/v0_0/App.java[v0.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#1-integerdivisionv0[3-numbers/1-intergerDivision/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a1_integerDivision/v0_0/App.java[v0.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#5-changecoinsv0[3-numbers/5-changeCoins/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v0_1/App.java[v0.1]  

a|
a|

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/diagramaTiposPrimitivos.adoc ===== -->

[plantuml, 3-operadores-tiposPrimitivos, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
hide circle
hide stereotype
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor<<a>> #1E90FF
    BorderColor<<b>> #DC143C
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor<<a>> #1E90FF
    FontColor<<b>> #DC143C
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor<<a>> #1E90FF
    FontColor<<b>> #DC143C
}
abstract Tipo <<b>>
class "<b>Number</b>" as number <<b>> {
valor decimal: 666, -1, 0.42, 
valor octal: 024
valor hexadecimal: 0x42
...
}
class "<b>String</b>" as string <<b>> {
valor: "cadena"
valor: 'cadena'
...
}
class "<b>Boolean</b>" as boolean <<b>> {
valor: true
valor: false
}
class "<b>Undefined</b>" as undefined <<b>> {
valor: undefined
}


Tipo <|-down- string
Tipo <|-down- number
Tipo <|-down- boolean
Tipo <|-down- undefined

class Operador <<a>>
class "Operador\nRelacional" as OperadorRelacional <<a>> {
igualdad: ==, ===, !=
comparación: >, >=, <, <=
}
class "Operador\nAritmético" as OperadorAritmetico <<a>> {
unarios: +, -
multiplicativos: **, *, /, %
aditivos: +, -
}
class "Operador\nLógico" as OperadorLogico <<a>> {
negación: !
conjunción: &&
disyunción: ||
}
class "Operador\nde Bits" as OperadorBits <<a>> {
complemento: ~
conjunción: &
disyunción: |
desplazamientos: <<, >>, >>>
}
class "Operador\n<b>typeof</b>" as OperadorTypeof <<a>>
class "Operador\n<b>? :</b>" as OperadorTernario <<a>>

Operador <|-down- OperadorRelacional
Operador <|-down- OperadorAritmetico
Operador <|-down- OperadorLogico
Operador <|-down- OperadorBits
Operador <|-down- OperadorTypeof
Operador <|-down- OperadorTernario

OperadorRelacional -down-> "2" Tipo : in
OperadorRelacional -down-> boolean : out

OperadorAritmetico -down-> "1..2" number : in
OperadorAritmetico -down-> number : out

OperadorLogico -down-> "1..2" boolean : in
OperadorLogico -down-> boolean : out

OperadorBits -down-> "1..2" Tipo : in
OperadorBits -down-> number : out

OperadorTypeof -down-> Tipo : in
OperadorTypeof -down-> string : out

OperadorTernario -down-> boolean : in
OperadorTernario -down-> "2" Tipo : in
OperadorTernario -down-> Tipo : out
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/ust0_index.adoc ===== -->

### Operadores

//include::diagramaTiposPrimitivos.adoc[]

include::ust1_bits.adoc[]
include::ust2_ternary.adoc[]
include::ust3_acumulator.adoc[]
include::ust4_increment_decrement.adoc[]
include::ust5_comma.adoc[]
include::ust6_conversion.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/ust1_bits.adoc ===== -->

#### Operadores de Bits

[cols="50,50", options="header"]
|===

a| [blue]#Sintaxis#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion>_  _<operadorBit>_ _<expresion>_
* _<operadorBit>_  [red]*::=* *&* [red]*\|* *\|* [red]*\|* *^* [red]*\|* *~* [red]*\|* *<<* [red]*\|* *>>* [red]*\|* *>>>* 
- [blue]*Semántica*: 
* *&*, y-lógico de bits; 
* *\|*, o-lógico de bits; 
* *^*, o-lógico exclusivo de bits; 
* *~*, negación de bits; 
* *<<*, desplaza hacia la izquierda rellenando con ceros; 
* *>>*, desplaza hacia la derecha rellenando con el más significativo; 
* *>>>*, desplaza hacia la derecha rellenando con ceros

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a3_operadores/a1_bits/App.java[]

....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#4-decimaltobinaryv0[4-numberingSystems/4-decimalToBinary/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a4_decimalToBinary/v0_0/App.java[v0.0]

a| 
a|

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/ust2_ternary.adoc ===== -->

#### Operador Ternario

[cols="30,70", options="header"]
|===

a| [blue]#Operador ternario#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* _<expresion>_ *?* _<expresion>_ *:* _<expresion>_
- [blue]*Semántica*: 
* devuelve 
** *la evaluación del segundo argumento* [red]*si* *la evaluación del primer argumento resulta cierto* 
** o *la evaluación del tercero argumento en caso contrario*
a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a3_operadores/a3_ternario/App.java[]
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/0-time.md#1-majorv0[0-time/1-major/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a1_major/v0_0/App.java[v0.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a1_major/v0_1/App.java[v0.1] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#5-changecoinsv1[3-numbers/5-changeCoins/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v1_0/App.java[v1.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/0-time.md#2-sibilingsv0[0-time/2-sibilings/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a2_sibilings/v0_0/App.java[v0.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#3-evenv0[3-numbers/3-even/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_0/App.java[v0.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_1/App.java[v0.1] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#4-absolutevaluev0[3-numbers/4-absoluteValue/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a4_absoluteValue/v0_0/App.java[v0.0] 

a|
a|

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/ust3_acumulator.adoc ===== -->

#### Operadores de Acumulación

[cols="35,65", options="header"]
|===

a| [blue]#Operador de acumulación#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=* _<expresion>_ *;*
* _<expresion>_ [red]*::=* _<identificador>_ _<operadorAcumulacion>_ _<expresion>_
* _<operadorAcumulacion>_ [red]*::=* *+=* [red]*\|* *-=* [red]*\|* *\*=* [red]*\|* *\*\*=* [red]*\|* */=* [red]*\|* *%=* [red]*\|* *&=* [red]*\|* *\|=* [red]*\|* *^=* [red]*\|* *<<=* [red]*\|* *>>=* [red]*\|* *>>>=* 
- [blue]*Semántica*:
* Abreviatura de:  _<identificador>_ *=* _<identificador>_ _<operador>_ _<expresion>_
* [red]*No recomendado como parte de otra expresión*, con [red]*efectos laterales*, de tal forma que la evaluación de [red]#la nueva evaluación de la misma expresión arroja distintos resultados#

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a3_operadores/a4_acumulador/App.adoc[]

....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#0-digitsv0[4-numberingSystems/0-digits/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a0_digits/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a0_digits/v0_1/App.java[v0.1] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#5-changecoinsv1[3-numbers/5-changeCoins/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v1_0/App.java[_v1.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v1_1/App.java[v1.1] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#3-binaryToDecimalv0[4-numberingSystems/3-binaryToDecimal/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a3_binaryToDecimal/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a3_binaryToDecimal/v0_1/App.java[v0.1] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#4-decimaltobinaryv0[4-numberingSystems/4-decimalToBinary/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a4_decimalToBinary/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a4_decimalToBinary/v0_1/App.java[v0.1]

a|
a|

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/ust4_increment_decrement.adoc ===== -->

#### Operadores de Incremento y Decremento

[cols="40,60", options="header"]
|===

a| [blue]#Operador de incremento/decremento#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=* _<expresion>_ *;*
* _<expresion>_ [red]*::=* [red]*(* _<identificador>_ _<operadorIncrementoDecremento>_ [red]*\|* _<operadorIncrementoDecremento>_ _<identificador>_ [red]*)*
* _<operadorIncrementoDecremento>_ [red]*::=* *++* [red]*\|* *--* 
- [blue]*Semántica*:
* Abreviatura de:  _<identificador>_ *=* _<identificador>_ _<operador>_ [red]*(* 1 [red]*\|* -1 [red]*)*
* pero la expresión devuelve el valor de la variable *incrementada/decrementada* o o el valor *previo al incremento/decremento* dependiendo de si el operador es prefijo o postfijo respectivamente, en cualquier caso *modifica el valor de la variable*
* [red]*No recomendado* como [red]#parte de otra expresión#, con [red]*efectos laterales*

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a3_operadores/a5_incrementoDecremento/App.java[]

....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| 
a|

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/ust5_comma.adoc ===== -->

#### Operador Coma

[cols="30,70", options="header"]
|===

a| [blue]#Operador coma#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ *::=* _<expresión>_ [red]*{* *,* _<expresión>_ [red]*}* [red]*+*
- [blue]*Semántica*:
* devuelve la *evaluación del la última expresión*; por tanto, el único sentido será disponer expresiones previas a la última por sus [red]*efectos laterales*
* [red]*Desaconsejado*, excepto en sitios puntuales (p.e. sentencia *for*, ...)

a|
[source, java]
....
include::../../../../../../../src/0-itinerario/1-imperativa/4-expresiones/3-compuesta/app.adoc[]
....

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust3_operators/ust6_conversion.adoc ===== -->

#### Conversión de Tipos

[cols="33,33,33""]
|===

a|
- [blue]*Promoción*: transforman un dato de un tipo a otro con el mismo o mayor espacio en memoria para almacenar información;
- [blue]*Contracción*: transforman un dato de un tipo a otro con menor espacio en memoria para almacenar información con la consecuente *posible pérdida de información*;

a|
image::conversion.png[]

a|
- [blue]*Conversión implícita*:
* por promoción cuando se combinan dos operandos de distinto tipo, se convierte el de menor precisión al de mayor precisión;
* por promoción cuando se asigna un valor de un tipo de menor precisión a una variable de mayor precisión;

|===

[cols="30,70", options="header"]
|===

a| - [blue]*Conversión explícita*:
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* *(* <tipo> *)* _<expresion>_
* _<tipo> [red]*::=* *byte* [red]*\|* *short* [red]*\|* *int* [red]*\|* *long* [red]*\|* *float* [red]*\|* *double* [red]*\|* *char* [red]*\|* *boolean* 
- [blue]*Semántica*:
* por promoción o contracción a través del [blue]*operador de conversión de tipos* (_cast_), cuyo nivel de precedencia es el de los operadores unarios;

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a3_operadores/a2_conversion/App.java[]
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust4_expressions/tablaPrecendencia.adoc ===== -->

#### Tabla de Precedencia y Asociatividad

[cols="10,35,25,25"]
|===

a| *Precedence*
a| *Operator type*
a| *Associativity*
a| *Individual operators*

a| 21
a| *Grouping*
a| n/a
a| ( … )

.5+a| 20
a| Member Access
.2+a| left-to-right
a| … . …

a| *Computed Member Access*
a| … [ … ]
 
a| new (with argument list)
a| n/a
a| new … ( … )

a| Function Call
.2+a| left-to-right
a| … ( … )

a| Optional chaining
a| ?.

a| 19
a| new (without argument list)
a| right-to-left
a| new …

.2+a| 18
a| *Postfix Increment*
.2+a| n/a
a| … ++

a| *Postfix Decrement*
a| … --

.10+a| 17
a| *Logical NOT (!)*
.10+a| right-to-left
a| ! …

a| *Bitwise NOT (~)*
a| ~ …

a| *Unary plus (+)*
a| + …

a| *Unary negation (-)*
a| \- …

a| *Prefix Increment*
a| ++ …

a| *Prefix Decrement*
a| -- …

a| *typeof*
a| typeof …

a| void
a| void …

a| delete
a| delete …

a| await
a| await …

a| 16
a| *Exponentiation (**)*
a| right-to-left
a| … ** …

.3+a| 15
a| *Multiplication (*)*
.3+a| left-to-right
a| … * …

a| *Division (/)*
a| … / …

a| *Remainder (%)*
a| … % …

.2+a| 14
a| *Addition (+)*
.2+a| left-to-right
a| … + …

a| *Subtraction (-)*
a| … - …

.3+a| 13
a| *Bitwise Left Shift (<<)*
.3+a| left-to-right
a| … << …

a| *Bitwise Right Shift (>>)*
a| … >> …

a| *Bitwise Unsigned Right Shift (>>>)*
a| … >>> …

.6+a| 12
a| *Less Than (<)*
.6+a| left-to-right
a| … < …

a| *Less Than Or Equal (<=)*
a| … <= …

a| *Greater Than (>)*
a| … > …

a| *Greater Than Or Equal (>=)*
a| … >= …

a| in
a| … in …

a| instanceof
a| … instanceof …

.4+a| 11
a| *Equality (==)*
.4+a| left-to-right
a| … == …

a| *Inequality (!=)*
a| … != …

a| *Strict Equality (===)*
a| … === …

a| *Strict Inequality (!==)*
a| … !== …

a| 10
a| *Bitwise AND (&)*
a| left-to-right
a| … & …

a| 9
a| *Bitwise XOR (^)*
a| left-to-right
a| … ^ …

a| 8
a| *Bitwise OR (\|)*
a| left-to-right
a| … \| …

a| 7
a| *Logical AND (&&)*
a| left-to-right
a| … && …

a| 6
a| *Logical OR (\|\|)*
a| left-to-right
a| … \|\| …

a| 5
a| *Nullish coalescing operator (??)*
a| left-to-right
a| … ?? …

a| 4
a| *Conditional (ternary) operator*
a| right-to-left
a| … ? … : …

.16+a| 3
.16+a| *Assignment*
.16+a| right-to-left
a| … = …

a| … += …

a| … -= …

a| … **= …

a| … *= …

a| … /= …

a| … %= …

a| … <<= …

a| … >>= …

a| … >>>= …

a| … &= …

a| … ^= …

a| … \|= …

a| … &&= …

a| … \|\|= …

a| … ??= …

.2+a| 2
a| yield
.2+a| right-to-left
a| yield …

a| yield*
a| yield* …

a| 1
a| *Comma / Sequence*
a| left-to-right
a| … , …

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust1_imperative/ust4_expressions/ust0_index.adoc ===== -->

### Expresiones

#### Precedencia y asociatividad

[cols="45,55", options="header"]
|===

a| [blue]#Expresiones#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* combinación 
** de operandos (literales, identifcadores de variables y constantes) 
** y operadores (prefijos, infijos, sufijos y ternarios) 
- [blue]*Semántica*:
* cuya evaluación devuelve un valor de tipo primitivo
** un [blue]*operando ambiguo, entre dos operadores,* alimenta al operador de mayor nivel de link:[*precedencia*]
** ante el mismo nivel de precedencia, alimenta al operador de la *asociatividad* establecida para ese nivel de precedencia
** estas reglas [red]*no determinan el orden de evaluación*

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a4_expresiones/a1_asociatividad/App.adoc[]
....

|===

image::tablaPrecedencia.webp[]

#### Operador Paréntesis

[cols="20,80", options="header"]
|===

a| [blue]#Operador paréntesis#
a| [blue]_java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ *::=* *(* _<expresión>_ *)*
- [blue]*Semántica*:
* devuelve la evaluación de la expresión anidada

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a1_imperativa/a4_expresiones/a2_parentesis/App.adoc[]
....

|===

//include::tablaPrecendencia.adoc[]

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/0-time.md#2-sibilingsv0[0-time/2-sibilings/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a2_sibilings/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a2_sibilings/v0_1/App.java[v0.1]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#1-integerdivisionv0[3-numbers/1-intergerDivision/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a1_integerDivision/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a1_integerDivision/v0_05/App.java[v0.05]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#2-percentagev0[3-numbers/2-percentage/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a2_percentage/v0_0/App.java[v0.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#3-evenv0[3-numbers/3-even/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_05/App.java[v0.05]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#4-absolutevaluev0[3-numbers/4-absoluteValue/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a4_absoluteValue/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a4_absoluteValue/v0_1/App.java[v0.1] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a4_absoluteValue/v0_2/App.java[v0.2]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/1-space.md#0-squarev0[1-space/0-square/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a0_square/v0_0/App.java[v0.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a0_square/v0_1/App.java[v0.1] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/1-space.md#1-rectanglev0[1-space/1-rectangle/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a1_rectangle/v0_0/App.java[v0.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a1_rectangle/v0_1/App.java[v0.1]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/1-space.md#2-trianglev0[1-space/2-triangle/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a2_triangle/v0_0/App.java[v0.0]

a|
a|

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/ust0_index.adoc ===== -->

## Programación Estructurada

[cols="25,25,25,25", options="header"]
|===

a| [blue]#Sentencias alternativas#
a| [blue]#Sentencias iterativas#
a| [blue]#Sentencia secuencial#
a| [blue]#__Arrays__#

a| [blue]#Sentencias __if__ y __switch__#
a| [blue]#Sentencias __while__, __do/while__, __for__# ([red]#ni __"break"__ ni __continue__#)
a| [blue]#Sentencia con ámbitos de bloque y colisión y ocultación de identificadores#
a| [blue]#Colección homogénea de datos, creación, modificaciones y consultas#

|===

include::ust1_alternative.adoc[]
include::ust2_iterative.adoc[]
include::ust3_sequential.adoc[]
include::ust4_arrays.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/ust1_alternative.adoc ===== -->

### Sentencias Alternativas

[cols="40,60", options="header"]
|===

a| [blue]#Sentencia Alternativa#
a| _java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=* _<sentenciaAlternativa>_ [red]*\|* _<sentenciaAlternativaMultiple>_
* _<sentenciaAlternativa>_ [red]*::=* *if (* _<expresion>_ *)* _<sentencia>_  [red]*[* *else* _<sentencia>_ [red]*]* *;* 
- _<sentenciaAlternativaMultiple>_ [red]*::=* *switch (* _<expresion>_ *) {* [red]*{* *case* _<literal>_ *:* [red]*{* _<sentencia>_ [red]*\|* *break;* [red]*}* [red]*}* [red]*[* *default:* [red]*{* _<sentencia>_ [red]*\|* *break;* [red]*}* [red]*]* *}* *;* 
- [blue]*Semántica*:
* *Sentencia alternativa*, si se cumple la condición, ejecuta la sentencia
* *Sentencia alternativa compuesta*, si se cumple la condicion, ejecuta la primera sentencia, en caso contrario la segunda sentencia
* *Sentencia alternativa múltiple*, con ramas restringidas a casos concretos de valores, ejecuta desde la igualdad con la evaluación de la expresión hasta el final de la sentencia
** *break*, termina la ejecución de la sentencia (p.e.: _for, ..._)
*** [red]*No recomendado en ninguna otra situación*

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a1_alternativa/App.java[]
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/0-time.md#2-sibilingsv0[0-time/2-sibilings/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a2_sibilings/v0_1/App.java[_v0.1_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a2_sibilings/v0_2/App.java[v0.2] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#3-even[3-numbers/3-even/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_05/App.java[_v0.05_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_2/App.java[v0.2] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_3/App.java[v0.3] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a3_even/v0_4/App.java[v0.4]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#4-absolutevalue[3-numbers/4-absoluteValue/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a4_absoluteValue/v0_2/App.java[_v0.2_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a4_absoluteValue/v0_3/App.java[v0.3]

a|


|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/ust2_iterative.adoc ===== -->

### Sentencias Iterativas

[cols="45,55", options="header"]
|===

a| [blue]#Sentencia Iterativa#
a| _java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=* _<sentenciaIterativa>_ 
* _<sentenciaIterativa>_ [red]*::=* _<sentenciaWhile>_ [red]*\|* _<sentenciaDoWhile>_ [red]*\|* _<sentenciaFor>_
* _<sentenciaWhile>_ [red]*::=* *while* *(* _<expresion>_ *)* _<sentencia>_
* _<sentenciaDoWhile>_ [red]*::=* *do* *{* _<sentencia>_ *}* *while* *(* _<expresion>_ *)* *;*
* _<sentenciaFor>_ [red]*::=* *for* *(* [red]*[* _<sentenciaLet>_ [red]*]* [red]*[* _<expresion>_ [red]*]* *;* [red]*[* _<expresion>_ [red]*]* *)* _<sentencia>_ 
- [blue]*Semántica*:
* *Sentencia __while__*, mientras se evalúa la expresión a cierto, ejecuta la sentencia de 0 a n veces
* *Sentencia __do-while__*, ejecuta la sentencia mientras se evalúa la expresión a cierto de 1 a n veces
* *Sentencia __for__*, 
** se crean los índices de las sentencia let
** mientras se evalua a cierto la primera expresión, se ejecuta la sentencia y se evalúa la segunda expresión

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a2_iterativa/App.java[]
....

|===



[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#4-validationv0[4-validation] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a4_validation/v0_0/App.adoc[v0.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#0-multiplicationtable[3-numbers/0-multiplicationTable/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_4/App.java[v0.4]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#9-factorialv0[3-numbers/9-factorial/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a9_factorial/v0_0/App.java[v0.0] 

a|

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/ust3_sequential.adoc ===== -->

### Sentencia Secuencial

[cols="30,70", options="header"]
|===

a| [blue]#Sentencia Secuencial#
a| _java_

.4+a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=* _<sentenciaSecuencial>_
* _<sentenciaSecuencial>_ [red]*::=* *{* [red]*{* _<sentencia>_ [red]*}+* *}*
- [blue]*Semántica*:
* Su ejecución (espacio/tiempo) ejecuta secuencialmente las sentencias anidadas 

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a3_secuencial/a1_sinVariables/App.java[]
....

|===

[cols="30,70", options="header"]
|===

a| [blue]#Ámbito de bloque#
a| _java_

a|
- Define un *ámbito léxico* (espacio) desde su apertura ({) hasta su cierre (})
* puede contener declaración de variables y constantes accesibles desde su declaración hasta el cierre del ámbito léxico
* pero dos variables [red]*no pueden tener igual nombre en el mismo ámbito léxico*
- Reglas de *acceso a variables y/o constantes* desde las expresiones:
* una variable o constante mencionada, se busca en su ámbito léxico hacia atras, si no se encontrara, se busca en el ámbito léxico superior hacia atrás, recursivamente hasta encontrarla ... 
* en caso contrario, se considerará como asignación o acceso desde una expresión a una [red]*variable del ámbito global* creada en última instancia (sentencia _var_)
* [green]#Siempre de dentro hacia afuera!#, según sus [blue]*ámbito léxico*, desde la apertura hasta su cierre
* [red]#Nunca desde fuera hacia dentro!!!#, [green]*ocultación de información*
* cuando termina la ejecución de la sentencia, [red]*se destruyen todas las posibles variables y constantes creadas internamente*
a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a3_secuencial/a2_conVariables/App.java[]
....

|===

[cols="20,80", options="header"]
|===

a| [blue]#Ámbito de bloque#
a| _java_

a|
- Permite la ejecucuión alternativa o iterativa de varias sentencias

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a3_secuencial/a4_agrupacion/App.java[]
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*


a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/0-time.md#3-sumtimesv00[3-sumTimes/v0.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_time/a3_sumTimes/v0_0/App.java[v0.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/1-space.md#2-trianglev0[1-space/2-triangle/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a2_triangle/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a2_triangle/v0_1/App.java[v0.1] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a2_triangle/v0_2/App.java[v0.2] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#1-echov1[2-texts/1-echo/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v1_1/App.java[_v1.1_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a1_echo/v1_2/App.java[v1.2]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#0-multiplicationtable[3-numbers/0-multiplicationTable/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_4/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_1/App.java[v0.1] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_2/App.java[v0.2] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_3/App.java[v0.3] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a0_multiplicationTable/v0_4/App.java[v0.4]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#6-prime[3-numbers/6-prime/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a6_prime/v0_0/App.java[v0.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#6-primev1[3-numbers/6-prime/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a6_prime/v1_0/App.java[v1.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#6-primev2[3-numbers/6-prime/v2] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a6_prime/v2_0/App.java[v2.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#7-perfectv0[3-numbers/7-perfect/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a7_perfect/v0_0/App.java[v0.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#8-friendsv0[3-numbers/8-friends/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a8_friends/v0_0/App.java[v0.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#8-friendsv1[3-numbers/8-friends/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a8_friends/v1_0/App.java[v1.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#10-fibonacci[3-numbers/10-fibonacci/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a10_fibonacci/v0_0/App.java[v0.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#11-power[3-numbers/11-power/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a11_power/v0_0/App.java[v0.0]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#0-digits[4-numberingSystems/0-digits/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a0_digits/v0_2/App.java[_v0.2_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a0_digits/v0_3/App.java[v0.3] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#3-binaryToDecimalv1[4-numberingSystems/3-binaryToDecimal/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a3_binaryToDecimal/v0_0/App.java[_v0.1_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a3_binaryToDecimal/v1_0/App.java[v1.0] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#4-decimaltobinaryv1[4-numberingSystems/4-decimalToBinary/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a4_decimalToBinary/v0_1/App.java[_v0.1_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a4_decimalToBinary/v1_0/App.java[v1.0]

a|  - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/5-units.md#1-interval6-isintersected[1-interval6-isintersected] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a1_interval/scenarios/isIntersected/App.java[isIntersected] 

// a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/5-units.md#1-quadrantsv0[5-units/2-coordinate/1-quadrants/v0] : link:[v0.0] - link:[v0.1] - link:[v0.2]

// a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/6-collections.md#5-includesv0[6-collections/5-includesv0/v0] : - link:[v0.0] - link:[v0.1] - link:[v0.2] 

a|
a|

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/ust4_arrays.adoc ===== -->

### Tablas

[cols="29,71", options="header"]
|===

a| [blue]#Creación#
a| _java_

a|
- [blue]*Sintaxis*:
* _<expresion>_ [red]*::=* [red]*[* *new* _<tipo>_ *[* *]* [red]*\+* [red]*]* *{* [red]*[* _<expresion>_ [red]*{* *,* _<expresion>_ [red]*}* [red]*]* *}* [red]*\|* *new* _<tipo>_ *[* _<expresion>_ *]* [red]*+* *[* *]* [red]***
* _<sentenciaFor>_ [red]*::=* *for* *(* _<tipo>_ _<identificador>_ *:* _<expresión>_ *)* _<sentencia>_

- [blue]*Semántica*:
* El operador [blue]*__new__* es unario prefijo cuyos operandos son tipo de tablas y devuelve la [blue]*dirección de memoria donde se ha reservado el espacio para dicha tabla*
** su nivel de precedencia es igual al de los operadores unarios.
** donde el vector se crea con n elementos inicializados con 0, false o '\0' los tipos numéricos, lógicos o caracteres respectivamente o con los valores de la evaluación de las expresiones correspondientes
* Tipo de dato *estructurado/compuesto* que permite almacenar un conjunto de datos *bajo un mismo identificador*, tabla, vector, matriz, retícula, rejilla, ... _array_ 
** Cada uno de los *elementos* que componen un vector pueden ser de cualquier tipo: 
*** *tipo primitivo*, _number, string, boolean, undefined_; 
*** tipo estructurado/compuesto como los propios *arrays* pudiendo construir arrays de arrays de tipos primitivos, tablas bidimensionales, ... arrays de arrays de ... de tipos primitivos, *tablas n-dimensionales*
** Recomendado que sea una [green]*colección de elementos homogéneos, todos ellos del mismo tipo y de la misma naturaleza*: [red]#no combinar 5 contadores y un acumulador#

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a4_tablas/a1_creacion/App.java[]
....

|===

[cols="30,70", options="header"]
|===

a| Acceso a elementos
a| _java_

a|
- [blue]*Sintaxis*:
* _<expresión>_ [red]*::=* _<expresión>_ *[* _<expresión>_ *]*
* _<expresión>_ [red]*::=* _<expresión>_ *.length*

- [blue]*Semántica*:
* mediante la *indexación* del _array_ dado por la primera expresión con la posición deseada a través de la segunda expresión entera comenzando por *0 para el primer elemento*
* mediante la propiedad _**length**_ se accede a la cantidad del elementos del _array_ dado por la expresión, *uno más del índice del último elemento porque empieza por 0*
* sentencias _for_ especiales para _arrays_
** donde la variable declarada tomará cada uno de los valores del _array_ en el orden natural

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a4_tablas/a2_acceso/App.java[]
....

|===

[cols="30,70", options="header"]
|===

a| Referencias
a| _java_

a|
- [blue]*Sintaxis*:
* _<sentencia>_ [red]*::=*  [red]*(* *byte* [red]*\|* *short* [red]*\|* *int* [red]*\|* *long* [red]*\|* *float* [red]*\|* *double* [red]*\|* *char* [red]*\|* *String* [red]*\|* *boolean* [red]*)* [red]*(* *[* *]* [red]*)* [red]*\+*  _<identificador>_ [red]*[* **=** _<expresion>_ ** [red]*]*

- [blue]*Semántica*:
* son variables/constantes declaradas [red]#no almacenan el valor compuesto del array, como ocurre con los tipos primitivos#, sino que *almancenan la dirección/"referencia" a la memoria donde se almacenan los valores del tipo compuesto*


a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a4_tablas/a3_referencia/App.java[]
....

|===

[cols="25,75", options="header"]
|===

a| Modificación de elementos
a| _java_

a|
- [blue]*Sintaxis*:
* _<sentAsignacion>_ [red]*::=* _<expresión>_ *[* _<expresión>_ *]* = _<expresión>_ *;*

- [blue]*Semántica*:
* mediante la asignación del valor de la evaluación de una expresión (3), en la posición indexada mediante el valor entero de la expresión (2) del _array_ dado por la primera expresión (1)


a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a4_tablas/a4_modificacion/App.java[]
....

|===

[cols="30,70", options="header"]
|===

a| Valor [blue]*__null__*
a| _java_

a|
- [blue]*Sintaxis*:
* _<literal>_ [red]*::=* *null* 

- [blue]*Semántica*:
* la dirección *__null__* es el valor de *aquella dirección donde no hay valores*

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a2_estructurada/a4_tablas/a5_null/App.java[]
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/3-numbers.md#5-changecoinsv1[3-numbers/5-changeCoins/v1] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v1_1/App.java[_v1.1_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a3_numbers/a5_changeCoins/v1_2/App.java[v1.2]

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/1-space.md#2-trianglev0[1-space/2-triangle/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a2_triangle/v0_2/App.java[_v0.2_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a1_space/a2_triangle/v0_3/App.java[v0.3] 

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/4-numberingSystems.md#0-digits[4-numberingSystems/0-digits/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a0_digits/v0_1/App.java[_v0.1_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a4_numberingSystems/a0_digits/v0_2/App.java[v0.2] 

a|  - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/6-collections.md#3-matrixtranspose[6-collections/3-matrixTranspose/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a6_collections/a3_matrixTranspose/v0_0/App.java[v0.0] 

a|  - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/5-units.md#1-interval4-split[1-interval4-split] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a1_interval/scenarios/split/App.java[split] 

// a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/6-collections.md#4-permutationsv0[6-collections/4-permutations/v0] : - link:https://github.com/USantaTecla-tech-java/0-simpleDomains/blob/master/6-collections/4-permutations/v0.0/app.js[v0.0]

// a| - link:https://github.com/USantaTecla-0-domains/game-ticTacToe/tree/master/1.0.basic#interfaceprototype[game-ticTacToe] - link:https://github.com/USantaTecla-tech-java/game-ticTacToe/blob/master/0-programacionEstructurada/app.js[1.0.basic]
a|
a|

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/x1-alternativa.adoc ===== -->

### Sentencias Alternativas

[cols="10,45,45",options="header"]
|===

a|
a|*[blue]#Sintaxis#*
a|*[blue]#Java#*
a|
La evaluación de la expresión debe devolver un valor de tiempo entero o carácter

a|
[source,java]
....
switch (<expreción>) {
     case <constante>:
        <sentencia>
          ...
          [ break; ]
      ...
     [ default:
        <sentencia>
          ...
          [ break; ]]
}
....

a|
[source]
....
switch (nota) {
  case 0:
  case 1:
  case 2:
  case 3:
  case 4:
       letra = 'I';
       break;
  case 5:
  case 6:
       letra = 'A';
       break;
  case 7:
  case 8:
       letra = 'N';
       break;
  case 9:
  case 10:
       letra = 'S';
       break;
  default:
       letra = ' ';
       break;
}
....

|===
 

[cols="35,65",options="header"]
|===

a|
*[blue]#Ejercicio:#*
a|
*[blue]#Java#*

a|
Dado el orde del día (0 para el lunes, 1 para el martes, ...), asignar la inicial correspondiente (‘L’ para el lunes, ‘M’ para el martes, ‘X’ para ...).

a|
[source,java]
....
public class Day {
  void exec() {
    int day = 5;
    int initial;
//TODO
//
  System.out.println(initial);
}
  public static void main(String[] agrs) {
  new Day().exec();
  }
}
....
|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/x2-iterativa.adoc ===== -->

### Sentencias Iterativas 

[cols="20,40,40",options="header"]
|===

a|
a|*[blue]#Sintaxis#*
a|*[blue]#Java#*

a|
La evaluación de la expresión debe devolver un valor de tipo lógico;

a|
....
while (<expresión>)
   <sentencia>
....

a|
[source,java]
....
while (numero > 0) {
  numero /= 10;
  digitos++;
}
....

|===


[cols="20,40,40",options="header"]
|===

a|
a|*[blue]#Sintaxis#*
a|*[blue]#Java#*

a|
La evaluación de la expresión debe devolver un valor de tipo lógico;

a|
....
do {
  <sentencia>
} while (<expresión>);
....

a|
[source,java]
....
do {
   numero -= 10;
  } while (numero > 0);
....

|===

[cols="30,35,35", options="header"]
|===

a|
a|*[blue]#Sintaxis#*
a|*[blue]#Java#*

a|
La expresión2 debe devolver un valor de tipo lógico;

* la expresión1 admite la declaración de variables locales que se pueden referenciar dentro del cuerpo del bucle;

a|
....
for (<expresión1>; <expresión2>; <expresión3>)
    <sentencia>
....

a|

[source,java]
....
boolean[] pares = new boolean[10];
for (int i = 0; i < pares.length; i++) {
   pares[i] = i % 2 == 0;
}
....

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/x3-secuencial.adoc ===== -->

### Sentencia Secuencial

[cols="30,30,30",options="header"]
|===

a|
a|
*[blue]#Sintaxis#*
a|
*[blue]#Java#*

a|
La evaluación de la expresión debe devolver un valor de tipo lógico

a|
[source,java]
....
if (<expresión>)
<sentencia>
[ else
<sentencia>
]
....

a|
[source,java]
....
if (divisor != 0) {
    resultado = dividendo / divisor;
}
....

|===

[cols="25,75",options="header"]
|===

a|*[blue]#Ejercicio:#*
a|*[blue]#Java#*

a|
Antipodas, dada una latitud (positiva para norte y negativa para sur) y una longitud (positiva para este y negativa para oeste), asignar los valores oportunos a las variables del código dado para que se muestren la coordenada dada y su antípoda


[source]
....
40º S  23º O
40º N  157º E
....

a|
[source,java]
....
public class Antipodes {
  void exec() {
    int latitudeGrades = -40;
    int longitudeGrades = -23;
    //TODO
    int latitudeGradesAbs;
    char latitudeCardinalPoint;
    int longitudeGradesAbs;
    char longitudeCardinalPoint;
    int antipodeLatitudeGrades;
    char antipodeLatitudeCardinalPoint;
    int antipodeLongitudeGrades;
    char antipodeLongitudeCardinalPoint;
    //
    System.out.println(latitudeGradesAbs + "o" + latitudeCardinalPoint + " " +
    longitudeGradesAbs + "o" + longitudeCardinalPoint);
    System.out.println(antipodeLatitudeGrades + "o" +
    antipodeLatitudeCardinalPoint + " " +
    antipodeLongitudeGrades + "o" + antipodeLongitudeCardinalPoint);
  }
  public static void main(String[] agrs) {
    new Antipodes().exec();
  }
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust2_structured/x4-tablas.adoc ===== -->

### Tablas

[cols="20,35,45", options="header"]
|===

a| *[blue]#OPERADOR new#*
a| *[blue]#Sintaxis a)#*
a| *[blue]#Sintaxis b)#*


a|
Es unario prefijo cuyos operandos son vectores y matrices y devuelve la dirección de memoria donde se ha reservado el espacio para dicho vector o matriz; su nivel de precedencia es igual al de los operadores unarios.

^.^a|
image::SintaxisA.jpg[height32]

* _donde la expresión debe devolver un valor de tipo entero que será la longitud del vector;_

image::EjemploSintaxisA.jpg[height32]


^.^a|
image::SintaxisB.jpg[height32]

* _donde el vector se crea con n elementos inicializados con los valores de la evaluación de las expresiones correspondientes;_

image::EjemploSintaxisB.jpg[height32]

|===

[cols="20,40,40", options="header"]
|===

a| *[blue]#REFERENCIA a un vector de tipos primitivos:#*
a| *[blue]#Sintaxis#*
a| *[blue]#Ejemplo#*

a|
Es una variable puntero que alberga la dirección del vector.

^.^a|
image::Referencia.jpg[height32]

* *_final_* _indica que la referencia es constante y obligada a su inicialización_

^.^a|
image::EjemploReferencia.jpg[height32]

|===

[cols="40,60", options="header"]
|===

a| *[blue]#Operadores:#*
a| *[blue]#Ejemplo:#*

a|
* <referenciaV> = <direcciónV>: asigna la dirección a la referencia siendo del mismo tipo;

* <direcciónV>.*lenght*:devuelve de la longitud del vector;

* <direcciónV-I> == <direcciónV-D>:determina si dos direcciónes a vectores del mismo tipo son iguales;

* <direcciónV-I> != <direcciónV-D>: determina si dos direcciónes a vectores del mismo tipo son distintas;

* <direcciónV>[<expresión>]: accede a la variable que ocupa la posición dada por la expresión entera,numeradas de 0 al anterior a la longitud;

a|
[source,java]
....
int[] enteros = new int[] {3, 2, 1};
int valor = enteros.length - 2;
enteros[0] = enteros[valor] * enteros[2];
// enteros[0] == 2
int[] enteros2 = enteros;
// Las dos variables comparten 3 enteros
enteros = null;
enteros2 = null;<1>
enteros =new int[33];
boolean prueba = ( (enteros == null) \|\|
                   (enteros == enteros2) );
char[] vocales = {'a','e','i','o','u'};<2>
vocales = new char[] {'A','E','I','O','U'};<1>
....
<1> Escribir la expreción correspondiente en vez de 0se libera la memoria automáticamente cuando ninguna referencia apunta a un vector

<2> en una declaración se puede omitir el tipo del vector

|===

#### Operador new

[cols="30,30,40", options=header]
|===

a| *[blue]#Sintaxis c)#*
a| *[blue]#Sintaxis d)#*
a| *[blue]#Sintaxis e)#*

a|
[source]
....
new <tipo> [<expresiónF>] [<expresiónC>]
....

* _donde las expreciones F y C deben devolver un valor  de tipo entero,que será el número de filas y columnas de la matriz;_

image::EjemploSintaxisC.jpg[height32]

a|
[source]
....
new <tipo> [< expresiónF>] []
....

* _donde las expresión F debe devolver un valor de tipo entero que será el número de filas de la matriz;_

image::EjemploSintaxisD.jpg[height32]

a|
[source]
....
new <tipo> [] [] {{ <expreción11> , ... , <expreción1c1> } , 
         ...
{ <expresiónF1> , ... , <expresiónFCF> }}
....

* _donde el vector se crea con f filas y c1,... cf columnas inicializados con los valores de la evalución de las expreciones correspondientes;_ 

image::EjemploSintaxisE.jpg[height32]

|===


[cols="20,40,40", options="header"]
|===

a| *[blue]#REFERENCIA a una matriz de tipos primitivos:#*
a| *[blue]#Sintaxis#*
a| *[blue]#Ejemplo#*

a|
Es una variable puntero que alberga la dirección de un vector de la referencias a vectores de tipos primitivos.

a|
[source]
....
[final] <tipo> [] [] <referencia> [= <direccionVR>];
....

* *_final_* _indica que la referencia es constante y obliga a su inicialización_

a|
image::EjemploReferencia2.jpg[height32]

|===

[cols="40,60", options="header"]
|===

a| *[blue]#Operadores:#*
a| *[blue]#Ejemplo:#*


a|
* <referenciaM> = <direcciónM>: asigna la dirección a la referencia siendo del mismo tipo;

* <direcciónM>.*length*: devuelve el numero de filas de la matriz;

* <direcciónM-I> == <direcciónM-D>: determina si dos direcciones a matrices del mismo tipo son iguales;

* <direcciónM-I> != <direcciónM-D>: determina si dos direcciones a matrices del mismo tipo son distintas;

* <direcciónM>[ <expreción>]: accede a la referencia del vector de tipo primitivo que ocupa la posición dada por la expreción entera,numeradas de 0 al anterior a la longitud;

a|

[source,java]
....
int [] [] matriz = new int [4] [5];
int [] [] piramide = new int [3] [];
piramide[0] = new int[7];
piramide[1] = new int[5];
piramide[2] = new int[3];
matriz[0] [0] = piramide [2] [2];
matriz = piramide;
// se pierden los 20 primeros enteros
matriz[0] = matriz[2];<1>
matriz[1] = matriz[2];<1>
/* piramide y matriz mantienen 3 referencias
   a los mismos 3 enteros */
matriz = null;
piramide = null;<1>
....
<1> se libera la memoria automáticamente cuando ninguna referencia apunta a un vector o matriz

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust3_process_oriented/ust0_index.adoc ===== -->

## Programación Orientada a Procesos






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust0_index.adoc ===== -->

## Programación Basada a Objetos

// [cols="10,30,30,30",options="header"]
// |===

// a|
// a|*[blue]#Definición#*
// a|[blue]#Clases#
// a|[blue]#Objetos#

// .2+a|
// Determina el ámbito donde se puede referenciar la declaración de un miembro de la clase: atributo o método.

// a|*[blue]#Vista Pública:#* conocido en cualquier punto de la aplicación (antes de la declaración, después y en cualquier otro fichero)

// a|- *Interfaz:* 
// * Nombre de la Clase 
// * Cabecera de los métodos
// a|* Creación de Objetos 
// * Paso de Mensajes 
// * Destrucción de Objetos

// a|*[blue]#Vista Privada:#* conocido en cualquier punto de la clase (antes y después de la declaración, pero en la implementación de la clase)

// a|- *Implementación:*
// * Definición de Atributos
// * Definición de Métodos

// a|* Desencadenamiento de Objetos
// * Desencadenamiento de Mensajes
// |===

// [cols="50,30,20"]
// |===

// a|

// * _Al crear objetos y lanzarles mensajes, se debe respetar la interfaz de sus clases_ =>

// **  Vista Pública de las Clases

// **  Vista Pública de los Objetos

// * _Al definir atributos de una clase (generalmente, objetos de otras clases) y definir sus métodos (generalmente, lanzando mensajes a los objetos atributos), se debe respetar, transitivamente, la interfaz de otras clases_ =>

// 2+a|
// ** Vista Privada de las Clases

// * _Al crear un objeto se produce un desencadenamiento de instanciaciones y al lanzar un mensaje se produce un
// desencadenamiento de mensajes, acorde a la definición de atributos y de métodos de la clase del objeto_ =>

// ** Vista Privada de Objetos

// 2+^a|
// image::Dependencias.jpg[height32]

// ^.^a|
// * _Las flechas indican las dependencias de cada apartado_

// |===

[cols="40,60"]
|===

a|
- Una clase es una colección heterogénea de 
* [blue]*atributos*, variables o constantes o colecciones de éstos u otros objetos cuyos valores determinan las características de la [blue]*clase, tipo, tipo de entidad, concepto, unidad*, ... 
* y [blue]*métodos*, algoritmos disponibles para manipular (añadir, eliminar, modificar, consultar) las características de la [blue]*clase, tipo, tipo de entidad, concepto, unidad*, ... 

a|
* _la clase Intervalo implanta el concepto de un segmento limitado por un mínimo y un máximo:_
**  _intervalo de horas laborales [8,15]_
**  _intervalo de la capacidad de memoria de los pc’s de un laboratorio [1.2,4]_
**  _intervalo de la tensión arterial aconsejable para una persona [8.4,14.3]_
** ...
* contempla operaciones como:
** _desplazar_
** _longitud__
** ...

|===

include::ust1_classes_public_view/ust0_index.adoc[]
include::ust2_objects_public_view/ust0_index.adoc[]
include::ust3_classes_private_view/ust0_index.adoc[]
include::ust4_object_private_view/ust0_index.adoc[]
include::ust5_static.adoc[]
include::ust6_wrapper_classes.adoc[]
include::ust7_string.adoc[]
include::ust8_enumerates.adoc[]

// === Síntesis

// [cols="20,80"]
// |===

// a|
// - Clases con miembros, atributos y métodos, públicos y privados
// * En la implantación de la clase
// ** Métodos de instancia, públicos o privados, acceden a miembros públicos o privados de instancia o estáticos
// ** Métodos estáticos, públicos o privados, acceden a miembros públicos o privados estáticos
// * Fuera de la implantación de la clase
// ** Se accede a cualquier miembro, atributo o método, de instancia o estático público

// a|
// [source, java]
// ....
// include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a3_basadaObjetos/a_clazz/Clazz.java[]
// ....

// |===

// [cols="20,80"]
// |===

// a|
// - Los métodos pueden generar nueva información (retorno) y recibir información (parámetros)
// * Argumentos
// ** Sobrecarga
// * Retorno

// a|
// [source, java]
// ....
// include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a3_basadaObjetos/a_method/Clazz.java[]
// ....

// |===

// [cols="35,65"]
// |===

// a|
// - Los enumerados son clases que enumeran la existencia de todos sus objetos impidiendo la creación de posteriores instanciaciones
// * Constructor privado
// * Disfruta de métodos:
// ** _values()_, método estáticco que retorna un _array_ con todos los objetos enumerados según su enumeración
// ** _ordinal()_, método de instancia que retorna la posicion (0, 1, ...) dentro de la enumeración
// ** _name()_, método de instancia que retorna un String con el identificador del enumerado

// a|
// [source, java]
// ....
// include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a3_basadaObjetos/a_enum/a_enum/Enun.java[]
// ....

// |===

// [cols="20,80"]
// |===

// a|
// - Cada enumerado sería un objeto de la clase público y estático
// - las funciones _values_, _ordinal_ y _name_ se generan siempre igual

// a|
// [source, java]
// ....
// include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a3_basadaObjetos/a_enum/a_clazz/Enun.java[]
// ....

// |===


// [cols="33,33,33", options="header"]
// |===

// 3+a| [green]*Aplicaciones*

// a|
// - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/managers/services/v0_0[_servicesContract_]

// a| 
// - ticTacToe.models.
// * link:https://github.com/USantaTecla-0-general/0-domains/blob/master/games/ticTacToe/1-domain/README.md[domain]
// * link:https://github.com/USantaTecla-0-general/0-domains/blob/master/games/ticTacToe/4-programming/1-basic/README.md[requirements] 
// * link:https://github.com/USantaTecla-tech-java/game-ticTacToe/blob/master/domainModel/basic/README.md[design]
// * link:https://github.com/USantaTecla-tech-java/game-ticTacToe/tree/master/domainModel/basic/src/main/java/usantatecla[_src_] 

// a| 

// a| 
// a|


// |===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust1_classes_public_view/ust0_index.adoc ===== -->

### Vista Pública de las Clases

include::ust1_name.adoc[]
include::ust2_method_signature.adoc[]
include::ust3_method_overload.adoc[]
include::ust4_constructors.adoc[]
include::ust5_destructors.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust1_classes_public_view/ust1_name.adoc ===== -->

#### Nombre de la Clase

[cols="33,33,33", options="header"]
|===

a| *[blue]#Sintaxis#*
2+a| [blue]_Ejemplo_

a|
[source,java]
....
class  <NombreClase> {
}
....

a|
[source, java]
....
class Interval {
}
....

a|
[source,java]
....
class Coordinate {
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust1_classes_public_view/ust2_method_signature.adoc ===== -->

#### Cabecera de Métodos de la Clase

[cols="50,50"]
|===

a| [blue]*Sintaxis*
a| [blue]*__Ejemplo__*
a|
[source,java]
....
public <tipo1> <nombreMetodo> ( {<tipo2> <parametro>, ...}* )
....
* el _tipo~1~_ indica el [blue]*tipo del valor devuelto*, que puede ser:_
** [blue]*__void__*, nada, dado que el efecto será un cambio de estado en el objeto y/o sistema
** _<primitivo/Clase>_, un [blue]#valor de tipo primitivo o una referencia a un objeto de una clase#
** _<primitivo/Clase>[]_, [blue]#una referencia a un vector de valores de tipos primitivos o de referencias a objetos#
** _<primitivo/Clase>[][]_, [blue]#una referencia a una matriz de valores de tipos primitivos o de referencias a objetos#
** ...

* el [blue]*nombre del método* debe comenzar con minúscula_
* el _tipo~2~_ puede ser igual que _tipo~1~_ excepto_ [red]*_void_*
** todos los [blue]*parámetros son pasados por valor*

a|

[source,java]
....
class Interval {
  public void shift(double shiftment) {...}
  public void adjust(Interval interval) {...}
  public double length() {...}
  public boolean includes(Interval interval) {...}
  public boolean equals(Interval interval) {...}
  public Interval symetric() {...}
  public Interval shifted(double shifment) {...}
  public Interval intersección(Interval interval) {...}
  public double[] values(int times) {...}
  public Interval[] split(int times) {...}
  ...
}
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust1_classes_public_view/ust3_method_overload.adoc ===== -->

#### Sobrecarga de Métodos de la Clase 

[cols="35,65", options="header"]
|===

a|*[blue]#Descripción#*
a|*[blue]#Ejemplo#*

a|
- Varios métodos pueden tener el mismo nombre con las siguientes restricciones:
* [red]*si están en la misma clase*, deben [blue]*diferenciarse en el número o tipo de parámetros comparados dos a dos*;
* [green]*si están en distintas clases*, no existe restricción;


a|
[source,java]
....
class Interval {
  public Interval(double min, double max) {...}
  public Interval(double max) {...}
  public Interval() {...}
  public Interval(Interval interval) {...}
  public Interval(String string) {...}
  public boolean includes (double point) {...}
  public boolean includes (Interval interval) {...}
  public boolean isValid() {...}
  ...
}

class Coordinate {
  public boolean isValid ()
  ...
}

....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust1_classes_public_view/ust4_constructors.adoc ===== -->

#### Constructores de la Clase

[cols="45,55", options="header"]
|===

a|*[blue]#Descripción#*
a|*[blue]#Ejemplo#*

a|
- Son [blue]*métodos que reúnen las tareas de inicialización*, [red]*no construyen*, y se lanzan implícimatemente en la construcción de objetos. Cumplen:
* no devuelven nada, ni *void*;
* deben coincidir su nombre con el de la clase;
* no se pueden lanzar mensajes que se correspondan con los constructores de la clase._

a|
[source,java]
....
class Interval {
  public Interval(double min, double max) {...}
  public Interval(double max) {...}
  public Interval() {...}
  public Interval(Interval interval) {...}
  public Interval(String string) {...}
  ...
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust1_classes_public_view/ust5_destructors.adoc ===== -->

#### Destructores de la Clase

[cols="40,60",options="header"]
|===

a|*[blue]#Descripción#*
a|*[blue]#Ejemplo#*

a|
Son métodos que reúnen las tareas de liberación de recursos (no destruyen) y se lanzan automáticamente en la destrucción de objetos. *Además:*

a|
* _su cabecera debe ser:_ 

[source,java]
....
public void finalize()
....

* _no se pueden lanzar mensajes que se correspondan con los destructores de la clase._ 

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust2_objects_public_view/ust0_index.adoc ===== -->

### Vista Pública de los Objetos

include::ust1_new.adoc[]
include::ust2_reference.adoc[]
include::ust3_messages.adoc[]
include::ust4_new_array.adoc[]
include::ust5_refence_array.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust2_objects_public_view/ust1_new.adoc ===== -->

#### Creación de objetos

[cols="25,35,35, options="header"]
|===

a|
a|*[blue]#Sintaxis f#*
a|*[blue]#Ejemplo#*

a|
*new* es un operador unario prefijo cuyo operando es una clase de objetos y devuelve la dirección de memoria donde se ha reservado el espacio para dicho objeto;

a|

image::SintaxisF.jpg[height32]

* _donde la lista de expresiones debe coincidir con la lista de parámetros de alguno de los constructores de la clase; en caso de no existir, la lista debe ser vacía._

a|

[source,java]
....
new Intervalo()
new Intervalo(100)
new Intervalo(11.5, 55.1)
new Intervalo(new Intervalo(-1, 1))
....
|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust2_objects_public_view/ust2_reference.adoc ===== -->

#### Referencia a un objeto

[cols="20,40,40", options="header"]
|===

a|
a|*[blue]#Sintaxis#*
a|*[blue]#Ejemplo#*

a|
Es una variable puntero que alberga la dirección de un objeto de una clase.

a|
image::Referencia (2).jpg[height32]

* *final* obliga a la inicialización y fija su valor para la referencia 

^.^a|
image::EjemploReferencia (2).jpg[height32]

|===

[cols="50,50", options="header"]
|===

a|*[blue]#Operadores#*
a|*[blue]#Ejemplo:#*

a|
* _<referenciaO> = <direcciónO>: asigna la dirección a la referencia siendo del mismo tipo;_ 

* _<direcciónO-I> == <direcciónO-D>: determina si dos direcciones a objetos de la misma clase son iguales;_ 

* _<direcciónO-I> != <direcciónO-D>: determina si dos direcciones a objetos de la misma clase son distintas;_ 

a|

[source,java]
....
final Intervalo HORARIO = new Intervalo(7, 15);
Intervalo edades = new Intervalo(100);
Intervalo años;
años = edades;
boolean mismo = edades == años;
…
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust2_objects_public_view/ust3_messages.adoc ===== -->

#### Paso de mensajes

[cols="50,50", options="header"]
|===

a|*[blue]#Sintaxis#*
a|*[blue]#Ejemplo#*

a|
[source,java]
....
<expressioin>.<methodName>([<expression>{, <expression>})]
....

* _donde el método (sin contemplar constructores ni destructores) debe estar presente en la interfaz de la clase del objeto y la lista de expresiones debe coincidir en número y tipos a la lista de parámetros del método;_

a|

[source,java]
....
intervalo.longitud()
new Intervalo(-100, 100).longitud()
edades.partido(5)
años.incluye(88)
edades.interseccion(años)
...
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust2_objects_public_view/ust4_new_array.adoc ===== -->

#### Creación de vectores de objetos

[cols="40,45,15", options="header"]
|===

a|
a|*[blue]#Sintaxis g#*
a|*[blue]#Ejemplo#*

a|
*new* es operador unario prefijo cuyo operando es un vector de referencias a objetos de una clase y devuelve la dirección de memoria donde se ha reservado el espacio para dicho vector;

a|
image::SintaxisG.jpg[height32]

* donde la expresión debe ser de tipo entero y determina la longitud de referencias del vector inicializadas a *null*;

a| 
[source,java]
....
new Intervalo[100]
....

|===


[cols="50,50", options="header"]
|===

a|*[blue]#Sintaxis h#*
a|*[blue]#Ejemplo#*

a|

[source,java]
....
new <Clase>[] {<expresion>,..., <expresion>}
....

* donde cada expresión debe ser una dirección a un objeto de la clase que inicializan las referencias del vector creado de longitud igual al número de expresiones; 

a|

[source,java]
....
   Intervalo intervalo = new Intervalo();
new Intervalo[] {new Intervalo(), null, intervalo}
....

image::EjemploSintaxisH.jpg[height32]

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust2_objects_public_view/ust5_refence_array.adoc ===== -->

#### Referencia a un vector de referencias a objetos

[cols="10,45,45", options="header"]
|===

a|*[blue]#Definición#*
a|*[blue]#Sintaxis#*
a|*[blue]#Ejemplo#*

a|
Es una variable puntero que alberga la dirección de un vector de referencias a objetos  de una clase.

a|
image::Referencia2.jpg[heigt32]

* *final* obliga a la inicialización y fija su valor para la referencia 

a|
[source,java]
....
Intervalo[] intervalos;
....

image::EjemploReferencia2 (2).jpg[height32]


[source,java]
....
Intervalo[] intervalos = new Intervalo[10];
intervalos[0] = new Intervalo ();
intervalos[1] = intervalos[0].desplazados(1);
intervalos[intervalos.length-1] = new Intervalo(2,2);
Intervalo intervalo = intervalos[1];
intervalos = null;<1> 
...
....
<1> _Se libera automáticamente toda la memoria de las referencias del vector y de cada objeto excepto del segundo intervalo porque nadie está apuntando a dichos elementos;_ 

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust0_index.adoc ===== -->

### Vista Privada de las Clases

[cols="20,16,24,22,18", options="header"]
|===

a| [blue]*Definición de Atributos*
a| [blue]*Definición de Constructores*
a| [blue]*Definición de Métodos* 
a| [blue]*Referencia __this__* 
a| [blue]*Métodos privados*

a| - [blue]#datos constantes y/o variables de tipos primitivos y/o referencias a objetos y/o tablas#
a| - [blue]#inicialización de los atributos de la clase#
a| - [blue]#operaciones con sentencias secuenciales, alternativos, iterativas, expresiones (asignación) y/o de retorno#
a| - [blue]#para la resolución de colisión de identificadores y reutilización de métodos dentro de la clase#
a| - [blue]#para la reutilización de métodos dentro de la clase#

|===

[cols="55,45", options="header"]
|===

a| [green]*Aserciones* 
a| [green]*Objetos valor*

a| - [green]#verificación del correcto estado del entorno del mensaje, atributos, parámetros, entorno, ...# para la [green]*seguridad al procesar los datos*
a| - [green]#clases cuyos objetos no cambian de estado (conjunto de estados de sus atributos) tras su creación#

|===

include::ust1_attributes.adoc[]
include::ust2_constructors.adoc[]
include::ust3_methods.adoc[]
include::ust4_this.adoc[]
include::ust5_private_methods.adoc[]
include::ust6_assertions.adoc[]
include::ust7_value_object.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust1_attributes.adoc ===== -->

#### Definición de atributos

[cols="45,20,25"]
|===

.3+a| - Se [blue]*declaran variables y/o constantes de tipos primitivos, referencias a objetos o vectores* de éstos 
- anteponiendo la palabra [blue]*private* 
* En [red]#cualquer punto de la implementación# de la clase pero lo lógico es [green]#al principio de la declaración de la clase#

a|
[source,java]
....
class <class> {
   private <declaration>
   private <declaration>
   ...
}
....

a|
[source,java]
....
class Interval {
   private double min;
   private double max;
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust2_constructors.adoc ===== -->

#### Definición de constructores

[cols="30,70"]
|===

a|
- Reservado para las [blue]*tareas de inicialización de los atributos* del objeto, evitando la creación de objetos incosistentes
* A [blue]*falta de inicialización explícita*, [red]*no recomendado*, se inicializan a [blue]*valores por defecto*, dependiendo de su tipo ([blue]#__0__ para tipos numéricos, __false__ para el tipo __boolean__, caracter nulo para tipo __char__  y __null__ para referencias#);

a|
[source, java]
....
class Interval

  private double min;
  private double max;

  public Interval(){
    min = 0;
    max = 0;
  }

  public Interval(double maximum){
    min = 0;
    max = maximum;
  }

  public Interval(double minimum, double maximum){
    min = minimum;
    max = maximum;
  }
  ...

....

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust3_methods.adoc ===== -->

#### Definición de metodos

[cols="50,50"]
|===

a| - En cualquier punto de la implementación de la clase, [blue]*se define el cuerpo de las cabeceras de los métodos acompañándolos de una sentencia secuencial* que contiene las declaraciones locales y sentencias que se consideren oportunas
* dentro del cuerpo del método se tiene [blue]*acceso a los atributos, los parámetros del método y a las declaraciones locales* desde las expresiones de la anidación jerárquica de sentencias
* la [blue]*notación punto* para el paso de mensajes sirve también para acceder a los atributos de un objeto de la misma clase

[source,java]
....
clase <class> {
  public <methodHeader> <sequentialSentence>
  public <methodHeader> <sequentialSentence>
  ...
}
....

a|
[source, java]
....
class Interval {
  private double min;
  private double max;

  public void shift (double amount) {
    min += amount;
    max += amount;
  }

  public Interval(Interval interval){
    min = interval.min;
    max = interval.max;
  }

  public boolean equals(Intervalo interval) {
    return min == interval.min && max == interval.max;
  }
  ...
....

|===

[cols="45,55"]
|===

a| - si el [blue]*tipo devuelto* no es_ *void*, se determinará el valor devuelto por el método con la siguiente sentencia:

[source, java]
....
  return <expression>;
....

a|
[source, java]
....
public double length() {
  return max - min;
}

public boolean includes(double point) {
  return min <= point && point <= max;
}

public boolean valid() {
  return min <= max;
}
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust4_this.adoc ===== -->

#### Referencia _this_

[cols="70,30"]
|===

a| - *this* es una [blue]*referencia constante que guarda la dirección del objeto que recibe el mensaje correspondiente al método que se está definiendo*, implícitamente existe en todas las clases:

[source,java]
....
  private final <class> this;
....

- Sirve para [blue]*resolución de ambigüedades en la colisión* de parámetros o declaraciones locales con el mismo nombre que los atributos;
* [red]*Evita la multiplicidad de identificadores innecesarios*

a| 
[source,java]
....
public Interval(double min, double max) {
  this.min = min;
  this.max = max;
}
....

|===

[cols="35,65"]
|===

a| - Sirve para la [blue]*reutilización de contructores en la definición de otros constructores*, siendo la primera sentencia del constructor, mediante la sintaxis:

[source,java]
....
  this([ <expression> {, <expression> }]);
....

a|
[source, java]
....
  public Interval() {
    this(0, 0);
}

  public Interval(double max) {
    this(0, max);
  }

  public Interval(Interval interval) {
    this(interval.min, interval.max);
  }
....

a|
- Sirve para la [blue]*reutilización de métodos* en la codificación de otros métodos;

a|
[source,java]
....
public boolean includes(Interval interval) {
  return this.includes(interval.min) &&
    this.includes(interval.max);
}

public void escale(double escale) {
  final double newHalfLength = this.length()/2 * escale;
  final double middlePoint = this.middlePoint();
  this.min = middlePoint - newHalfLength;
  tnis.max = middlePoint + newHalfLength;
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust5_private_methods.adoc ===== -->

#### Métodos privados

[cols="60,40"]
|===

a| - Sirve para la [blue]*reutilización de métodos en la codificación de otros métodos*
* dado que puede ser conveniente disponer de métodos, que [blue]*no han sido solicitados, para implementar otros métodos*, cabe la posibilidad de definir métodos de ámbito privado que sólo se pueden usar en la implementación de la clase:

[source,java]
....
class <class> {
   private <methodHeader> <sequentialSentence>
   private <methodHeader> <sequentialSentence>
   ...
}
....

a|
[source, java]
....
public Interval shifted(double amount) {
   Interval interval = this.clone();
   interval.shift(amount);
   return interval;
}

private Interval clone() {
  return new Interval(this);
}
....

|===


[cols="50,50", options="header"]
|===

2+a| [blue]_Resumen de Implantación de Clases_

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a3_basadaObjetos/a1_clazz/App.java[]
....

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a3_basadaObjetos/a1_method/App.java[]
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - Fraction - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a1_classes/Fraction.java[_Fraction_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a1_classes/App.java[_App_]

a|
a|

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust6_assertions.adoc ===== -->

#### Aserciones

[cols="40,40,20"]
|===

a| - [red]*Error* es una [red]#acción que produce un resultado incorrecto#
a| - [red]*Defecto* es la [red]#imperfección de un componente causado por un error#
a| - [red]*Fallo* es la [red]#manifestación visible de un defecto#

a|
* _Ej. un conductor analiza mal el contexto de la circulación_
* _Ej. un programador escribe mal una sentencia, incumpliendo reglas léxico/ sintáctico/ semánticas_
* _Ej. un programador diseña mal un algoritmo, produciendo un bucle infinito_

a| 
* _Ej. un conductor establece una velocidad, giro, ... inadecuados_
* _Ej. un programa produce una incompatibilidad de tipos entre un operador y un operando_
* _Ej. un programa con una condición en una sentencia iterativa infinita_

a| 
* _Ej. se produce un accidente_
* _Ej. el programa no compila_
* _Ej. el programa no responde_

|===

[cols="26,37,37", options="header"] 
|===

3+a| [blue]*Tipos de Errores*

.2+a|
* [blue]*_Errores en Tiempo de Compilación_* producidos por el incumplimiento de las 
** reglas léxicas, 
** reglas sintácticas y/o 
** reglas semánticas del lenguaje fuerte o débilmente tipado;

2+a| - [blue]*Errores en Tiempo de Ejecución* 

a| * [blue]*Errores Lógicos* producidos por la lógica de un programa que no contempla todos los posibles situaciónes del sistema de información
** Se [green]*gestionan con sentencias __assert__* para las pre-condiciones
** Se [green]*gestionan con pruebas del software* para las post-condiciones

a| * [blue]*Errores Excepcionales* producidos por recursos (bibliotecas / _frameworks_ para gestión de ficheros, comunicaciones, ..., arquitectura) fuera del ámbito del software que los maneja. 
** Se [red]*gestionan con objetos de la clase __Exception__ y la sentencia __try/catch/finally__*

|===

[cols="18,41,41", options="header"] 
|===

a| [blue]*Contexto*
a| [blue]*Aplicación*
a| [blue]*Biblioteca*

.5+a| - ciertos errores lógicos (ej.: un valor negativo para calcular un factorial, una referencia sin la dirección del objeto, ...) pueden ser un error lógico o excepcional [blue]*dependiendo del software en el que se está desarrollando*:

a| *  [green]*debe responsabilizarse de la detección y subsanación de los errores lógicos dentro de su ámbito* durante el desarrollo.
** los [blue]*errores en la entrada de datos del usuario* [red]*no son errores del desarrollo* y se solventan mediante la [green]*validación de la entrada de datos, sentencia iterativa hasta alcanzar la condición deseada*

a| *  [red]*NO puede responsabilizarse del uso indebido de los servicios prestados a las aplicaciones y NUNCA debe responsabilizarse de la subsanación de dichos errores*. 
** En estos casos, estos [red]*errores lógicos se considerarán excepcionales* porque la causa del error está [red]*fuera de los límites del software* de la biblioteca.

2+^.^a|  _Ej. la función factorial contemplará:_

2+a|
** _pre-condiciones para verificar si la entrada es correcta (el argumento no es negativo) mediante_
a|
** _la sentencia assert en el código de producción_
a|
** _la elevación de una excepción en el código de producción_

2+a|
** _post-condiciones para verificar si la salida es correcta (n! = 1 si n = 0 si no n * (n-1)!) mediante la librería aseertThat en el código de pruebas_

|===

[cols="60,40"]
|===

a|
[source,java]
....
class Interval {
  ...
  public Interval[] split(int times) {
    Interval[] intervals = new Interval[times];
    final double length = this.length() / times;
    final double min = this.min;
    final double max = min + length;
    for (int i = 0; i < times; i++) {
      intervals[i] = new Interval(min, max);
      min = max;
      max += length;
    }
    return intervals;
  }
  ...
}

class App {

  public static void main(String[] args){
    Console console = new Console();
    Interval interval = new Interval();
    interval.read();
    int times = console.readInt("¿Partir en cuántas veces? ");
    Interval[] intervals = interval.split(times);
  }
}
....

a| - _cuando se solicita el número de veces, si el usuario introduce un valor negativo, se produce un error de ejecución, se muestra por pantalla un informe del error producido (reserva de un vector cuyo tamaño es negativo), y finaliza la ejecución del programa_

[source, java]
....
Introduce el minimo: 1
Introduce el maximo: 5
Veces: -1
Exception in thread "main" java.lang.NegativeArraySizeException
        at Intervalo.valores (Intervalo.java:141)
        at Aplicacion.main (Aplicacion.java:7)

....

|===

[cols="25,75", options="header"]
|===

2+a| [red]*Programación defensiva*

a| - [red]_si se trata de una aplicación, la solución NO es que el método compruebe la corrección de su argumento y que, en el **caso de que no sea correcto, gestione el error acoplándose con un mensaje a la consola, ...**_:

a|
[source, java]
....
class Interval {
  ...
  public Interval[] split(int times) {
    if (times < 0) {
      new Console().writeln("El numero de veces debe ser positivo");
      return null;
    }
    Interval[] intervals = new Interval[times];
    final double length = this.length() / times;
    final double min = this.min;
    final double max = min + length;
    for (int i = 0; i < times; i++) {
      intervals[i] = new Interval(min, max);
      min = max;
      max += length;
    }
    return intervals;
  }
}
....

a| - [red]_si se trata de una aplicación, la solución NO es que el método compruebe la corrección de su argumento y que, en el **caso de que no sea correcto, devuelva una valor que indique que hay un error**_:

a|
[source, java]
....
class Interval {
  ...
  public Interval[] split(int times) {
    if (times < 0) {
      return null;
    }
    Interval[] intervals = new Interval[times];
    final double length = this.length() / times;
    final double min = this.min;
    final double max = min + length;
    for (int i = 0; i < times; i++) {
      intervals[i] = new Interval(min, max);
      min = max;
      max += length;
    }
    return intervals;
  }
}
....

|===

[cols="40,20,40", options="header"]
|===

a| [red]*Falta de cohesión*
2+a| [green]*Validación de datos*

a|
[source, java]
....
class App {

  public static void main(String[] args){
    Console console = new Console();
    Interval interval = new Interval();
    interval.read();
    Interval[] intervals;
    do {
      int times = console.readInt("¿Partir en cuántas veces? ");
      intervalos = intervalo.troceado(veces);
    } while (intervalos != null);
  }
}
....

a| * [green]_si se trata de una aplicación, la solución es que, al leer el argumento, se **valide** su corrección y que, en el caso de que no sea correcto, [red]**no se invoque al método** y se comunique y requiera de nuevo al usuario_:

a|
[source,java]
....
class App {

  public static void main(String[] args){
    Console console = new Console();
    Interval interval = new Interval();
    int times;
    do {
      times = console.readInt("¿Partir en cuántas veces? ");
      if (times <= 0) {
         console.writeln("El numero de veces debe ser positivo");
      }
    } while (times <= 0);
    Interval[] intervals = interval.split(times);
  }
}
....

|===

[cols="57,43", options="header"]
|===

a| [blue]*Sentencia __assert__*
a| [blue]__Ejemplo__

a| - [blue]*Sintaxis*

[source,java]
....
  assert <expresión1> [ : <expresión2> ] ;
....

- Cada [blue]*aserción contiene una expresión lógica* (<expresión~1~>) que se [green]*supone cierta* cuando se ejecute la sentencia
* [red]*en caso contrario, el sistema finaliza la ejecución* del programa y avisa del defecto detectado
* opcionalmente, se puede [blue]#acompañar de una cadena de caracteres# (<expresión~2~>) para detallar el error detectado
- La experiencia ha demostrado que escribir aserciones es una de las formas más rápidas y efectivas para detectar y corregir errores lógicos en desarrollo, [green]*Diseño por Contrato*
** si se desea comprobar en el método la corrección de su argumento, debe incluirse una aserción como [green]*pre-condiciones*
** [green]#las aserciones permiten eliminar estas comprobaciones automáticamente en la ejecución del código de producción para evitar la finalización abrupta del programa en fase de explotación#

a|
[source,java]
....
class Interval {
  ...
  public Interval[] split(int times) {
    assert times > 0 : "El numero de veces no es positivo";

    Interval[] intervals = new Interval[times];
    final double length = this.length() / times;
    final double min = this.min;
    final double max = min + length;
    for (int i = 0; i < times; i++) {
      intervals[i] = new Interval(min, max);
      min = max;
      max += length;
    }
    return intervals;
  }
}
....

|===

[cols="20,50,30"]
|===

a| * [red]_si se está desarrollando una biblioteca, entonces sí que deberemos responsabilizarnos de comprobar los argumentos que se reciben en los métodos, porque están fuera del ámbito de la biblioteca, junto con la consiguiente gestión de excepciones para comunicar de la situación al error_:

a|
[source,java]
....
class Interval {
  ...
  public Interval[] split(int times) throws Exception {
    if (times < 0) {
      throw new Exception("El numero de veces no es positivo")
    }

    Interval[] intervals = new Interval[times];
    final double length = this.length() / times;
    final double min = this.min;
    final double max = min + length;
    for (int i = 0; i < times; i++) {
      intervals[i] = new Interval(min, max);
      min = max;
      max += length;
    }
    return intervals;
  }
}
....

a|
[source,java]
....
class App {

  public static void main(String[] args){
    Console console = new Console();
    Interval interval = new Interval();
    int times;
    ...
    try {
      Interval[] intervals = interval.split(times);
      ...
    } catch (Exception ex){
      // gestión de error
    }
  }
}
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - Fraction - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a3_asserts/Fraction.java[_Fraction_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a3_asserts/App.java[_App_]

a|
a|

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust3_classes_private_view/ust7_value_object.adoc ===== -->

#### Objetos Valor

[cols="50,50"]
|===

a| - En el caso de que los atributos sean [blue]*constantes, puede postergarse la inicialización obligatoria al cuerpo de todos los constructores*. 
* Una vez [blue]#inicializadas, ya no es posible la asignación de nuevos valores#.

a|
[source,java]
....
class Person  {
  public final short ADULT = 18; 
  private short age;
  private final int DNI;
   
  public Person(int dni) {
    age = 0;
    DNI = dni;
  }
  ...
}
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - Fraction - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a3_values/Fraction.java[_Fraction_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a3_values/FractionView.java[_FractionView_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a3_values/App.java[_App_]

a|
a|

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust4_object_private_view/ust0_index.adoc ===== -->

### Vista Privada de los Objetos

[cols="53,48", options="header"]
|===

a| *[blue]#Desencadenamiento de instanciaciones#*
a| *[blue]#Desencadenamiento de mensajes#*

a|
-  se [blue]*crea un objeto* (instancia):
* por lo que, se crean los atributos definidos en la clase;
* por lo que, se ejecuta la inicialización de los atributos con posibles [blue]*creaciones de nuevos objetos*;
* por lo que, se ejecuta el constructor en la creación del objeto con posibles [blue]*creaciones de nuevos objetos*;
* Donde, [green]*recursivamente*, pueden crear nuevos objetos de otras clases hasta llegar, de esta manera, a la creación de objetos que se basan directamente en tipos primitivos.

a|
- se [blue]*lanza un mensaje* a un objeto:
* por lo que se crean las declaraciones locales con su inicialización y se ejecuta el cuerpo del método correspondiente
* por lo que se pueden [blue]*lanzar nuevos mensajes* a objetos que sean atributos de su clase, a objetos que sean argumentos del mensaje o a objetos que se crean en su ejecución
* Donde, [green]*recursivamente*, pueden lanzar nuevos mensajes en la definición de sus respectivos métodos hasta llegar, de esta
manera, a la definición de métodos que se basan directamente en tipos primitivos.

a|
[source, java]
....

class Person {
  ...
  private MedicalRecord medicalRecord;
  private AcademicRecord academicRecord;
  ...

  public Person(...) {
    ...
    this.medicalRecord = new MedicalRecord();
    this.academicRecord = new AcademicRecord();
    ...
  }
}

class MedicalRecord {
  ...
}

class AcademicRecord {
  ...
}

....

a|
[source, java]
....

class Person {
  ...

  public boolean isAdult() {
    return this.age > Person.ADULT;
  }

  public void writeln() {
    ...
    new Console.writeln("Age: " + this.age + (this.isAdult() ? " (adult)" : ""));
    this.medicalRecord.writeln();
    this.academicRecord.writeln();
  }

}
....

|===


[cols="30,40,30"]
|===

a| - el [blue]*desencadenamiento de instanciaciones puede provocar un desencadenamiento de mensajes* a través de la ejecución de los constructores que pueden lanzar mensajes;

a|
[source,java]
....
public Intervalo(Intervalo intervalo) {
  this(intervalo.minimo, intervalo.maximo);
}

private Intervalo copia() {
  return new Intervalo(this);
}
....

a| - el [blue]*desencadenamiento de mensajes puede provocar un desencadenamiento de instanciaciones* a través de la creación de objetos en la definición de los métodos.

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-tech-java/src/tree/cdf6862fac6b5bc6bba3652b857050a11c2efada/src/main/java/es/usantatecla/aX_managers/services/a1_classes[_ServicesContract_] 


a| - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a0_classes[_List_] 

a|

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust5_static.adoc ===== -->

### Miembros de Clase

[cols="50,50", options="header"]
|===

a| [green]*Miembros de instancia*
a| [red]*Miembros de clase o estáticos*

a| - Los miembros de instancia asumen los [green]*aspectos, datos y operaciones, particulares/locales de/a cada objeto de la clase*
a| - Los miembros de clase o estáticos asumen los [red]*aspectos, datos y operaciones, compartidos/globales por/a la comunidad de objetos de la clase* 

a|
* [green]*atributos de instancia* presentes en cada uno de los objetos de la clase; 
** Ej. _día, mes y año de una fecha concreta_
** [green]#si no hay objetos, no hay atributos de instancia#;

a|
* [red]*atributos de clase* compartidos por la globalidad de objetos de la clase; 
** Ej. _los nombres y duración de los meses de cualquier fecha, excepto en Febrero de años bisiestos, ..._
** [red]#si no hay objetos,# [red]*si* [red]#hay atributos de clase#;

a|
* [green]*métodos de instancia* cuyos mensajes se lanzan sobre un objeto particular de la clase;
** Ej. _si es primavera, si una fecha concreta se encuentra en una año bisiesto, ..._
** [green]#si no hay objetos, no hay mensajes#;

a|
* [red]*métodos de clase* cuyos mensajes NO se lanzan sobre un objetos particular;
** Ej. _si un año (de cualquier fecha, no de una fecha particular) es bisiesto_
** [red]#si no hay objetos,# [red]*si* [red]#se llama a métodos de clase#, [red]*no mensaje!!!*;

|===

[cols="50,50", options="header"]
|===

a| [blue]*Atributos estáticos*
a| [blue]*Métodos estáticos*

2+^.^a|
* caracterizados por la palabra reservada [blue]*static* tras su visibilidad;

a|
* su [blue]*reserva de memoria e inicialización obligatoria* se realiza al principio de la ejecución del programa, 
** [green]#en orden dentro de las declaraciones de la clase# pero 
** [red]#en desorden entre las distintas clases#
* [blue]#accesibles desde cualquier método, de instancia o estático, de la clase#;
* la notación [blue]#sintáctica# para el acceso desde las expresiones:

[source,java]
....
    <Clase>.<atributosEstático>
....

a|
* [green]#se permite el acceso a los atributos estáticos#;
* [red]*no se permite el acceso a __this__ ni a los atributos de instancia*;
* la notación [blue]#sintáctica# para la invocación/llamada/ejecución del método estático como sentencia de los métodos:

[source,java]
....
  <Clase>.<metodoEstatico>([<argumento> { <argumento>, }])
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/a5_units/a1_interval/a2_statics[_Interval_] 


a| - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/a5_units/a3_date/a2_statics[_Date_] 

a|

|===

[cols="35,30,35", options="header"]
|===

a| [blue]*Código estático*
a| [blue]*Sintaxis*
a| [blue]_Ejemplo_

a|
* sirve para la [blue]#inicialización de los atributos estáticos# cuando la [red]#expresión de inicialización no alcanza sus objetivos# y [blue]#requiere la ejecución de sentencias#
* se [blue]#ejecutan al comienzo de la ejecución del programa#, secuencialmente dentro de cada fichero y en cualquier orden entre distintos ficheros

a|
[source,java]
....
<atributoEstático>
static {
  <sentencia/declaración>
  …
  <sentencia/declaración>
}
....

a|
[source,java]
....
private static int[] coeficientes = null;
static {
  // lectura del fichero “coeficientes.sys”
}
....

|===

[cols="30,70", options="header"]
|===

a| [blue]*Método __main__*
a| [blue]_Ejemplo_

a|
- [blue]*Sintaxis*
[source, java]
....
public static void main(String[] args) { <1>
  ...
}
....
<1> método del que parte la ejecución, presente en las clases "principales"

.2+a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a3_basadaObjetos/a4_main/Clazz.java[]
....

a|
- [blue]*Ejecución*
[source, txt]
....
c:\>java Clase param1 param2 <1>
....
<1> _args[0].equals("param1") && args[1].equals("param2")_

|===



[cols="45,55", options="header"]
|===

a| [blue]*Clases de Utilidad*
a| [blue]_Clase_ link:https://docs.oracle.com/javase/7/docs/api/java/lang/System.html[_System_]

a|
- son clases que reúnen un [blue]*conjunto cohesivo de métodos estáticos*, ... [red]#cajón de-sastre# dentro de la [blue]*librería o proyecto*
* [blue]*Suelen no ser instanciables* porque no responden al concepto habitual de clases de objetos 
** se consigue a través [blue]*constructores privados* que eviten la creación de objetos de esa clase de utilidad

a|
[source,java]
....
public static void gc() {}<1>
public static void exit(int) {}<2>
public static long nanoTime() {}
public static long currentTimeMillis() {}
....
<1> _garbage collector_, invoca el recolector de basura que libera la memoria de todo objeto no referenciado; se llama automáticamente cuando el procesador está ocioso por interrupción de entrada/salida, ...
<2> invoca la salida incondicional del programa comunicando un código de error

|===

[cols="50,50", options="header"]
|===

2+a| [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html[_Math_]

a|
[source,java]
....
public static final double E;
public static final double PI;
public static double sin(double)
public static double cos(double)
public static double tan(double)
public static double asin(double)
public static double acos(double)
public static double atan(double)
public static double toRadians(double)
public static double toDegrees(double)
public static double exp(double)
public static double log(double)
public static double log10(double)
public static double sqrt(double)
public static double cbrt(double)
public static double IEEEremainder(double, double)
public static double ceil(double)
public static double floor(double)
public static double rint(double)
public static double atan2(double,double)
public static double pow(double,double)
public static int round(float)
public static long round(double)
public static double random()
public static int abs(int)
public static long abs(long)
public static float abs(float)
public static double abs(double)
public static int max(int, int)
public static long max(long, long)
...
....

a|
[source,java]
....
public static float max(float, float)
public static double max(double,double)
public static int min(int, int)
public static long min(long, long)
public static float min(float, float)
public static double min(double,double)
public static double ulp(double)
public static float ulp(float)
public static double signum(double)
public static float signum(float)
public static double sinh(double)
public static double cosh(double)
public static double tanh(double)
public static double hypot(double,double)
public static double expm1(double)
public static double log1p(double)
public static double copySign(double,double)
public static float copySign(float, float)
public static int getExponent(float)
public static int getExponent(double)
public static double nextAfter(double,double)
public static float nextAfter(float,double)
public static double nextUp(double)
public static float nextUp(float)
public static double scalb(double, int)
public static float scalb(float, int)
...
....

- [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/StrictMath.html[_StrictMathMath_]: con la misma interfaz pública y una implementación independiente de la máquina, sin cálculos nativos, [red]#menos eficiente# que _Math_, la cual es [red]#menos portable#

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust6_wrapper_classes.adoc ===== -->

### Clases de Recubrimiento

[cols="45,55", options="header"]
|===

a| [blue]*Clases de Recubrimiento*
a| [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html[_Character_]

a| - Aglutinan funciones de conversión entre los tipos primitivos y las correspondientes cadenas de caracteres junto con algunas otras funciones auxiliares particulares de cada tipo primitivo.
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html[_Character_]
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html[_Byte_]
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html[_Short_]
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html[_Integer_]
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html[_Long_]
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html[_Float_]
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html[_Double_]
* [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html[_Boolean_]

a|
[source,java]
....
class Character {
  Character(char)
  char charValue()
  int compareTo(Character)
  int hashCode()
  public static String toString(char)
  public static char[] toChars(int)
  public static boolean isLowerCase(char)
  public static boolean isUpperCase(char)
  public static boolean isTitleCase(char)
  public static boolean isDigit(char)
  public static boolean isDefined(char)
  public static boolean isLetter(char)
  public static boolean isLetterOrDigit(char)
  public static char toLowerCase(char)
  public static char toUpperCase(char)
  public static char toTitleCase(char)
  public static int getNumericValue(char)
  public static boolean isSpace(char)
  public static boolean isSpaceChar(char)
  public static boolean isWhitespace(char)
  ...
}
....

|===

[cols="43,57", options="header"]
|===

2+a| [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html[_Integer_]

a|
[source,java]
....
class Integer {
  public static final int MIN_VALUE;
  public static final int MAX_VALUE;
  public static final int SIZE;
  public Integer(int)
  public Integer(String)
  public byte byteValue()
  public short shortValue()
  public int intValue()
  public long longValue()
  public float floatValue()
  public double doubleValue()
  public String toString()
  public int hashCode()
  public int compareTo(Integer)
  ...
....

a|
[source, java]
....
  ...
  public static String toString(int, int)
  public static String toHexString(int)
  public static String toOctalString(int)
  public static String toBinaryString(int)
  public static String toString(int)
  public static int stringSize(int)
  public static int parseInt(String, int)
  public static int parseInt(String)
  public static Integer valueOf(String, int)
  public static Integer valueOf(String)
  public static Integer valueOf(int)
  public static Integer getInteger(String)
  public static Integer getInteger(String,int)
  public static Integer getInteger(String,Integer)
  public static Integer decode(String)
  public static void getChars(int, int, char[])
}
....

|===

[cols="61,39", options="header"]
|===

a| [blue]_Clase_ link:https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html[_Boolean_]
a| [blue]_Ejemplos_

a|
[source,java]
....
class Boolean {
  public static Boolean FALSE
  public static Boolean TRUE
  public Boolean(boolean value)
  public Boolean(String s)
  public boolean booleanValue()
  public String toString()
  public boolean equals(Object obj)
  public int compareTo(Boolean b)
  public int hashCode()
  public static int compare(boolean x, boolean y)
  public static boolean getBoolean(String name)
  public static int hashCode(boolean value)
  public static boolean logicalAnd(boolean a, boolean b)
  public static boolean logicalOr(boolean a, boolean b)
  public static boolean logicalXor(boolean a, boolean b)
  public static boolean parseBoolean(String s)
  public static Boolean valueOf(boolean b)
  public static Boolean valueOf(String s)
  public static String toString(boolean b)
}
....

a|
[source,java]
....
public Fecha(String cadena) {
  dia = Integer.parseInt(
    cadena.substring(0, cadena.indexOf("/")));
  cadena = cadena.substring(
    cadena.indexOf("/") + 1, cadena.length());
  mes = Integer.parseInt(
    cadena.substring(0, cadena.indexOf("/")));
  cadena = cadena.substring(
    cadena.indexOf("/") + 1, cadena.length());
  año = Integer.parseInt(cadena);
}

public String toString() {
  return dia + "/" + mes + "/" + año;
}
...
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust7_string.adoc ===== -->

### Cadenas de Caracteres

[cols="17,39,44", options="header"]
|===

a| [blue]*Definición*
a| [blue]*Constantes, inmutables*
a| [blue]*Variables, mutables*

a| - Son [blue]*secuencias de caracteres de cualquier longitud*, incluso [blue]*secuencia vacía*

a|
* cuyos caracteres no varían tras la creación 
** Implementadas bajo la clase  [blue]*String* [red]#sin contemplar métodos que modifiquen el estado del objeto#.
** _Ej. El nombre de una persona, de un mes, de una universidad, de un proyecto, ..._

a|
* cuyos caracteres sí varían tras la creación
** Implementadas bajo las clases [blue]*StringBuffer* (con sincronización en concurrencia) y [blue]*StringBuilder* (sin) [red]#con métodos que contemplan la modificación del objeto#
** _Ej. Membrete de una carta, párrafo de aviso, clausula de contrato, ..._

|===

[cols="50,50", options="header"]
|===

2+a| [blue]_Clase_ link:https://docs.oracle.com/javase/7/docs/api/java/lang/String.html[_String_]

a|
[source,java]
....
public String()
public String(String)
public String(char[])
public String(char[], int, int)
public String(int[], int, int)
public String(byte[], int, int, int)
public String(byte[], int)
public String(byte[], int, int)
public String(byte[])
public String(StringBuffer)
public String(StringBuilder)
public int length()
public boolean isEmpty()
public char charAt(int)
public byte[] getBytes()
public char[] toCharArray()
public String toString()
public void getChars(int, int, char[], int)
public void getBytes(int, int, byte[], int)

public CharSequence subSequence(int,int)
public String substring(int)
public String substring(int, int)

public int hashCode()
public int indexOf(String)
public int indexOf(String, int)
public int indexOf(int)
public int indexOf(int, int)
public int lastIndexOf(String)
public int lastIndexOf(String, int)
public int lastIndexOf(int)
public int lastIndexOf(int, int)

....

a|
[source,java]
....
public int codePointAt(int)
public int codePointBefore(int)
public int codePointCount(int, int)
public int offsetByCodePoints(int, int)

public boolean equals(Object)
public boolean equalsIgnoreCase(String)
public boolean contentEquals(StringBuffer)
public boolean matches(String)
public boolean regionMatches(int,String, int, int)
public boolean regionMatches(boolean,int, String,int, int)
public boolean startsWith(String, int)
public boolean startsWith(String)
public boolean endsWith(String)
public int compareTo(String)
public int compareToIgnoreCase(String)
public String[] split(String)
public String[] split(String, int)

public String concat(String)
public String replace(char, char)
public String replaceFirst(String, String)
public String replaceAll(String, String)
public String toLowerCase()
public String toUpperCase()
public String trim()
....

a|
[source,java]
....
void getBytes(int srcBegin, int srcEnd, 
  byte[] dst, int dstBegin)
....

a|
[source,java]
....
void getChars(int srcBegin, int srcEnd, 
  char[] dst, int dstBegin)
....

a|
[source,java]
....
public static String valueOf(char)
public static String valueOf(int)
public static String valueOf(long)
public static String valueOf(char[])
public static String copyValueOf(char[])
....

a|
[source,java]
....
public static String valueOf(float)
public static String valueOf(double)
public static String valueOf(boolean)
public static String valueOf(char[], int, int)
public static String copyValueOf(char[],int, int)
....
|===

[cols="46,54", options="header"]
|===

2+a| [blue]_Clases_ link:https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html[_StringBuffer_] y link:https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html[_StringBuilder_]

a|
[source,java]
....
public StringBuffer()
public StringBuffer(int)
public StringBuffer(String)
public StringBuffer(CharSequence)

public int length()
public char charAt(int)
public String substring(int)
public String substring(int, int)
public CharSequence subSequence(int,int)
public String toString()

public int indexOf(String)
public int indexOf(String, int)
public int lastIndexOf(String)
public int lastIndexOf(String, int)

public int codePointAt(int)
public int codePointBefore(int)
public int codePointCount(int, int)
public int offsetByCodePoints(int, int)

public int capacity()
public void ensureCapacity(int)
public void setLength(int)
public void trimToSize()
public void getChars(int, int, char[], int)
....

a|
[source,java]
....
public StringBuffer append(String)
public StringBuffer append(StringBuffer)
public StringBuffer append(char[])
public StringBuffer append(char[], int, int)
public StringBuffer append(boolean)
public StringBuffer append(char)
public StringBuffer append(int)
public StringBuffer appendCodePoint(int)
public StringBuffer append(long)
public StringBuffer append(float)
public StringBuffer append(double)

public StringBuffer insert(int, char[], int,int)
public StringBuffer insert(int, String)
public StringBuffer insert(int, char[])
public StringBuffer insert(int, boolean)
public StringBuffer insert(int, char)
public StringBuffer insert(int, int)
public StringBuffer insert(int, long)
public StringBuffer insert(int, float)
public StringBuffer insert(int, double)

public StringBuffer delete(int, int)
public StringBuffer deleteCharAt(int)

public void setCharAt(int, char)
public StringBuffer replace(int, int, String)
public StringBuffer reverse()
...
....

|===


[cols="2", options="header"]
|===

a| [blue]*Literales __String__*
a| [blue]_Ejemplos_

a|
* es la única clase cuyos objetos pueden presentarse en forma literal;

* su formato es una secuencia de caracteres de cualquier longitud encerrados entre dobles comillas
[source]
....
"<caracter>..."
....

* son objetos de la clase *String* cuya evaluación devuelve la dirección del objeto al que representan;

* además, es la única clase que disfruta de un operador (*+*) para la concatenación de cadenas de caracteres y combinado con cualquier tipo.

a|
[source,java]
....
int longitud = "caracteres".length();
String cadena = new String("caracteres");
boolean falso = cadena == "caracteres";
boolean cierto = cadena.equals("caracteres");
boolean tambien = "caracteres".equals(cadena);
StringBuffer buffer = new StringBuffer(cadena);
buffer.insert(0, "de ").insert(0, "cadena ");
boolean si = ("cadena de " + cadena).
    contentEquals(buffer);
String serie = (0+1)+", "+(1+1)+","+(2+1)+".";
....
|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#3-initialsv0[3-initials/v0.0] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a3_initials/v0_0/App.java[_v0.0_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a3_initials/v1_0/App.java[v1.0]

a| - https://github.com/USantaTecla-0-domains/0-simpleDomains/blob/master/docs/2-texts.md#2-morsetranlator[2-texts/2-morseTranlator/v0] : link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a2_texts/a2_morseTranslator/v0_0/App.java[v0.0]

a|
a|

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust4_object_based/ust8_enumerates.adoc ===== -->

### Enumerados

[cols="60,40", options="header"]
|===
a| [blue]*Enumerados*
a| [blue]_Ejemplos_

a| - Son [blue]*clases* que limitan la creación de objetos a los enumerados explícitamente en la implementación de la clase
** la [red]*única limitación* respecto a la implantación de una clase normal es que, si incorporan [red]*constructores, deben ser privados* para evitar la creación de nuevos objetos distintos a los ofertados por la implementación
** donde [blue]*cada <enumeradoX> es implícitamente una referencia a un objeto de la calse* con modificadores [blue]*public static final*
** la *sentencia __switch__ acepta expresiones de clase enumerado* y, en tal caso, las posibles constantes de cada clausula _case_ serán las referencias a los objetos especificados en el enumerado

a|
*** _El enumerado/clase Planeta responsable de su posición, velocidad, ... con únicamente 8 objetos mutables con atributos y métodos_ 
*** _El enumerado/clase Mes responsable de su número máximo de días (28, 30 ó 31) y los literales en varios idiomas (“Enero”, “January”) con únicamente 12 objetos inmutables con atributos y métodos_
*** _El enumerado/clase Color responsable de nada con únicamente 2 objetos inmutables (vacíos) sin atributos ni métodos_

|===

[cols="40,60", options="header"]
|===

a| [green]*Enumerado*
a| [red]*Clase con __static__*

a|
[source, java]
....
enum <Enumerado> {
  <enumerado1>[(<argumentos>)],
  ...
  <enumeradoN>[(<argumentos>)];

  <definiciónAtributos>

  private <Enumerado> ([<parametros>]) {
    ...
  }

  <definiciónMétodos>

  public void <metodo> () {
    ...
    switch(this){
      case <enumerado1>:
      case <enumerado2>:
      ...
        <sentencia>;
        break;
      default:
        <sentencia>;
    }
  }
}
....

a|
[source,java]
....
class <Enumerado> {
  public static final <Enumerado> <enumerado1> = new <Enumerado>([<argumentos>]);
  ...
  public static final <Enumerado> <enumeradoN> = new <Enumerado>([<argumentos>]);

  <definiciónAtributos>

  private <Enumerado> ([<parametros>]) {
    ...
  }

  <definiciónMétodos>

  public void <metodo> () {
    ...
    if(this == <enumerado1> \|\| this== <enumerado2>) {
      <sentencia>;
    } else {
      <sentencia>;
    }
  }
}
....

|===

[cols="40,60", options="header"]
|===

a| [blue]*Métodos implícitos*
a| [blue]*Sintaxis*
a|
* devuelve la [blue]*posición del enumerado* dentro de la secuencia expresada en la implementación
* devuelve el [blue]*identificador del enumerado*;
* devuelve un [blue]*vector de referencias con la dirección de todos los objetos enumerados*
** la [green]*sentencia __for__ acepta tablas de objetos enumerados en su formato iterador* como tablas de objetos de clases

a|
[source,java]
....
class <Enumerado> {
    public int ordinal()
    public String name()
    public static <Enumerado>[] values()
    ...
}

class App {
  public static void main(String[] args){
    Console console = new Console();
    for(<Enumerado> enum : <Enumerado>.values()) {
      console.writeln(
        "" + enum.ordinal() + ". " + enum.name());
    }
  }
}
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/a5_units/a3_date/a3_enums[_Date_]

a| - link:https://github.com/USantaTecla-tech-java/game-ticTacToe/tree/master/domainModel/basic/src/main/java/usantatecla[_TicTacToe_] 

a|
a|

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/menus.adoc ===== -->

[plantuml, menus, svg]
....

class Console

abstract class Option #crimson {
    #title
    constructor(title)
    {abstract} interact() 
    showTitle(index)
    getTitle() 
}
class QuitOption #crimson {
    #executed
    constructor()
    interact() 
    isExecuted()
}

Option *-down-> Console : {static} console

Option <\|-down- QuitOption

abstract class Menu #crimson {
    #title
    #options
    constructor(title)
    interact()
    {abstract} addOptions()
    interact_()
    showTitles()
    execChoosedOption()
    add(option)
    removeOptions()
    hasOption(option)
}
abstract class QuitMenu #crimson {
    #quitOption;
    constructor(title)
    showTitles()
    addquitOption()
    isExecutedquitOption()
}
abstract class IterativeMenu #crimson {
    constructor(title) 
    interact()
}
abstract class DynamicMenu #crimson {
    constructor(title) 
    interact()
}

Menu *-down-> "+" Option
QuitMenu *-down-> QuitOption

Menu <\|-down- QuitMenu
QuitMenu <\|-down- IterativeMenu
IterativeMenu <\|-down- DynamicMenu

class Model #darkCyan {
    #strings
    constructor()
    add(string)
    remove(index)
    get(index) 
    size() 
}

class ModelOption #forestGreen {
    model
    constructor(string, model)
    {abstract} interact()
}

ModelOption -down-> Model
Option <\|-down- ModelOption

class ListModelOption #forestGreen {
    constructor (model)
    interact() 
}

ModelOption <\|-down- ListModelOption

class AddModelOption #forestGreen {
    constructor(model)
    interact()
}

ModelOption <\|-down- AddModelOption

class RemoveModelsOption  #forestGreen{
    constructor(model)
    interact()
}

ModelOption <\|-down- RemoveModelsOption

class RemoveModelOption #forestGreen {
    #index
    constructor(model, index) 
    getTitle() 
    interact()
}

ModelOption <\|-down- RemoveModelOption

class X as "..."  #forestGreen {
    constructor(model)
    interact()
}

ModelOption <\|-down- X

class ModelMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}

Menu <\|-down- ModelMenu

ModelMenu -down-> Model

ModelMenu *-down-> AddModelOption

class ModelQuitMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}

QuitMenu <\|-down- ModelQuitMenu

ModelQuitMenu -down-> Model

ModelQuitMenu *-down-> ListModelOption

class ModelIterativeMenu  #Lime{
    #model
    constructor(model)
    addOptions()
}

IterativeMenu <\|-down- ModelIterativeMenu

ModelIterativeMenu -down-> Model

ModelIterativeMenu *-down-> X

class ModelDynamicMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}

DynamicMenu <\|-down- ModelDynamicMenu

ModelDynamicMenu -down-> Model

RemoveModelsOption *-down-> ModelDynamicMenu
ModelDynamicMenu *-down-> RemoveModelOption

IterativeMenu <\|-down- ModelIterativeDynamicMenu

ModelIterativeDynamicMenu -down-> Model

ModelIterativeDynamicMenu *-down-> RemoveModelsOption

class ModelIterativeDynamicMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}


....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/menus_undo_redo.adoc ===== -->

[plantuml, menus, svg]
....

class Console

abstract class Option #crimson {
    #title
    constructor(title)
    {abstract} interact() 
    showTitle(index)
    getTitle() 
}
class QuitOption #crimson {
    #executed
    constructor()
    interact() 
    isExecuted()
}

Option *-down-> Console : {static} console

Option <\|-down- QuitOption

abstract class Menu #crimson {
    #title
    #options
    constructor(title)
    interact()
    {abstract} addOptions()
    interact_()
    showTitles()
    execChoosedOption()
    add(option)
    removeOptions()
    hasOption(option)
}
abstract class QuitMenu #crimson {
    #quitOption;
    constructor(title)
    showTitles()
    addquitOption()
    isExecutedquitOption()
}
abstract class IterativeMenu #crimson {
    constructor(title) 
    interact()
}
abstract class DynamicMenu #crimson {
    constructor(title) 
    interact()
}

Menu *-down-> "+" Option
QuitMenu *-down-> QuitOption

Menu <\|-down- QuitMenu
QuitMenu <\|-down- IterativeMenu
IterativeMenu <\|-down- DynamicMenu

class Model #darkCyan {
    #strings
    constructor()
    add(string)
    remove(index)
    get(index) 
    size() 
}

class ModelOption #forestGreen {
    model
    constructor(string, model)
    {abstract} interact()
}

ModelOption -down-> Model
Option <\|-down- ModelOption

class ListModelOption #forestGreen {
    constructor (model)
    interact() 
}

ModelOption <\|-down- ListModelOption

class AddModelOption #forestGreen {
    constructor(model)
    interact()
}

ModelOption <\|-down- AddModelOption

class RemoveModelsOption  #forestGreen{
    constructor(model)
    interact()
}

ModelOption <\|-down- RemoveModelsOption

class RemoveModelOption #forestGreen {
    #index
    constructor(model, index) 
    getTitle() 
    interact()
}

ModelOption <\|-down- RemoveModelOption

class X as "..."  #forestGreen {
    constructor(model)
    interact()
}

ModelOption <\|-down- X

class ModelMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}

Menu <\|-down- ModelMenu

ModelMenu -down-> Model

ModelMenu *-down-> AddModelOption

class ModelQuitMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}

QuitMenu <\|-down- ModelQuitMenu

ModelQuitMenu -down-> Model

ModelQuitMenu *-down-> ListModelOption

class ModelIterativeMenu  #Lime{
    #model
    constructor(model)
    addOptions()
}

IterativeMenu <\|-down- ModelIterativeMenu

ModelIterativeMenu -down-> Model

ModelIterativeMenu *-down-> X

class ModelDynamicMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}

DynamicMenu <\|-down- ModelDynamicMenu

ModelDynamicMenu -down-> Model

RemoveModelsOption *-down-> ModelDynamicMenu
ModelDynamicMenu *-down-> RemoveModelOption

IterativeMenu <\|-down- ModelIterativeDynamicMenu

ModelIterativeDynamicMenu -down-> Model

ModelIterativeDynamicMenu *-down-> RemoveModelsOption

class ModelIterativeDynamicMenu  #Lime {
    #model
    constructor(model)
    addOptions()
}


....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust0_index.adoc ===== -->

## Programación Orientada a Objetos
                                   
include::ust1_inherit/ust0_index.adoc[]
include::ust2_extends/ust0_index.adoc[]
include::ust3_abstract/ust0_index.adoc[]
include::ust4_implements/ust0_index.adoc[]
include::ust5_final.adoc[]
include::ust6_profits/ust0_index.adoc[]
include::ust7_polymorphism/ust0_index.adoc[]

[cols="15,85"]
|===

a|

- link:https://github.com/USantaTecla-tech-java/ust_figures/tree/main/ust3_design/ust3_objectOriented/ust4_how/ust3_flexibility/ust1_liskovs_sustitution/ust2_bad/src/main/java[figures]

- link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_menu/a4_extends/a1_modelMenu[menú alternativo]

- link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_menu/a4_extends/a2_modelQuitMenu[menú con escape]

- link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_menu/a4_extends/a3_modelIterativeMenu[menú iterativo]

- link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_menu/a4_extends/a4_modelDynamicMenu[menú dinámico]

a|
include::menus.adoc[]

|===

include::ust8_casting/ust0_index.adoc[]
include::ust9_enums/ust0_index.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust1_inherit/diagramaHerenciaMultiples.adoc ===== -->

[plantuml,HerenciaMultiples,svg]
....
skinparam backgroundColor #222222
hide circle
hide stereotype
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

Menu *-down-> ItemMenu
Menu <\|-down- Submenu
ItemMenu <\|-down- Submenu
ItemMenu <\|-down- Opcion
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust1_inherit/diagramaHerenciaSimple.adoc ===== -->

[plantuml,HerenciaSimple,svg]
....
skinparam backgroundColor #222222
hide circle
hide stereotype
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

Ciudadano <\|-- Español
Ciudadano <\|-- Frances
Español <\|-- HispanoFrances
Frances <\|-- HispanoFrances
....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust1_inherit/diagramaJerarquias.adoc ===== -->

[plantuml,Jerarquia,svg]
....
skinparam backgroundColor #222222
hide circle
hide stereotype
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

class Animal{
- celulas
+ comer()
}
class Vertebrado {
- celulas
- huesos
+ comer()
+ romperHuesos()
}
class InVertebrado {
- celulas
+ comer()
}
class Mamnifero {
- celulas
- huesos
- labios
+ comer()
+ romperHuesos(9
+ mamar()
}
class Ave {
- celulas
- huesos
- pico
+ comer()
+ romperHuesos()
+ volar()
}
class Canino {
-celulas 
- huesos
- labios
- colmillos
+ comer()
+ romperHuesos()
+ mamar()
}
class Humano {
- celulas
- huesos
- labios
- racio cinio
+ comer()
+ romperHuesos()
+ mamar()
+ pensar()
}
class Ornitorrinco {
-celulas
- huesos
-pico
+ comer()
+ romperHuesos()
}

Animal <\|-- Vertebrado
Animal <\|-- InVertebrado
Vertebrado <\|-- Mamnifero
Vertebrado <\|-- Ave
Mamnifero <\|-- Canino
Mamnifero <\|-- Humano
Mamnifero <\|-- Ornitorrinco
Ave <\|-- Ornitorrinco
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust1_inherit/transmision.adoc ===== -->

[plantuml, Transmision,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

class Base as "Base\nSuper - Parent" {
- attributes
+ methods()
}

class Derived as "Derived\nSub - Child" {
- attributes
+ methods()
}

Base <\|-- Derived
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust1_inherit/ust0_index.adoc ===== -->

### Relación de Herencia

[cols="70,30", options="header"]
|===

2+a| [blue]*Transmisión*

a| 
* La herencia en todos los ámbitos (derecho, biología, ...) tiene connotaciones de transmisión
* En Programación Orientada a Objetos es la transmisión de todos los miembros (atributos y métodos públicos y privados) de una clase a otra.
* Terminología: 
** [blue]*clase base* para la que transmite y [blue]*clase derivada* a la que recibe la transmisión
** paralela a los [blue]*árboles genealógicos*: padre, hija, nieta ...
** [red]*superclase* y [red]*subclases* en desuso

^.^a|
include::transmision.adoc[]

|===

[cols="25,48,27", options="header"]
|===

2+a|*[blue]#Colaboración entre objetos#* 
a| [blue]_Ejemplo_

a|
* Las relaciones de [blue]*composición, asociación y dependencia* son relaciones binarias que devienen de la [blue]*colaboración entre objetos*: envío de mensajes entre objetos

a|
* La relación de [blue]*herencia*:
** es una [blue]*relación binaria* entre clases
** si existe una relación de herencia, [red]#no es necesario que exista una colaboración entre los objetos# de sus clases aunque tampoco lo impide 
** por tanto, los [blue]*objetos de las clases de una relación de herencia* son, [blue]*a priori, independientes*.

a|
- _La clase Persona hereda de la clase Animal_
* _en una aplicación sobre la evolución de las especies, sus objetos no colaboran_
* _en una aplicación para la gestión de una granja, sus objetos sí colaboran_

|===

[cols="33,33,33", options="header"]
|===

a|[blue]*Tipos de Relación de Herencia* 
2+a| [blue]_Ejemplos_

a| 
- [blue]*_Herencia simple_*: cuando una clase derivada hereda de una única clase base.
- [blue]*_Herencia múltiple_*: cuando una clase derivada hereda de varias clases base.

^.^a|
include::diagramaHerenciaSimple.adoc[]

^.^a|
include::diagramaHerenciaMultiples.adoc[]

|===

include::ust1_hierarchy.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust1_inherit/ust1_hierarchy.adoc ===== -->

#### Jerarquías de Clasificación

[cols="60,40" options="header"]
|===

a| [blue]*Definición*
a| [blue]_Ejemplos_

a| 
- Una jerarquía por grado de clasificación es aquélla donde [blue]*cada nodo (clases) de la jerarquía establece un dominio de elementos (conjuntos de objetos de la clase) incluido en el dominio de los nodos padre e incluye a los dominios de cada nodo hijo*
* La [green]*relación de herencia* permite establecer jerarquías por grado de clasificación

- [blue]#Características#
* [red]#Eminentemente subjetivas#
** _Ej. paciente de un hospital: publica/privada, por especialidad,..._
* [red]#Contemplan elementos que son dificilmente categorizables#
** _Ej. Ornotorrinco, pingüino, mula,..._ 
* [red]#Dificultad para establecer una clasificación "perfecta"#
* [green]*Esqueleto fundamental de un programa junto con la jerarquía de composición*

- [blue]*Reglas de Construcción*
* [blue]*Regla de Generalización/Especialización*: cuando existen unas características específicas de un subconjunto de elementos de un determinado conjunto más amplio, que pese a que mantienen las características esenciales e identificativas del conjunto al que pertenecen, también son lo suficientemente relevantes como para ser rasgos distintivos de dicho subconjunto de elementos.
* [blue]*Regla ¿Es un? (_ISA_)*: responder afirmativamente que un objeto de la clase hija es un objeto de la clase padre.

a|
image::Jerarquias.jpg[height32]
include::diagramaJerarquias.adoc[]

|===









<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust2_extends/diagramaConjunto.adoc ===== -->

[plantuml,Conjunto,svg]
....
skinparam backgroundColor #222222
hide circle
hide stereotype
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

List <\|-- SentinelList
List <\|-- Set
List *-- Node
Interval <\|-- Node
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust2_extends/diagramaHerenciaExtencion.adoc ===== -->

[plantuml,HerenciaExtencion,svg]
....
skinparam backgroundColor #222222
hide circle
hide stereotype
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

Abuela <\|-- Padre
Padre <\|--Hija
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust2_extends/diagramaHerenciaExtencion2.adoc ===== -->

[plantuml,HerenciaExtencion2,svg]
....
skinparam backgroundColor #222222
hide circle
hide stereotype
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

List *--> Node
Interval <\|-- Node
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust2_extends/diagramaListaCentinela.adoc ===== -->

[plantuml,ListaCentinela,svg]
....
skinparam backgroundColor #222222
hide circle
hide stereotype
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

List <\|-- SentinelList
List *-- Node
Interval <\|-- Node
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust2_extends/lists.adoc ===== -->

[plantuml, lists, svg]
....

class Interval {
	double min
	double max
	 Interval(double min, double max) 
	 Interval() 
	 Interval(Interval interval) 
	 double getMin() 
	 double getMax() 
	 void set(Interval interval) 
	 boolean equals(Interval interval)
	 double length()
	 double getMiddlePoint() 
	 Interval copy()
	 Interval symetric() 
	 void shift(double amount)
	 void scale(double factor) 
	 boolean includes(double value) 
	 boolean includes(Interval interval) 
	 Interval intersection(Interval interval) 
	 Interval shifted(double amount) 
	 void read()
	 String toString()
}

class Iterator {
	 Node current
	 Iterator(Node current) 
	 boolean hasNext()
	 Interval next()
}

class List {
	 Node first
	 Node last
	 List() 
	 Node getFirst() 
	 Node getLast()
	 void setFirst(Node first) 
	 void setEnd(Node last)
	 boolean isEmpty() 
	 void insertFirst(Interval interval)
	 void insertLast(Interval interval)
	 Interval removeFirst()
	 Interval removeLast()
	 boolean includes(Interval interval) 
	 Iterator getIterator()
	 void writeln() 
}   

class Node extends Interval {
	 Node previous
	 Node next
	 Node(Node previous, Interval interval, Node mext) 
	 Node getPrevious()
	 Node getNext() 
	 void setPrevious(Node previous) 
	 void setNext(Node next)
	 Interval getInterval() 
}

class SentinelList extends List {
	 boolean includes(Interval interval) 
}

class Set extends List {
	 void insertFirst(Interval interval) 
	 void insertLast(Interval interval)
	 Set union(Set set)
	 Set intersection(Set set) 
}

Iterator -down-> Interval
List o-down-> Node
List .down.> Iterator
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust2_extends/ust0_index.adoc ===== -->

### Herencia por extensión

[cols="50,35,15", options="header"]
|===

a|[blue]*Sintaxis*
2+a| [blue]_Ejemplo_

a|
- Mediante la palabra reservada [blue]*extends*
* [red]*No permite herencia múltiple*

[source, java]
....
class <claseDerivada> extends <claseBase> {
   ...
}
....

a|
[source, java]
....
class Abuela {
  ...
}
class Padre extends Abuela {
  ...
}
class Hija extends Padre {
  ...
}
....

^.^a|
include::diagramaHerenciaExtencion.adoc[]

|===

#### Especialización por adición

[cols="15,40,45", options="header"]
|===

a| [blue]*Atributos*
a| [blue]*Métodos*
a| [blue]*Constructores*

a|
* Los [blue]*atributos añadidos en la clase hija* tienen [blue]*las mismas reglas sintácticas y semánticas que en una clase que no sea derivada*

a|
* Los [blue]*métodos añadidos en la clase hija* tienen [blue]*las mismas reglas sintácticas y semánticas que en una clase que no sea derivada* 
** [red]*excepto que NO tienen acceso a los atributos y métodos privados transmitidos desde la clase padre*, si no es [blue]*a través de los métodos públicos transmitidos desde la clase padre*
*** Esto [green]*permite la contención del mantenimiento*, dado que, si se [green]*modifica la implantación de la clase padre, no repercute sobre la implantación de la clase hija y se obtiene un mínimo acoplamiento* entre ambas clases

a|
[source, java]
....
  class <Clase> extends <Base> {

    public <Clase>({ <parametro> }* ){
      super( { <expresion> }*);
      ...
    }
  }
....

* Mediante [blue]*__super__*, donde debe ser la [blue]#primera sentencia de los constructores de la clase derivada y sus argumentos deben coincidir en número y tipo con la lista de parámetros de algún constructor público o protegido de la clase padre#
** Se [blue]#puede omitir para el caso del constructor de la clase padre con una lista vacía de parámetros#

|===

[cols="75,25", options="header"]
|===

a| [blue]*Implicaciones sobre los objetos*
a| [blue]_Ejemplo_

a|
* Los [blue]*objetos de la clase padre NO sufren ninguna alteración* por la presencia de clases derivadas
* Los [blue]*objetos de la clase hija*:
** tienen todos los [blue]*atributos transmitidos desde la clase padre junto con los atributos añadidos en la clase hija*;
** responden a mensajes que corresponden con los [blue]*métodos públicos transmitidos desde la clase padre junto con los métodos públicos añadidos en la clase derivada*;

a|
include::diagramaHerenciaExtencion2.adoc[]

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - List - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a0_classes[_Composición_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a4_extends/Node.java[Herencia]: Node

a|

a|

|===

[cols="100%"]
|===

a|
include::lists.adoc[]

|===

##### Miembros protegidos

[cols="26,37,37"]
|===

3+^.^a|
[red]*Cuando la clase padre no transmite los métodos públicos necesarios para manipular los atributos privados transmitidos desde la clase padre en los métodos añadidos en la clase hija*

.2+a|
* [red]*Visibilidad publica* añadiendo dichos métodos públicos a la clase padre [red]*NO es solución* puesto que [red]*rompe el principio de encapsulación* ya que, [red]#para la implantación de una clase hija, los objetos de la clase padre dan a conocer más allá de lo que se les solicitaba previamente a la existencia de la clase derivada#.

2+a|
- [green]*Visibilidad protegida (_protected_)*, donde los miembros (atributos y/o métodos) son [blue]*accesibles en la implantación de la clase y en cualquier clase derivada*.

a|
- [blue]*Atributos protegidos* Dentro del cuerpo de los [blue]#métodos de la clase derivada se tiene acceso a los atributos protegidos heredados, a los atributos añadidos, a los parámetros del método y a las declaraciones locales#, [blue]*ley flexible de Demeter*
* Implicación: [red]#desbordamiento del mantenimiento dado que si se modifica la implantación de la clase padre SI repercute sobre la implantación de la clase hija# y se obtiene un [red]*máximo acoplamiento* entre ambas clases

a|
- [green]*Métodos __get/set__ protegidos* son métodos [green]#para obtener el valor y asignar un valor a los atributos privados transmitidos desde la clase padre#, [green]*posibilitando cualquier manipulación por parte de la clase hija futura*;
* Implicación: [green]#contención del mantenimiento dado que si se modifica la implantación de la clase padre no repercute sobre la implantación de la clase hija# y se obtiene un [green]*mínimo acoplamiento* entre ambas clases

|===

[cols="33,33,33", options="header"]
|===
3+a| [green]*Aplicaciones*

2+a| - List - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a4_extends/Node.java[_Herencia_]: Node - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a4_extends_protected/Node.java[Protected]: Node - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a4_extends_protected_attributes/Node.java[Protected Attributes]: Node!!!

a|

|===

#### Especialización por redefinición

[cols="70,30"]
|===

a|
* Donde la [blue]*cabecera del método es exactamente igual a la cabecera del método no privado de la clase padre, excepto su visibilidad, que puede ampliarse*. [red]*En caso contrario, sería sobrecarga y no redifinición*
* Sus implicaciones son:
** se [red]*anula la transmisión del método de la clase padre*;
** los [blue]*objetos de la clase padre responden al mensaje con el comportamiento dado en la clase padre*;
** los [blue]*objetos de la clase hija responden al mensaje con el comportamiento dado en la clase hija*;

a|
include::diagramaListaCentinela.adoc[]

|===

[cols="33,33,33", options="header"]
|===
3+a| [green]*Aplicaciones*

2+a| - SentinnelList - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a4_extends/SentinelList.java[_Redefinición_]: por anulación 

a|

|===

##### Referencia _super_

[cols="70,30"]
|===

a|
- [blue]*super*, en la implantación de cualquier [blue]*clase derivada, es una referencia constante que guarda la dirección del objeto que recibe el mensaje correspondiente al método que se está redefiniendo, pero con el comportamiento de la clase padre*
* Su utilidad será para la [red]*reutilización del método de la clase padre, anulado en la transmición, desde la redefinición del método de la clase hija*

a|
include::diagramaConjunto.adoc[]

|===

[cols="33,33,33", options="header"]
|===
3+a| [green]*Aplicaciones*

2+a| - Set - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/aX_listas/a1_basic/a4_extends/Set.java[_Redefinición_]: por refinamiento, Liskov?!?!

a|

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust3_abstract/diagramaAlumno.adoc ===== -->

[plantuml,Alumno,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}

class Alumno <<abstract>>
class AlumnoGrado <<abstract>>
class AlumnoErasmus
class AlumnoSoftware
class AlumnoSistemas

Alumno <\|-- AlumnoGrado 
Alumno <\|-- AlumnoErasmus
AlumnoGrado <\|-- AlumnoSoftware
AlumnoGrado <\|-- AlumnoSistemas
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust3_abstract/diagramaDispensador.adoc ===== -->

[plantuml,Dispensador,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

DispensadorNoAcotado <\|-- PilaNoAcotada
DispensadorNoAcotado <\|-- ColaNoAcotada
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust3_abstract/diagramaPersona.adoc ===== -->

[plantuml,persona,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}

class Persona {
+comer()
+trabajar()
}
class Genio <<abstract>> {
+crear()
}
class Estratega {
+crear()
}
class Artista {
+crear()
}

Persona <\|-- Genio
Genio <\|-- Estratega
Genio <\|-- Artista
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust3_abstract/dispenser.adoc ===== -->

[plantuml, dispenser, svg]
....
interface Dispenser {
	void add(Interval interval)
	Interval remove()
	boolean isEmpty()
	Iterator getIterator()
}

Dispenser .down.> Iterator

abstract class BoundedDisepenser implements Dispenser {
	Interval[] intervals
	int size
	int next
	BoundedDisepenser(int size)
	void add(Interval interval)
	boolean isEmpty()
	boolean isFull()
}

BoundedDisepenser *-down-> Interval

class BoundedQueue extends BoundedDisepenser {
	int first;
	BoundedQueue(int size)
	void add(Interval interval) 
	Interval remove()
}

class BoundedStack extends BoundedDisepenser {
	BoundedStack(int tamaño)
	Interval remove()
	Iterator getIterator()
}

interface Iterator {
	boolean hasNext()
  Interval next()
}

Iterator .down.> Interval

class Interval {
	double minimo
	double maximo
	double getMinimo() 
	double getMaximo()
	Interval(double minimo, double maximo)
	Interval()
	Interval(Interval intervalo)
	double longitud()
	double puntoMedio()
	Interval copia()
	Interval simetrico()
	void desplazar(double cantidad)
	void escalar(double escala) 
	boolean incluye(double punto)
	boolean incluye(Interval intervalo)
	boolean iguales(Interval intervalo) 
	Interval interseccion(Interval intervalo)
	Interval desplazado(double cantidad) 
	void recoger()
	String toString()
}

abstract class BoundedDispenserIterator implements Iterator {
	Interval[] intervals
	int size
	int current
	BoundedDispenserIterator(Interval[] intervals, int size, int current)
	boolean hasNext()
	{abstract} Interval next()
}

class BoundedQueueIterator extends BoundedDispenserIterator {
	BoundedQueueIterator(Interval[] intervals, int size, int first) 
	Interval next() 
}

BoundedQueue ..> BoundedQueueIterator

class BoundedStackIterator extends BoundedDispenserIterator {
	BoundedStackIterator(Interval[] intervals, int size, int next) 
	Interval next() 
}

BoundedStack ..> BoundedStackIterator

abstract class UnboundedDispenser implements Dispenser {
	Node entrance
	UnboundedDispenser()
	void add(Interval interval)
	boolean isEmpty()
}

class Node extends Interval {
	Node previous;
	Node next;
	Node(Node previous, Interval interval, Node next)
	Node getPrevious()
	Node getNext()
	void setPrevious(Node previous) 
	void setNext(Node next)
	Interval getInterval()
}

UnboundedDispenser *-down-> Node

class UnboundedQueue extends UnboundedDispenser {
	Node exit;
	UnboundedQueue()
	void add(Interval interval)
	Interval remove()
	Iterator getIterator()
}

class UnboundedStack extends UnboundedDispenser {
	Interval remove() 
	Iterator getIterator()
}

abstract class UnboundedDispenserIterator implements Iterator {
	Node current;
	UnboundedDispenserIterator(Node current) 
	boolean hasNext()
	{abstract} Interval next()
}

UnboundedDispenserIterator .down.> Node

class UnboundedQueueIterator extends UnboundedDispenserIterator {
	UnboundedQueueIterator(Node current)
	Interval next()
}

UnboundedQueue .down.> UnboundedQueueIterator

class UnboundedStackIterator extends UnboundedDispenserIterator {
	UnboundedStackIterator(Node actual)
	Interval next()
}

UnboundedStack .down.> UnboundedStackIterator
....



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust3_abstract/ust0_index.adoc ===== -->

### Clases Abstractas

[cols="20,25,55", options="header"]
|===

a| *[blue]#Clases Concretas#* 
a| *[blue]#Clases Abstractas#*
a|

a|
- Surgen de la descripción de los atributos y métodos que [green]*definen el comportamiento de un cierto conjunto de objetos homogéneos*

a|
- Son clases [red]*NO instanciables* que surgen del factor común del código de otras clases con atributos comunes, métodos comunes y/o [blue]*cabeceras de métodos comunes sin definición*, pero [red]*no pueden ser con visibilidad privada*

a|
[source,java]
....
abstract class <ClaseAbstracta> { 
  ...
  public abstract void <métodoAbstracto>( <parametros> );
  protected abstract void <métodoAbstracto>( <parametros> );
  // private abstract void <métodoAbstracto>( <parametros> ); ERROR!!!
  ...
}
....

|===

[cols="33,33,33", options="header"]
|===
3+a| [green]*Aplicaciones*

2+a| - Dispenser - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a5_extends_a1_node[_Sin herencia_] - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a5_extends_a2_dispenser[con herencia]

a|

|===

[cols="100%"]
|===

a|
include::dispenser.adoc[]

|===

[cols="65,35", options="header"]
|===

a|- [green]*Posibilidades:*
a|

a|
* una [green]*clase abstracta puede ser hija de otra clase abstracta* porque se especializa (añadiendo atributos y/o métodos y/o redefiniendo métodos) pero [blue]*NO redefine todos los métodos abstractos transmitidos y/o añade algún método abstracto*;

include::diagramaAlumno.adoc[]

a|
* una [green]*clase abstracta puede ser hija de una clase concreta si en su especialización añade algún método abstracto*

include::diagramaPersona.adoc[]

|===

[cols="50,50", options="header"]
|===

a|- [green]*Posibilidades:*
a|

a|
- Un [green]*método no abstracto de una clase abstracta puede definirse apoyándose en métodos abstractos* entendiendo que será un código que se transmite hasta clases concretas que redefinen los métodos abstractos;


.2+a|
[source,java]
....
class Cubo extends Solido {
  private double lado;
  public double volumen() {
    return Math.pow(lado, 3);
  }
}

class Esfera extends Solido {
  private double radio;
  public double volumen() {
    return 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);
  }
}
....

a|
[source,java]
....
abstract class Solido {
  private double densidad;
  public double peso() {
    return densidad * this.volumen();
  }
  public abstract double volumen();
}
....
|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust4_implements/diagramaDispensadorHerencia.adoc ===== -->

[plantuml,DispensadorHerencia,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

Dispensador <\|-- DispensadorNoAcotado
Dispensador <\|-- DispensadorAcotado
DispensadorNoAcotado <\|-- PilaNoAcotada
DispensadorNoAcotado <\|-- ColaNoAcotada
DispensadorAcotado <\|-- PilaAcotada
DispensadorAcotado <\|-- ColaAcotada
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust4_implements/ust0_index.adoc ===== -->

### Herencia por Implementación

[cols="30,70", options="header"]
|===

a|*[blue]#Interfaces#*
a|*[blue]#Ejemplo#*

a|
- Son [blue]*clases abstractas puras* que no contienen ningún atributo ni la definición de ningún método, [blue]*sólo contienen métodos abstractos*. 
* puede ser base de clases u otros interfaces.
* donde todos los métodos del interfaz son públicos.

a|
[source, java]
....
interface <interfazBase> {
    <cabeceraMetodo1>;
    …
    <cabeceraMetodoN>;
}

[abstract] class <claseDerivada> implements <interfazBase> {
    …
}

interface <interfazDerivado> extends <interfazBase> {
    …
}
....

|===

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

2+a| - Dispenser - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a5_extends_a2_dispenser[_herencia_] - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a6_interfaces[interfaces] 

a|

|===

[cols="60,40"]
|===

a|
- [blue]*Una interfaz* 
* [red]*NO puede heredar de una clase de ninguna manera*
* [green]*SI puede heredar de otro interfaz por extensión*

- [blue]*Una clase* 
* [green]*SI puede heredar de una clase por extensión*
* [gree]*SI puede heredar de varios interfaces por implementación*

- [blue]*Herencia mútiple*
- [red]*La herencia por extensión NO la permite*
* [green]*la herencia por implementación SI la permite*

a|
[source,java]
....
class <claseDerivada>
  extends <claseBase>
  implements <interfaz1>, …, <interfazN> {
  …
}
interface <interfazDerivado>
  extends <interfaz1>, …, <interfazN> {
  …
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust5_final.adoc ===== -->

### Limitaciones de la  Herencia

[cols="40,20,40", options="header"]
|===

a| [blue]*Clases final*
a| [blue]*Enumerados*
a| [blue]*Metodos final*

a|
- [red]*no permiten ningún tipo de herencia posterior*, por clases de la biblioteca standar

[source,java]
....
final class <clase> {
  ...
}
....

a| 
* [red]*NO pueden heredar de una clase por extensión*, son siempre _final_
* [green]*SI puede heredar de un interfaz por implementación*


a|
-  [red]*no permiten ningún tipo de redefinición posterior*, por clases de la biblioteca standar

[source,java]
....
class <clase> {
  ...
  final <metodo>
  ...
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust6_profits/diagramaX.adoc ===== -->

[plantuml,X,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

X *-- Y1
X *-- Y2
X *-- Y3
X *-- Y4
Y1 ..> Z
Y2 ..> Z
Y3 ..> Z
Y4 ..> Z
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust6_profits/diagramaX2.adoc ===== -->

[plantuml,X2,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

X *-- Y
Y ..> Z
Y <\|-- Y1
Y <\|-- Y2
Y <\|-- Y3
Y <\|-- Y4
X -[hidden]Y
Y -[hidden]Z
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust6_profits/ust0_index.adoc ===== -->

### Beneficios de la Herencia

[cols="35,30,35"]
|===

a| [green]*Integridad de la Arquitectura del Software*
a|
a| [green]*Reusabilidad del código*

a|
- La herencia favorece la [green]*comprensión de la arquitectura del software*.
* La jerarquía de clasificación de las clases establece los [green]*niveles de generalización que reducen significativamente el número de clases al estudiar en un diseño*.

^.^a|
include::diagramaX.adoc[]

include::diagramaX2.adoc[]

a|
- [green]*Utilización del código de la clase padre previamente escrito, probado y documentado*
* No es necesario [red]*duplicar código* similar, todo el código común se "factoriza" en la clase padre

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust7_polymorphism/diagramaLista2.adoc ===== -->

[plantuml,Lista2,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

Lista <\|-- Conjunto
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust7_polymorphism/diagramaPersona2.adoc ===== -->

[plantuml,Persona2,svg]
....
skinparam backgroundColor #222222
hide circle
skinparam handwritten true

skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
} 

class Persona <<abstract>>
Persona <\|-- Mujer
Persona <\|-- Hombre
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust7_polymorphism/ust0_index.adoc ===== -->

### Polimorfismo

[cols="25,75", options="header"]
|===

a|*[blue]#Introducción#* 
a|*[blue]_Ejemplo_*

a|
* Término de origen griego que significa [green]*"muchas formas"*.

a|
* _Una persona puede pagar con tarjeta o con efectivo_
* _Una empresa de transporte realiza ventas de billetes por ventanilla o a travéz de una maquina_
* _Un sistema operativo imprime a travéz de drivers de impresora para cada modelo_
* _Un navegador muestra textos,imagenes,videos,...,con muy diversos formatos_

a|
* [red]*no* se contempla que algo [red]*cambie de forma* o sea [red]*de dos clases de cosas* a la vez

a|
* _Una persona ed ventanilla *NO* se convierte en máquina exprendedora_ 
* _Una persona *NO* es a la vez una máquina exprendedora_
* _Simplemente, un billete lo puede vender una persona o una máquina exprendedora en cada momento que se vende un billete_

|===

[cols="30,45,25"]
|===

a|
- _A lo largo de la historia, en este mundo existe la jerarquía de personas: mujeres y hombres._ 
* _Pero en ciertos momento y en ciertos países, no existe polimorfismo: el lugar de una mujer no lo puede ocupar un hombre y el de un hombre no lo puede ocupar una mujer._ 
* _Mientras que, en otros momentos u otros países, el lugar de una persona es indiferentemente ocupado por una mujer o un hombre._

a|
[source, java]
....
Person person;
 // person = new Person(); ERROR! Clase abstracta
person = new Woman();
person = new Man(); 
Woman woman;
 // woman = new Person(); ERROR! Clase abstracta
woman = new Woman();
 // woman = new Man(); ERROR! Clase no derivada de Woman
Man man;
 // man = new Person(); ERROR! Clase abstracta
 // man = new Woman(); ERROR! Clase no derivada de Man
man = new Man();
....

a|
- _donde no se contempla que una mujer se convierta en hombre o un hombre en mujer_
- _ni se contempla que alguien sea mujer y hombre a la vez;_ 
- _lo único que se contempla es que una referencia a persona apunte a un objeto de la clase mujer u hombre en cada instante del tiempo_

|===

[cols="35,35,30", options="header"]
|===

a| *[blue]#Definición#*
a| *[blue]_Ejemplo_*
a|

a|
- El polimorfismo es una [blue]*relajación del sistema de tipos*, de tal manera que una [blue]*referencia declarada de una clase* (atributo, parámetro o declaración local o elemento de un vector) [blue]*acepta la asignación de la dirección de un objeto de dicha clase o de alguna de sus clases derivadas* (hija, nieta,...)

* Por tanto:
** [red]*exije* la existencia de una jerarquía de clacificación mediante [red]*relaciones de herencia*
** pero las [red]*jerarquías de clasificación NO exigen tratamientos polimòrficos*

a|
_En un punto dado, existen listas, en otro punto, existen conjuntos y, en otro punto, pueden existir indiferentemente listas o conjuntos_

[source]
....
Set set;
 // set = new List(); ERROR!!!
set = new Set();
List list;
list = new List();
list = new Set();
....

a|
* donde [red]*un objeto se crea de una clase y siempre será de esa clase* mientras que la [red]*referencia puede tener, en un momento dado, una dirección de un objeto lista o de un objeto conjunto* 
* con la [red]*incorporación del polimorfismo*, tiene sentido [green]*declarar referencias a clases abstractas con la intención de almacenar direcciones de objetos de clases concretas derivadas*, NO de clases abstractas que no son instanciables

|===

[cols="50,50", options="header"]
|===

a| - *[blue]#Comportamiento:#*
a| - *[red]#Limitación:#* 
a|
* cuando [blue]*se lanza un mensaje a un objeto a travéz de una referencia polimorfica se ejecuta el método prescrito en la clase del objeto que recibe el mensaje*, [red]*independientemente de la clase de la declaración de la referencia* 

a|
* cuando [blue]*se lanza un mensaje a un objeto a travéz de una referencia polimorfica, éste debe estar contemplando en el interfaz de clase de la que se declaró la referencia*, [red]*sin contemplar los posibles métodos añadidos en la clase del objeto apuntado*

a|
[source, java]
....
List list;
list = new List() 
list.insertFirst(5); // con repetición
list = new Set() 
list.insertFirst(5); // sin repetición
....

a|
[source, java]
....
List list1 = new Set();
List list2 = new Set();
// list1.instersection(lsit2); // no disponible en List
...
Set set1 = new Set();
Set set2 = new Set(); 
set1.instersection(set2);
...
....

|===

include::ust1_formalization.adoc[]
include::ust2_polymorphism.adoc[]
include::ust3_profits.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust7_polymorphism/ust1_formalization.adoc ===== -->

#### Formalización

[cols="45,55", options="header"]
|===

a| *[blue]#Enlace:#*
a| [blue]_Ejemplo_

a|
* es la [blue]*asociación entre un elemento de un lenguaje de programación y una de sus características*;

a|
* _una variable y su nombre, su valor, su dirección, su tipo,...; 
* una constante y su nombre, su valor, su dirección, su tipo,...; 
* una expresión y su número de operadores, su valor resultante, su tipo,..._ 

|===

[cols="50,50", options="header"]
|===

a| *[blue]#Tipos de Enlace#*
a| [blue]_Ejemplo_

a|
* [blue]*Enlace estático* es aquel enlace que [blue]*se puede resolver analizando el código*, o sea, en tiempo de compilación;

a|
- _una variable y su nombre, su tipo,..._
- _una constante y su nombre  su valor, su tipo,..._
- _una expreción y su número de operadores, su tipo,..._

a|
* [blue]*Enlase dinámico* es aquel enlace que [red]*NO se puede resolver analizando el código sino que se resuelve en tiempo de ejecución*;

a|
- _una variable y su valor, ..._
- _una expresión y su valor evaluado_

|===

[cols="20,40,40", options="header"]
|===

a| *[blue]#Polimorfismo#*
2+a|[blue]_Ejemplos_

.2+a|
*  es un [blue]*enlace dinámico entre una referencia y una clase de objeto apuntado por la referencia*;

a|
[source,java]
....
Lista collection;
...
collection = new ...;
...
... collection ...
....

a|
[source,java]
....
Person person;
...
person = new ...
...
... person ...
....

2+^.^a|
image::ListaColeccion.jpg[height32]

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust7_polymorphism/ust2_polymorphism.adoc ===== -->

#### Polimorfismo vs sobrecarga

[cols="10,50,40", options="header"]
|===

a| *[blue]#Sobrecarga#*
2+a| [blue]_Ejemplos_

a|
es un [blue]*enlace estático entre un mensaje y el método que se ejecuta*;

a|
[source,java]
....
class A {
  public void m()
  public void m(A a)
  public void m(B b)
  public A m(B b, C c)
  public B m(A a, C c)
}
class B {
}
....

a|
[source,java]
....
class C {
}
…

A a;
B b;
C c;
a.m(b, c).m();
b = a.m(a, c);
…
....
|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust7_polymorphism/ust3_profits.adoc ===== -->

#### Beneficios del Polimorfismo

[cols="2", options="header"]
|===

a| *[blue]#Abstracción#*
a| *[blue]#Extensibilidad#*

a|
[quote, Jacobson (creador de los Casos de Uso), 1992]
“Entonces es el receptor del mensaje el que determina cómo se interpretará el mensaje y no lo hará el emisor. El emisor sólo necesita conocer qué comportamiento puede desarrollar el otro objeto, no qué clase de objeto cree que es y, por tanto, qué método realiza en cada instante el comportamiento. Esto es una herramienta extremadamente importante para permitirnos desarrollar sistemas flexibles. De esta manera, sólo tenemos especificado qué ocurre pero no cómo ocurrirá. Mediante esta forma de delegar qué ocurrirá, se obtiene un sistema flexible y resistente a las modificaciones” 

a|
[quote, Stroustrup (creador de C++), 1993 ]
“Emplear las consultas de tipo durante la ejecución para implantar un enunciado de conmutación – estructura de control de flujo CASE o IF-THEN-ELSE encadenados – en un campo de tipo destruye toda la modularidad de un programa y anula los objetivos de la programación orientada a objetos. También es propensa a errores; […] La experiencia demuestra que los programadores que se formaron con lenguajes como Pascal o C encuentran esta trampa muy difícil de resistir. Una razón es que este estilo requiere menos premeditación […]; en este contexto, semejante falta de premeditación muchas veces no es más que una chapuza.” 

2+^.^a|
* _!!! No se puede preguntar por la clase de un objeto polimórfico!!!_ 

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust8_casting/ust0_index.adoc ===== -->

### Conversión de Tipos

[cols="50,50", options="header"]
|===

a| *[blue]#Conversión ascendente (upcast)#*
a| *[blue]#Conversión descendente (downcast)#*

a|
cuando se transforma una dirección de un objeto de una clase a una dirección del objeto pero de una clase ascedente (padre, abuela, …) ;

a|
cuando se transforma una dirección de un objeto de una clase a una dirección del objeto pero de una clase derivada (hija, nieta, …) ;

.2+^.^a|
[red]_Cualquier otra conversión produce error en tiempo de ejecución (conversión de una dirección de un objeto de una clase a otra clase fuera de la rama ascendente o del árbol descendente: tíos, hermanos, clases ajenas a la jerarquía, …)_ 

|===

[cols="35,65", options="header"]
|===

a|
a| *[blue]#Ejemplo#*

a|
* _Conversión implícita:_ por conversión ascendente cuando se asigna una dirección de un objeto de una clase a una referencia declarada a una clase ascendente;

* _Conversión explícita: por conversión descendente a través del operador de conversión de tipos (cast);_     

a|
[source,java]
....
(<tipo>) <direccion>
....

[source,java]
....
Lista lista = new Lista();
Conjunto conjunto = new Conjunto()
Lista coleccion = new Conjunto();
Conjunto resultado;
resultado = conjunto.interseccion(coleccion); // ERROR
resultado = conjunto.interseccion((Conjunto) coleccion);
resultado = coleccion.interseccion(conjunto); // ERROR
resultado = ((Conjunto) coleccion).interseccion(conjunto);
((Conjunto) lista).interseccion(conjunto); // ERROR DE
                                          // EJECUCION
....

|===

#### Clase _Object_

[cols="60,40"]
|===

a|
* [blue]#Toda clase "no derivada" explícitamente hereda implícitamente de la clase predefinida __Object__#
** Proporciona un conjunto de [blue]*métodos comunes a todas las clases*, algunos de ellos [blue]#susceptibles de ser redefinidos# en cualquier clase de la manera oportuna.
*** además, métodos para la [blue]#sincronización# de programas concurrentes y para usar la [blue]#reflexión#

a|
[source,java]
....
class Object {
  public boolean equals(Object)
  public String toString()
  public int hashCode()
  protected Object clone()
  protected void finalize() 
  ...
}
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust5_object_oriented/ust9_enums/ust0_index.adoc ===== -->

### Herencia y Enumerados

[cols="50,50", options="header"]
|===

a| [red]_Sin enumerados_
a| [green]_Con enumerados_

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a4_orientadoObjetos/a6_enums/a1_inherits/App.java[]
....

a| 
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a4_orientadoObjetos/a6_enums/a2_enums/App.java[]
....

|===


[cols="33,33,33", options="header"]
|===
3+a| [green]*Aplicaciones*

a| - Language - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a3_date/a3_enums/Language.java[_sin herencia_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a3_date/a4_inherits/Language.java[con herencia]

a| - Month - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a3_date/a4_inherits/Month.java[_sin herencia_] - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a3_date/a3_enums/Month.java[con herencia]

a|

|===











<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust6_modular/ust0_index.adoc ===== -->

## Programación Modular

[cols="25,75", options="header"]
|===

a| [blue]*Modularidad*
a| [blue]*Niveles*

.4+a| - Proceso de descomposición de un sistema (en nuestro caso, software) en un conjunto de módulos [blue]#poco acoplados (independientes) y altamente cohesivos (con significado propio)#;

a| - [blue]*Clases*, módulos [blue]#elementales en los que se descompone un programa/ biblioteca/ aplicación#

a| - [blue]*Paquetes*, agrupan un [blue]#conjunto de clases estrechamente relacionadas# entre sí

a| - [blue]*Bibliotecas*, agrupan un [blue]#conjunto de paquetes que proporcionan un conjunto de funcionalidades genéricas#

a| - [blue]*Aplicaciones*, agrupan un [blue]#conjunto de paquetes y bibliotecas, para proporcionar un conjunto de funcionalidades específicas#

|===

[cols="50,50", options="header"]
|===

2+a| [green]*Beneficios*

a| 
- [green]*Reusabilidad*, permiten [green]#fomentar la reutilización# en muchos programas diferentes
- [green]*Encapsulación*, permiten [green]#ocultar la implementación del módulo de su interfaz#, lo que redunda en una mayor capacidad para sustituir un módulo por otro con la misma funcionalidad, facilitando el mantenimiento de las aplicaciones

a| 
- [green]*Espacios de nombres*, permiten [green]#resolver colisiones entre los nombres de los identificadores# usados en cada módulo
- [green]*Arquitectura*, permiten [green]#organizar los componentes de los que se compone el programa y las relaciones entre estos elementos#
- [green]*Desarrollo en equipo*, permiten [green]#separar responsabilidades entre distintos grupos de desarrolladores#, que pueden implementar y probar cada módulo independientemente y en paralelo

|===

include::ust1_package.adoc[]
include::ust2_classes_visibility.adoc[]
include::ust3_import.adoc[]
include::ust4_member_visibility.adoc[]
include::ust5_inherit.adoc[]

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - link:[Menús] - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_menu/a4_extends/a4_modelDynamicMenu[whitoutPackages] - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_menu/a5_package[withPackages]

a| - link:https://github.com/USantaTecla-0-domains/game-ticTacToe/tree/master/1.0.basic[TicTacToe] - link:https://github.com/USantaTecla-tech-java/game-ticTacToe/tree/master/domainModel/basic/src/main/java/usantatecla[Models] - link:https://github.com/USantaTecla-tech-java/game-ticTacToe/tree/master/documentView/basic/src/main/java/usantatecla[ModelsViews]

a| 

|===

include::ust6_api_j2ee.adoc[]


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust6_modular/ust1_package.adoc ===== -->

### Jerarquía de Paquetes 

[cols="50,50", options="header"]
|===

a| [blue]*Nombres de paquetes*
a| [blue]_Ejemplos_

.4+a|
- Permite agrupar un [blue]#conjunto de clases, interfaces y enumerados, junto con archivos de recursos# (como textos, imágenes, sonidos, ...) en paquetes
* Un paquete puede contener, a su vez, otros paquetes, lo que produce una [blue]*organización jerárquica* y debe situarse en un [blue]#directorio del sistema operativo#, de acuerdo a la jerarquía de paquetes, cuya raíz puede estar en cualquier directorio
* Cada paquete tiene un [blue]#nombre, que comienza por minúsculas y que corresponde con la jerarquía de directorios# del sistema operativo
* El [blue]#nombre del paquete debe ser único# (como los directorios dentro de un directorio), lo cual es problemático si puede usarse en cualquier lugar del mundo, en cuyo caso, la ruta del nombre de los paquetes deberían comenzar con un [blue]#nombre de dominio de Internet de la institución de desarrollo, en orden inverso#

[source,java]
....
  <paquete1>.<paquete2>. ... .<paqueteN>
....

a|
[source,java]
....
  pooa.util
  pooa.ter.modelos
....
a|
image::Ejemplo.png[height32]
a|
[source,java]
....
  es.upm.eui.lpsi.pooa.util
....
a|
image::Ejemplo2.png[height32]

|===

[cols="45,55", options="header"]
|===

a| [blue]*Declaración de paquete*
a| [blue]_Ejemplo_

.3+a|
- Para [blue]*añadir una clase, interface y/o enumerado a un paquete* (clasificadores), hay que situar su fichero fuente en el directorio del paquete y, en la primera línea del código (sin contar los comentarios), escribir la sentencia de declaración de paquete [blue]*__package__*, para indicar que el [blue]#clasificador pertenece a ese paquete#
* En un fichero fuente [blue]*sólo puede aparecer una declaración de paquete*
* Si en un fichero fuente [red]#no se especifica ningún paquete, la clase pertenecerá a un paquete sin nombre por defecto#;
** Esto puede ser útil en el caso de aplicaciones con pocas clases

a|
[source,java]
....
 package <paquete1>.<paquete2>. ... <paqueteN>;
....

a|
image::Ejemplo3.png[height32]
a|
[source,java]
....
  package pooa.ter.modelos;

  class MTablero {
    ...
  }
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust6_modular/ust2_classes_visibility.adoc ===== -->

### Visibilidad de Clasificadores

[cols="50,50"]
|===

a|
- La visibilidad de las clases de un paquete es:
* Las clases declaradas [blue]*__public__* son [blue]*accesibles desde cualquier código exterior al paquete*
** Si hay una [blue]*clase publica, entonces el nombre del fichero debe coincidir con el nombre de esa clase, y con extensión __.java__*
** En [blue]#un fichero fuente puede haber varias declaraciones# de clases, pero [blue]#como máximo una de ellas puede ser __public__#;
*** La recomendación es disponer [green]#los clasificadores en distintos ficheros#, siendo [red]#excepcional y poco recomendado# para alguna clase auxiliar 
* Las [blue]#clases NO declaradas __public__# sólo son [blue]*accesibles solo desde el código de ese paquete* (tampoco desde sus subpaquetes);

a|
- _MTablero.java_
[source,java]
....
package pooa.ter.modelos;

public class MTablero {
 ...
}
....

- _CAbrir.java_
[source,java]
....
package pooa.ter.controladores;

public class CAbrir {
  ...
}
class CPoner {
  ...
}
class CMover {
  ...
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust6_modular/ust3_import.adoc ===== -->

### Importación de Clasificadores

[cols="50,50", options="header"]
|===
 
a| [blue]*Acceso a las clases*
a| [red]*Prohibido acceso a las clases*

a|
* [blue]#con *visibilidad pública* desde otra clase de *otro paquete*, con la *importación* correspondiente#
* [blue]#con *cualquier visibilidad* desde otra clase del *mismo paquete*, *sin importación*#

a|
* [red]#con *visibilidad de paquete* desde otra clase de *otro paquete*#
* [red]#*del paquete por defecto* desde otra clase de *otro paquete*#

|===

[cols="45,55", options="header"]
|===

a| [blue]*Importación*
a| [blue]_Ejemplo_

a|
- [blue]*Importación explícita*: para [blue]#acceder a una clase con visibilidad pública declarada en un paquete desde una clase de otro paquete#, debe usarse la [blue]*sentencia de importación __import__* de un único tipo, [blue]#especificando el nombre completamente calificado de la clase# a la que se desea acceder
* Deben aparecer en un fichero fuente [blue]*después de la declaración de paquete y antes de cualquier clasificador*

[source,java]
....
import <paquete1>. ... <paqueteN>.<Clasificador>;
....
a|

[source,java]
....
package pooa.ter.controladores;

import pooa.ter.modelos.MTablero;
import pooa.ter.modelos.MTurno;
import pooa.ter.vistas.VTablero;
import pooa.ter.vistas.VTurno;

public class CAbrir {
  private MTablero mTablero = new MTablero();
  private VTablero vTablero = new VTablero(mTablero);
  private MTurno mTurno = new MTurno();
  private VTurno vTurno = new VTurno(mTurno);
  ...
}
....

a|
- [blue]*Importación bajo demanda*: cuando se usan [blue]*muchas clases de un mismo paquete, se pueden importar todas las clases del paquete*, mediante la sentencia de importación *import* de tipos bajo demanda con la [blue]*notación* *

[source,java]
....
import <paquete1>. ... <paqueteN>.*;
....

a|
[source,java]
....
package pooa.ter.controladores;

import pooa.ter.modelos.*;
import pooa.ter.vistas.*;

class CMover {
  private MTablero mTablero;
  private VTablero vTablero;
  private MTurno mTurno;
  private VTurno vTurno;
  ...
}
....

a|
- [blue]*Importación implícita*: el código fuente de [blue]*cualquier fichero de un paquete importa implícitamente el resto de su propio paquete*, por lo que todas las clases definidas en un paquete están disponibles para todas las clases de ese mismo paquete

a|
[source,java]
....
package pooa.ter.controladores;

import pooa.ter.controladores.CPoner; // innecesario

public class CAbrir {
  ...
  CPoner cPoner = new CPoner(mTablero, mTurno);
  CMover cMover = new CMover(mTablero, mTurno);
  ...
}
....

|===

[cols="35,30,35", options="header"]
|===

a| [red]*Colisión de nombres*
2+a| [blue]_Ejemplo_

a|
* Es un [red]*error importar el mismo nombre de clase de dos paquetes diferentes* usando importaciones individuales de clase y/o bajo demanda

a|
[source,java]
....
import java.util.Date;
import java.sql.Date; // Error
....

a|
[source,java]
....
import java.util.*;
import java.sql.*;
...
  Date fecha = new Date(); // Error
...
....

a|
- [blue]*Resolución de Colisión de nombres*: se [green]*debe usar el nombre completamente calificado de la clase en todas sus ocurrencias*

2+a|
[source,java]
....
…
java.util.Date fechaUtil = new java.util.Date();
java.sql.Date fechaSql = new java.sql.Date();
…
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust6_modular/ust4_member_visibility.adoc ===== -->

### Visibilidad de Miembros

[cols="18,19,20,23,20"]
|===

2+a|
* Los [blue]#miembros declarados **__public__** son accesibles desde cualquier código exterior al paquete#
* Los [blue]#miembros declarados **__private__** sólo son accesibles desde el código de esa clase#
3+a|
* Los [blue]#miembros declarados **__protected__** son accesibles desde el código de esa clase, de sus clases derivadas de cualquier paquete, y del resto de clases de ese paquete# (no de sus subpaquetes)
* Los [blue]#miembros que [blue]*no especifican ningún modificador* de acceso sólo son accesibles desde las clases de ese paquete# (no de sus subpaquetes)

a| - [blue]*Modificador*
* [blue]_public_
* [blue]_protected_
* [red]#ninguno#
* [blue]_private_

a| - [blue]*Desde su clase*
* [green]*Si*
* [green]*Si*
* [green]*Si*
* [green]*Si*

a| - [blue]*Desde su paquete*
* [green]*Si*
* [green]*Si*
* [green]*Si*
* [red]*No*

a| - [blue]*Desde sus subclases*
* [green]*Si*
* [green]*Si*
* [red]*No*
* [red]*No*

a| - [blue]*Desde el resto*
* [green]*Si*
* [red]*No*
* [red]*No*
* [red]*No*

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust6_modular/ust5_inherit.adoc ===== -->

### Paquetes y Herencia

[cols="60,40"]
|===

a|
- Un [blue]*método se puede redefinir en una clase derivada sólo si dicho método de la clase base es accesible desde la clase derivada*
* [red]*Si el método no es accesible, el método de la clase derivada no redefine el método de la clase base, incluso aunque tenga la misma cabecera*
a|
- Cuando se [blue]*invoca un método, el sistema tiene que considerar en tiempo de ejecución la accesibilidad de dicho método para decidir qué implementación del método se debe invocar*
 
|===

[cols="50,50", options="header"]
|===

2+^.^a| [blue]_Ejemplo_

a|
[source,java]
....
package package1;

public class BaseClass {

  public void writeln() {
    this.privateMehtod();
    this.packageMethod();
    this.protectedMethod();
    this.publicMethod();
  }

  private void privateMehtod() {
    Console.getInstance().writeln( "privateMehtod of BaseClass");
  }

  void packageMethod() {
    Console.getInstance().writeln( "packageMethod of BaseClass");
  }

  protected void protectedMethod() {
    Console.getInstance().writeln( "protectedMethod of BaseClass");
  }

  public void publicMethod() {
    Console.getInstance().writeln( "publicMethod of BaseClass");
  }

}
....

a|
[source, java]
....
package package2;

import package1.BaseClass;

public class DerivatedClass extends BaseClass {

    private void privateMehtod() {
    Console.getInstance().writeln( "privateMehtod of DerivatedClass");
  }

  void packageMethod() {
    Console.getInstance().writeln( "packageMethod of DerivatedClass");
  }

  protected void protectedMethod() {
    Console.getInstance().writeln( "protectedMethod of DerivatedClass");
  }
  
  public void publicMethod() {
    Console.getInstance().writeln( "publicMethod of DerivatedClass");
  }

}
....

a|
[source, java]
....
package app;

import package1.DerivatedClass;

class App {

  public static void main(String[] args) {
    new DerivatedClass().writeln();
  }
}
....

a|
* al ejecutar su método principal, se produciría la siguiente salida por pantalla:

[source, java]
....
privateMehtod of BaseClass
packageMethod of BaseClass
protectedMethod of DerivatedClass
publicMethod of DerivatedClass
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust6_modular/ust6_api_j2ee.adoc ===== -->

### API de J2SE

[cols="50,50", options="header"]
|===

2+a| [blue]*Biblioteca estandar* ([blue]*__link:https://docs.oracle.com/javase/8/docs/api/[Application Programming Interface]__*)

a|
- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/lang/package-summary.html[__java.lang__]*: clases básicas del lenguaje, recubrimientos, ... [red]#importado implícitamente por cualquier proyecto#
- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html[__java.util__]*: utilidades y [green]#estructuras de datos#
- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html[__java.time__]*: [blue]#calendario#, [red]#desaprobando __java.util.Calendar__, __java.util.Date__, ...#
- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html[__java.io__]*: acceso a ficheros
- [blue]*__java.awt, javax.swing__*: interfaces gráficas de usuario
- [blue]*__java.net__*: acceso a redes
- [blue]*__java.sql__*: acceso a bases de datos
- ...

^.^a|
image::API1.png[height32]
^.^a|
image::API2.png[height32]
^.^a|
image::API3.png[height32]
^.^a|
image::API4.png[height32]
^.^a|
image::API5.png[height32]

|===

[cols="38,62", options="header"]
|===

a| [blue]#link:https://docs.oracle.com/javase/6/docs/api/java/util/Random.html[Clase __java.util.Random__]#
a| [blue]_Ejemplo_

a|
- implantación [green]#más eficiente y menos sesgada, más aleatoria#, que _Math.random()_
[source, java]
....
Random() {}
Random(long seed) {}
int nextInt(int top)<1>
int nextInt()
long nextLong()
float nextFloat()
double nextDouble()
double nextGaussian()
boolean nextBoolean()
void nextBytes(byte[] bytes)
void setSeed(long seed)<2>
....
<2> genera valores de 0 a _top_
<1> establece una semilla a partir de la cual generar los siguientes valores aleatorios, habitualmente alimentado con _System.currentTimeMillis()_

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a6_packages/a2_random/App.java[]
....

|===

[cols="40,60", options="header"]
|===

a| [blue]#Clases de Expresiones Regulares#
a| [blue]_Ejemplo_

a|
- [blue]*link:https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html[__java.util.regex.Pattern__]*
[source, java]
....
static Pattern compile(String expReg)
Matcher matcher(String text)
....
- [blue]*link:https://docs.oracle.com/javase/6/docs/api/java/util/regex/Matcher.html[__java.util.regex.Matcher__]*
[source, java]
....
boolean find()
String group()
int start()
int end()
String replaceAll(String text)
....

a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a6_packages/a1_regExp/App.java[]
....

|===

[cols="45,55", options="header"]
|===

a| [blue]#Clases de Calendario#
a| [blue]_Ejemplo_

a|
- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html[__java.time.LocalDateTime__]*
[source, java]
....
int getYear()
LocalDateTime plusYears(long years)
LocalDateTime minusYears(long years)
LocalDateTime withYear(int year)
Month getMonth()
int getMonthValue()
LocalDateTime plusMonths(long months)
LocalDateTime minusMonths(long months)
LocalDateTime withDayOfMonth(int dayOfMonth)
LocalDateTime withMonth(int month)
LocalDateTime plusWeeks(long weeks)
LocalDateTime minusWeeks(long weeks)
int getDayOfMonth()
DayOfWeek getDayOfWeek()
int getDayOfYear()
LocalDateTime plusDays(long days)
LocalDateTime minusDays(long days)
LocalDateTime withDayOfYear(int dayOfYear)
int getHour()
LocalDateTime plusHours(long hours)
LocalDateTime minusHours(long hours)
LocalDateTime withHour(int hour)
int getMinute()
LocalDateTime plusMinutes(long minutes)
LocalDateTime minusMinutes(long minutes)
LocalDateTime withMinute(int minute)
int getSecond()
LocalDateTime plusSeconds(long seconds)
LocalDateTime minusSeconds(long seconds)
LocalDateTime withSecond(int second)
int getNano()
LocalDateTime plusNanos(long nanos)
LocalDateTime minusNanos(long nanos)
LocalDateTime withNano(int nanoOfSecond)
LocalDateTime plus(long amountToAdd, TemporalUnit unit)
LocalDateTime minus(long amountToSubtract, TemporalUnit unit)
LocalDateTime plus(TemporalAmount amountToAdd)
LocalDateTime minus(TemporalAmount amountToSubtract)
LocalDateTime with(TemporalAdjuster adjuster)
LocalDateTime with(TemporalField field, long newValue)
long getLong(TemporalField field)
boolean isAfter(LocalDateTime other)
boolean isBefore(LocalDateTime other)
LocalDate toLocalDate()
LocalTime toLocalTime()
static LocalDateTime now()
static LocalDateTime now(Clock clock)
static LocalDateTime now(ZoneId zone)
static LocalDateTime of(LocalDate date, LocalTime time)
static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
static LocalDateTime parse(CharSequence text)
static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)
...
}

class LocalDate {
public int getYear()
...
}

class LocalTime {
public int getHour()
...
}
....

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/Month.html[__java.time.Month__]*
[source, java]
....
JANUARY
...
int	maxLength()
....

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html[__java.time.DayOfWeek__]*

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/Period.html[__java.time.Period__]*

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html[__java.time.Duration__]*

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html[__java.time.ZoneId__]*

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html[__java.time.ZonedDateTime__]*

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html[__java.time.format.DateTimeFormatter__]*

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html[__java.time.temporal.ChronoUnit__]*

- [blue]*link:https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAdjusters.html[__java.time.temporal.TemporalAdjusters__]*



a|
[source, java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a6_packages/a3_localDateTime/App.java[]
....

|===


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/diagramaExcepciones.adoc ===== -->

[plantuml,Excepciones,svg]
....

skinparam backgroundColor #222222
skinparam handwritten true
hide circle
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
    AttributeFontSize 20
    AttributeFontName courier
    AttributeFontStyle bold
    AttributeFontColor #DarkGrey
}

class Throwable {
    + String getMessage()
    + void printStackTrace()
}
class Error 
class Exception
class RuntimeException 
class IOExeption 
class "..." as OtherException

Throwable <\|-- Error
Throwable <\|-- Exception 
Exception <\|-- RuntimeException
Exception <\|-- IOExeption
Exception <\|-- OtherException
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust0_index.adoc ===== -->

## Programación con Excepciones

[cols="65,35"]
|===

a|
* cuando se produce [blue]*un error de ejecución* en un programa, [red]*se interrumpe bruscamente la ejecución secuencial de sus instrucciones*, es decir, no se ejecuta ninguna operación posterior a aquélla en la que se ha producido el error, y se [blue]*eleva o lanza una excepción que representa ese error*

a|
* por [red]*defecto*, se muestra [red]*por pantalla un informe del error producido*, pero esto es [green]#configurable por parte del programador# con procesos para la recuperación del error

|===

[cols="50,50"]
|===

a|
* las [blue]*excepciones*:
** proporcionan una [green]#forma clara de indicar la existencia de posibles errores de ejecución, así como de comprobar la ocurrencia de dichos errores de ejecución sin oscurecer el código del programa#
** las excepciones se representan mediante [blue]*objetos de clases que pertenecen a la siguiente jerarquía*
** cuando se produce una excepción se [blue]*crea un objeto de la clase adecuada, dependiendo del tipo de error producido*, que mantendrá la información sobre el error y proporcionará métodos para obtener dicha información, [green]#cosificación#

a|
include::diagramaExcepciones.adoc[]

|===

[cols="65,35"]
|===

a|
- [blue]*Clase __Throwable__*:
* la raíz de la jerarquía de clasificación y, por tanto, es la [blue]*superclase de todas las excepciones*.

[source, java]
....
public String toString() {} <1>
public void printStackTace() {} <2>
....
<1> devuelve un [blue]*mensaje que informa* de la excepción
<2> [blue]*imprime por la salida estándar los métodos que estaban en la pila de ejecución* (llamadas anteriores a aquélla que produjo el error) cuando se produjo la excepción y la línea donde se produce la excepción. Es el comportamiento [blue]*por defecto* cuando no se maneja la excepción.

a|
- [blue]*Clase __Error__*:
* representa las [blue]*excepciones graves que no deberían ser capturadas por un programa*
** [red]_java.lang.VirtualMachineError_ deriva de _java.lang.Error_
- [blue]*Clase __Exception__*:
* representa las [blue]*excepciones normales que un programa podría capturar*

|===

[cols="40,60"]
|===


a|
- [blue]*Clase __RuntimeException__*:
* representa aquellas excepciones normales que [blue]*NO es necesario capturar en un programa*, se denominan [blue]*no comprobadas*
** [red]_java.lang.ArithmeticException_ deriva de _java.lang.RuntimeException_, por división por cero

a|
- [blue]*Clase __IOException__*:
* el resto de clases que heredan de la clase _Exception_ representan [blue]*aquellas excepciones que SI es necesario capturar en un programa*, estas excepciones se denominan [blue]*comprobadas*
** representan las excepciones comprobadas relacionadas con operaciones fallidas de entrada y salida, 
*** [red]_java.io.FileNotFoundException_ deriva de _java.io.IOException_, al tratar de abrir en modo lectura un fichero inexistente

|===

[cols="40,60", options="header]
|===

2+a| [blue]*Gestión de excepciones*

a|
* [blue]*_elevar_* la excepción: cuando una [blue]#biblioteca o subsistema encuentra un error porque no se cumplen las condiciones de su uso#
* [blue]*_capturar_* la excepción: cuando una [blue]#aplicación o biblioteca usa un recurso (ficheros, comunicaciones, bibliotecas, ...) que puede dar problemas#, hay que capturarlos para solventar esos problemas
 
a| 
* [blue]*_delegar_* la excepción:
** cuando una aplicación o biblioteca usa un recurso (ficheros, comunicaciones, bibliotecas, ...) que pueden dar problemas, se [blue]#le comunica a quien corresponda para que los resuelva#
** cuando una aplicación o biblioteca usa un recurso (ficheros, comunicaciones, bibliotecas, ...) que pueden dar problemas, hay que capturarlos para [blue]#solventar en parte esos problemas y elevar otra excepción a quien corresponda para que resuelva el resto#

|===

include::ust1_throw/ust0_index.adoc[]
include::ust2_catch_finally/ust0_index.adoc[]
include::ust3_throws.adoc[]
include::ust4_polymorphism.adoc[]
include::ust5_inherits/ust0_index.adoc[]
include::ust6_streams//ust0_index.adoc[]
include::ust7_files/ust0_index.adoc[]
include::ust8_serialize/ust0_index.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust1_throw/ust0_index.adoc ===== -->

#### Elevación de Excepciones

[cols="35,70", options="header"]
|===

2+a| [blue]*Sentencia __throw__*

a|
- durante la ejecución de un método se puede [blue]*elevar una excepción, para indicar que se ha producido un error de ejecución debido a alguna razón, lo que provoca la finalización brusca de su contexto de ejecución*

a|
- para elevar una excepción se debe usar la siguiente sentencia:
[source, java]
....
  throw <expresión>; <1>
....
<1> donde la expresión debe evaluar a una [blue]*referencia a __Throwable__*
- en un mismo método se pueden elevar, de [blue]#forma alternativa, varias excepciones#

|===

[cols="60,40"]
|===

a|
[source,java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a1_arithmetic/App.java[]
....

a|
- _Ejemplo_:  [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a1_arithmetic/Fraction.java[_Fraction.java_]#

[source, java]
....
Antes
Exception in thread "main" java.lang.ArithmeticException: El denominador no puede ser 0
  at Fraccion.<init>(Fraccion.java:10)
  at Aplicacion.main(Aplicacion.java:6)
....

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a2_format/App.java[]
....

a|
- _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a2_format/FractionScanner.java[_FractionScanner.java_]#

[source, java]
....
Antes
Exception in thread "main" java.lang.NumberFormatException: Formato incorrecto
  at Fraccion.<init>(Fraccion.java:17)
  at Aplicacion.main(Aplicacion.java:6)
....

|===

[cols="30,70", options="header"]
|===

a| [blue]*Cláusula __throws__*
a|

a|
* las [blue]*únicas excepciones comprobadas que puede elevar un método son aquéllas cuyas clases se declaran en su cabecera* mediante la siguiente cláusula:

a|
[source, java]
....
<modificador> <tipo1> <nombreMétodo>({<tipo2> <parametro>, }+)
       throws {<claseExcepción1>,}+
....

a|
* como ya hemos visto, un [blue]#método puede elevar excepciones no comprobadas sin necesidad de declarar sus clases en la cabecera#, aunque puede ser [green]*conveniente por razones de documentación*

** _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a3_throws/Fraction.java[_Fraction.java_]#

a|
[source,java]
....
class Fraction {
  ...
  public void read(String path) throws IOException {
  ...
    if (<error de apertura>) {
      throw new IOException("Error al leer el fichero " + path);
    }
    ...
  }
  ...
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust2_catch_finally/ust0_index.adoc ===== -->

#### Captura de Excepciones

[cols="30,40,30", options="header"]
|===

2+a| [blue]*Excepciones no comprobadas*
a| [blue]*Excepciones comprobadas*

a|
- elevadas por un método [blue]#**pueden ser capturadas** en ese mismo método o en cualquier método que, directa o indirectamente, lo haya invocado#
a|
- si un método invoca otro método que [blue]#eleva excepciones no comprobadas **no es necesario que las capture**, pero, en el caso de que se produzca la excepción, si ningún método captura la excepción, el **programa termina bruscamente**#

a|
- si un método invoca otro método que [blue]#eleva excepciones comprobadas, entonces es **obligatorio que el método que invoca al otro capture** dichas excepciones#

|===

[cols="35,65", options="header"]
|===

2+a| [blue]*Sentencia __try/catch/finally__*

a|
- para capturar una excepción se debe usar la siguiente sentencia, donde se pueden [red]*omitir la claúsula __catch__ o __finally__, pero no ambas*:

[source, java]
....
try {
     <sentencia1>
     ...
     <sentenciaN>
}
[
   catch (<declaraciónExcepción1>) {
     <sentencia11>
     ...
     <sentencia1N1>
}
...
   catch (<declaraciónExcepciónM>) {
    ...
}
]
[ finally {
  ...
} ]
....

a|
* [blue]*Bloque __try__*:
** indica las sentencias en cuya ejecución [blue]*se desea capturar una excepción*, en el caso de que ésta se produzca
** cuando se produce una excepción en alguna de sus sentencias, [blue]*se interrumpe bruscamente su ejecución*
* [blue]*Bloque __catch__*:
** especifican las [blue]*sentencias a ejecutar cuando se produzca una excepción* dentro del bloque try
** se debe especificar la [blue]*clase de excepción que queremos capturar* mediante la declaración de una excepción de esa clase
** opcionalmente, se pueden especificar [blue]*distintos bloques catch, para indicar distintos tratamientos* para distintas clases de excepciones
** es un error especificar más de un bloque catch para una misma clase de excepción;
* [blue]*Bloque __finally__*:
** [blue]*se ejecuta siempre*, después de la ejecución de _try/catch_
** sirve para [blue]*ejecutar un cierto código independientemente* de si se produce o no la excepción, si se captura o no, o de cualquier otra circunstancia;
** se suele usar para garantizar la [green]*liberación de recursos*, por ejemplo, cerrar ficheros archivos abiertos, puertos de comunicaciones, etc.


|===

[cols="65,35", options="header"]
|===

a| [blue]_Ejemplo_
a| [blue]_Ejecución_
a|
[source,java]
.... 
include::../../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a4_catch/App.java[]
....

a|
- _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a4_catch/App.java[_App.java_]#

[source,java]
....
Inicio
Antes
Error aritmetico
java.lang.ArithmeticException: El denominador no puede ser 0
      at Fraccion.<init>(Fraccion.java:10)
      at Aplicacion.main(Aplicacion.java:10)
Fin
....

a|
[source,java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a5_catchsFirst/App.java[]
....

a|
- _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a5_catchsFirst/App.java[_App.java_]#

[source,java]
....
Inicio
Antes
Error aritmetico: El denominador no puede ser 0
Fin
....

a|
[source,java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a6_catchsSecond/App.java[]
....

a|
- _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a6_catchsSecond/App.java[_App.java_]#

[source,java]
....
Inicio
Antes
Error de formato: Formato incorrecto
Fin
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust3_throws.adoc ===== -->

#### Delegación de Excepciones

[cols="35,65", options="header"]
|===

a| [blue]*Delegación*
a| [blue]_Ejemplo_

a|
- si el [blue]*método no captura una excepción, la propaga al método que lo invocó*
* si [blue]#un método declara que eleva excepciones comprobadas, entonces **no necesita capturar esas clases de excepciones que declara**, cuando **invoca métodos que elevan esas mismas clases de excepciones**#

- _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a7_nested/App.java[_App.java_]#

[source,java]
....
Antes
Error aritmetico
java.lang.ArithmeticException: El denominador no puede ser 0
         at Fraccion.<init>(Fraccion.java:17)
         at Fraccion.crearFraccion(Fraccion.java:26)
         at Aplicacion.main(Aplicacion.java:14)
Fin
....

a|
[source,java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a7_nested/App.java[]
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust4_polymorphism.adoc ===== -->

#### Excepciones Polimorficas

[cols="25,75"]
|===

a|
- cuando un método captura una excepción, [blue]*sólo se ejecuta la primera sentencia _catch_ en la que la referencia de la excepción producida encaje en la clase de excepción declarada* en esa sentencia __catch__;

- _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a8_polymorphic/App.java[_App.java_]#

[source,java]
....
Inicio
Antes
Error aritmetico : El denominador no puede ser 0
Fin
....

a|
[source,java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a8_polymorphic/App.java[]
....

a|
* es un [red]*error de compilación tratar de capturar una excepción en una sentencia __catch__, que ya ha sido capturada previamente* en otra sentencia _catch_;

- _Ejemplo_: [blue]#link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a9_polymorphic2/App.java[_App.java_]#

a|
[source,java]
....
include::../../../../../../src/src/main/java/es/usantatecla/a5_units/a0_fraction/a5_exceptions/a9_polymorphic2/App.java[]
....

|===

[cols="50,50"]
|===

a|
* los [blue]*métodos pueden elevar excepciones de clases hijas de las declaradas* en su cabecera mediante la cláusula _throws_;

* los [blue]*métodos redefinidos* en una clase
** pueden [blue]*eliminar excepciones de la cláusula __throws__ de su cabecera de aquéllas que estaban declaradas en la cabecera del método en su clase padre*
** pueden [blue]*sustituir excepciones en la cláusula __throws__ de su cabecera por otros excepciones de sus clases hijas*;
** [red]*NO* pueden [blue]*añadir nuevas excepciones en la cláusula _throws_ de su cabecera respeto a aquéllas que estaban declaradas en la cabecera del método en su clase padre*

a|
[source,java]
....
clase Base  {

  public void m() throws Exception { ... }

  public void n() throws Exception { ... }
}

class Derivada extends Base  {

  public void m() throws IOException {
    ...
    throw new FileSystemException() ;
    ...
  }

  public void n() {
    ...
  }
}
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust5_inherits/diagramaExcepcion.adoc ===== -->

[plantuml,Exception,svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

class Exception 
class DispensadorLLenoException 
Exception <\|-- DispensadorLLenoException
....





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust5_inherits/ust0_index.adoc ===== -->

#### Clasificación de Excepciones

[cols="39,30,30", options="header"]
|===

a|
2+a| [blue]#link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a7_exceptions[_Ejemplo: dispensers_]#

a|
- es pocible [blue]*crear nuevas clases de excepciones* siempre que hereden de la clase _Throwable_ o de sus hijas, aunque, por convención, [green]#deben heredar de _Exception_#
* estas clases pueden añadir [blue]*nuevos atributos y métodos*, como en cualquer otra relación de herencia

a|
* _Al meter un elemento en un dispensador acotado que se encuentra lleno, se detecta un error de ejecución, que se puede representar mediante una nueva clase de excepción_

a|
include::diagramaExcepcion.adoc[]

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust0_index.adoc ===== -->

### Flujos

[cols="50,50"]
|===

a|
- Los [blue]*flujos, __streams__, son objetos que representan secuencias ordenadas de datos que tienen una fuente, flujos de entrada, o un destino, flujos de salida*;
* Las clases de entrada/salida del paquete _java.io_ se definen en términos de flujos, y permiten a los programadores [blue]*abstraerse de los detalles específicos del sistema operativo al acceder a los recursos del sistema, tales como ficheros, teclado, líneas de comunicaciones, etc.*;
a|
* [blue]*Tipos de flujos en la biblioteca*:
** de [blue]*entrada y salida de __bytes__*, cuyas clases abstractas de las que heredan todas las demás son _InputStream_ y _OutputStream_
** de [blue]*entrada y salida de caracteres*, cuyas clases abstractas de las que heredan todas las demás son _Reader_ y _Writer_, donde un [blue]#caracter __Unicode__ puede estar formado por varios __bytes__#

|===

include::ust1_bytes/0_index.adoc[]
include::ust2_texts/0_index.adoc[]
include::ust3_utilities.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust1_bytes/0_index.adoc ===== -->

#### Flujos de Bytes

include::diagramaFlujoDeBytes.adoc[]
include::diagramaFlujoDeBytes2.adoc[]

[cols="50,50"]
|===

a|
[source,java]
....
class InputStream {
  public abstract int read() throws IOException { ... }
  public int read(byte[] b) throws IOException { ... }
  public int read(byte[] b, int off, int len) throws IOException { ... }
  public long skip(long n) throws IOException { ... }
  public int available() throws IOException { ... }
  public void close() throws IOException { ... }
}
....

a|
[source,java]
....
class OutputStream {
  public abstract void write(int b) throws IOException { ... }
  public void write(byte[] b) throws IOException { ... }
  public void write(byte[] b, int off, int len) throws IOException { ... }
  public void flush() throws IOException { ... }
  public void close() throws IOException { ... }
}
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust1_bytes/diagramaFlujoDeBytes.adoc ===== -->

[plantuml,FlujoDeBytes,svg]
....

skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

interface Closeable 
interface Readable 
abstract class InputStream 
class "Audio\nInputStream" as AudioInputStream 
class "Byte\nInputStream" as ByteInputStream 
class "File\nInputStream" as FileInputStream 
class "Filter\nInputStream" as FilterInputStream 
class "Piped\nInputStream" as PipedInputStream
class "Sequence\nInputStream" as SequenceInputStream 
class "Object\nInputStream" as ObjectInputStream 
class "Buffered\nInputStream" as BufferedInputStream 
class "Checked\nInputStream" as CheckedInputStream 
class "Cipher\nInputStream" as CipherInputStream 
class "Deflater\nInputStream" as DeflaterInputStream 
class "Inflater\nInputStream" as InflaterInputStream 
class "Digest\nInputStream" as DigestInputStream 
class "ProgressMonitor\nInputStream" as ProgressMonitorInputStream 
class "Pushback\nInputStream" as PushbackInputStream 
class "Data\nInputStream" as DataInputStream 
class "Object\nInput" as ObjectInput 
class "GZIP\nInputStream" as GZIPInputStream 
class "Zip\nInputStream" as ZipInputStream 
class "Jar\nInputStream" as JarInputStream 
interface "Data\nInput" as DataInput 
interface "Data\nOuput" as DataOuput 
class "Random\nAccessFile" as RandomAccessFile 
Closeable <|.. InputStream
Readable <|.. InputStream
InputStream <|-- AudioInputStream
InputStream <|-- ByteInputStream
InputStream <|-- FileInputStream
InputStream <|-- FilterInputStream
InputStream <|-- PipedInputStream
InputStream <|-- SequenceInputStream
InputStream <|-- ObjectInputStream
ObjectInput <|.. ObjectInputStream
FilterInputStream <|-- BufferedInputStream
FilterInputStream <|-- CheckedInputStream
FilterInputStream <|-- CipherInputStream
FilterInputStream <|-- DeflaterInputStream
FilterInputStream <|-- InflaterInputStream
InflaterInputStream <|-- GZIPInputStream
InflaterInputStream <|-- ZipInputStream
ZipInputStream <|-- JarInputStream
FilterInputStream <|-- DigestInputStream
FilterInputStream <|-- ProgressMonitorInputStream
FilterInputStream <|-- PushbackInputStream
FilterInputStream <|-- DataInputStream
DataInput <|.. DataInputStream
DataInput <|-- ObjectInput
DataInput <|.. RandomAccessFile
DataOuput <|.. RandomAccessFile
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust1_bytes/diagramaFlujoDeBytes2.adoc ===== -->

[plantuml,FlujoDeBytes2,svg]
....

skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam interface {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

interface Closeable 
interface Flushable 
abstract class OutputStream 
class "Object\nOutput" as ObjectOutput
class "ByteArray\nOuputStream" as ByteArrayOuputStream 
class "File\nOuputStream" as FileOuputStream 
class "Filter\nOuputStream" as FilterOuputStream 
class "Piped\nOuputStream" as PipedOuputStream 
class "Object\nOuputStream" as ObjectOuputStream 
class "Buffered\nOuputStream" as BufferedOuputStream 
class "Checked\nOuputStream" as CheckedOuputStream 
class "Cipher\nOutputSptream" as CipherOutputStream 
class "Deflater\nOuputStream" as DeflaterOuputStream 
class "Inflater\nOuputStream" as InflaterOuputStream 
class "Digest\nOuputStream" as DigestOuputStream 
class PrintStream 
class "GZIP\nOuputStream" as GZIPOuputStream 
class "Zip\nOuputStream" as ZipOuputStream 
class "Jar\nOuputStream" as JarOuputStream 
class "Data\nOutputStream" as DataOutputStream 
interface "DataOutput" as DataOutput 
Closeable <|.. OutputStream
Flushable <|.. OutputStream
DataOutput <|.. ObjectOutput
OutputStream <|-- ByteArrayOuputStream
OutputStream <|-- FileOuputStream
OutputStream <|-- FilterOuputStream
OutputStream <|-- PipedOuputStream
OutputStream <|-- ObjectOuputStream
ObjectOutput  <|-- ObjectOuputStream
FilterOuputStream <|-- BufferedOuputStream
FilterOuputStream <|-- CheckedOuputStream
FilterOuputStream <|-- CipherOutputStream
FilterOuputStream <|-- DeflaterOuputStream
DeflaterOuputStream <|-- GZIPOuputStream
DeflaterOuputStream <|-- ZipOuputStream
ZipOuputStream <|-- JarOuputStream
FilterOuputStream <|-- InflaterOuputStream
FilterOuputStream <|-- DigestOuputStream
FilterOuputStream <|-- PrintStream
FilterOuputStream <|-- DataOutputStream
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust2_texts/0_index.adoc ===== -->

#### Flujos de Caracteres

include::diagramaFlujoDeCaracteres.adoc[]
include::diagramaFlujoDeCaracteres2.adoc[]

[cols="35,65"]
|===

a|
[source,java]
....
class Reader {
  public int read() throws IOException
  public int read(char[] cbuf) throws IOException
  public abstract int read(char[] cbuf, int off, int len) throws IOException
  public long skip(long n) throws IOException
  public boolean ready() throws IOException
  public abstract void close() throws IOException
}
....

a|
[source,java]
....
class Writer {
  public void write(int c) throws IOException { ... }
  public void write(char[] cbuf) throws IOException { ... }
  public abstract void write(char[] cbuf, int off, int len) throws IOException { ... }
  public void write(String str) throws IOException { ... }
  public void write(String str, int off, int len) throws IOException { ... }
  public Writer append(char c) throws IOException { ... }
  public Writer append(CharSequence csq) throws IOException { ... }
  public Writer append(CharSequence csq, int start, int end) throws IOException { ... }
  public abstract void flush() throws IOException { ... }
  public abstract void close() throws IOException { ... }
}
....

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust2_texts/diagramaFlujoDeCaracteres.adoc ===== -->

[plantuml,FlujoDeCaracteres.svg]
....

skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

abstract class Readable 
abstract class Closeable 
abstract class Reader 

class "Buffered\nReader" as BufferedReader 
class "CharArray\nReader" as CharArrayReader
class "Filter\nReader" as FilterReader 
class "InputStream\nReader" as InputStreamReader
class "Piped\nReader" as PipedReader
class "String\nReader" as StringReader
class "LineNumber\nReader" as LineNumberReader 
class "Pushback\nReader" as PushbackReader 
class "File\nReader" as FileReader 
Readable <|.. Reader
Closeable <|.. Reader
Reader <|-- BufferedReader
BufferedReader <|-- LineNumberReader
Reader <|-- CharArrayReader
Reader <|-- FilterReader
FilterReader <|-- PushbackReader
Reader <|-- InputStreamReader
InputStreamReader <|-- FileReader
Reader <|-- PipedReader
Reader <|-- StringReader
....



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust2_texts/diagramaFlujoDeCaracteres2.adoc ===== -->

[plantuml,FlujoDeCaracteres2,svg]
....

skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

abstract class Flushable 
abstract class Appendeable 
abstract class Closeable 
abstract class Writer

class "Buffered\nWriter" as BufferedWriter
class "CharArray\nWriter" as CharArrayWriter 
class "Filter\nWriter" as FilterWriter 
class "OutputStream\nWriter" as OutputStreamWriter 
class "Piped\nWriter" as PipedWriter 
class "String\nWriter" as StringWriter 
class "Print\nWriter" as PrintWriter
class "File\nWriter" as FileWriter 
Flushable <|.. Writer
Appendeable <|.. Writer
Closeable <|.. Writer
Writer <|-- BufferedWriter
Writer <|-- CharArrayWriter
Writer <|-- FilterWriter
Writer <|-- OutputStreamWriter
OutputStreamWriter <|-- FileWriter
Writer <|-- PipedWriter
Writer <|-- StringWriter
Writer <|-- PrintWriter
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust6_streams/ust3_utilities.adoc ===== -->

#### Otros Flujos

[cols="50,50", options="header"]
|===

2+a| [blue]*Flujos de conversión*

a|
- Las clases _InputStreamReader_ permiten convertir bytes en caracteres
*  Los objetos _InputStreamReader_ reciben en su constructor un objeto _InputStream_ que es capaz de leer bytes

[source,java]
....
public InputStreamReader(InputStream in)
....

* Los métodos read de _InputStreamReader_ leen bytes de su _InputStream_ y los convierten en caracteres

a|
- Las clase _OuputStreamWriter_ permite convertir caracteres en bytes
* Los objetos _OuputStreamWriter_ reciben en su constructor un objeto _OutputStream_ que es capaz de escribir bytes;

[source,java]
....
public OuputStreamWriter(OutputStream out)
....

*  Los métodos write de _OutputStreamReader_ convierten caracteres a bytes y los escriben en su _OutputStream_;

|===

[cols="35,30,30", options="header"]
|===

3+a| [blue]*Flujos de Datos*

a|
- Leer y escribir bytes y caracteres de texto es muy útil, pero a menudo se necesita transmitir [blue]*datos binarios de los tipos primitivos a través de un flujo*
- Los [blue]*interfaces __DataInput_ y _DataOutput__* declaran métodos que permiten leer y escribir datos en formato binario

a| 
[source, java]
....
interface DataInput {
  boolean readBoolean();
  char readChar();
  short readShort();
  int readInt();
  long readLong();
  float readFloat();
  double readDouble();
  String readUTF();
}
....

a| 
[source, java]
....
interface DataOutput {
  writeBoolean(boolean);
  writeChar(char);
  writeShort(short);
  writeInt(int);
  writeLong(long);
  writeFloat(float);
  writeDouble(double);
  writeUTF(String);
}
....

|===

[cols="50,50", options="header"]
|===

2+a| [blue]*Varios flujos*

2+a|
- hay varios tipos de flujos que [blue]*definen comportamientos específicos, tanto en su modalidad de entrada como de salida*:

a|
*  los flujos de [blue]*tipo __Filter__ aplican alguna operación de filtrado cuando leen o escriben datos utilizando otro flujo*
** un objeto _FilterReader_ lee caracteres de otro objeto _Reader_, procesa los caracteres de alguna manera, y devuelve el resultado

[source,java]
....
protected FilterReader(Reader in)
....

a|
* los flujos de [blue]*tipo _Piped_ se diseñan en parejas, de forma que las escrituras que realiza un flujo de salida se pueden leer en otro flujo de entrada*

[source,java]
....
public PipedWriter(PipedReader snk) throws IOException
....

a|
* los flujos de [blue]*tipo __Buffered__ añaden almacenamiento intermedio en forma de __buffers__, de forma que las lecturas y escrituras no requieren acceder al sistema de ficheros en cada invocación*. 
** Los flujos de caracteres de este tipo también proporcionan la [green]*lectura y escritura de líneas de texto*,con retornos de línea

[source,java]
....
public BufferedReader(Reader in)
public BufferedWriter(Writer out)
....

a|
*  los llamados [blue]*flujos en memoria permiten usar estructuras de datos en memoria como fuente o destino de un flujo*:
*  los [blue]*flujos __ByteArray__* usan un vector de byte,
*  los [blue]*flujos __CharArray__* usan un vector de char,
*  los [blue]*flujos __String__* usan objetos de la clase _String_;
*  los [blue]*flujos de tipo __Print__* proporcionan los [green]*métodos _print_ y _println_ que facilitan la escritura de valores de tipos primitivos y objetos en forma de texto legible*
** todos los flujos _Print_ actúan como flujos _Filter_
** link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a5_units/a1_interval/a2_statics/Console.java[[red]*__System.out__ es un flujo __PrintStream__*]

|=== 





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust7_files/ust0_index.adoc ===== -->

### Ficheros

[cols="35,65", options="header"]
|===

a|
a| *[blue]#Ejemplo:#*

a|
* los [blue]*flujos __File (FileInputStream, FileOutputStream, FileReader y FileWriter)__* permiten tratar a un [blue]*fichero como un flujo de entrada o de salida*;
** Para crear un objeto, se usa un [blue]*constructor que recibe como argumento el nombre del fichero*;

a|
[source,java]
....
FileWriter outTxt = new FileWriter("salida.txt");
FileReader inTxt = new FileReader("entrada.txt");
FileOutputStream outDat = new FileOutputStream("salida.dat");
FileInputStream inDat = new FileInputStream("entrada.dat");
....

|=== 

[cols="50,50", options="header"]
|===

2+a| [blue]*Ficheros de texto*

a| - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a1_writeText/App.java[Clase plantilla] para [blue]*escribir en un fichero de texto* se usa la [blue]*clase __PrintWriter__*
a| - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a2_readText/App.java[Clase plantilla] para [blue]*leer de un fichero de texto* se usa la [blue]*clase __BufferedReader__*

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a1_writeText/App.java[]
....

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a2_readText/App.java[]
....

|===

[cols="50,50", options="header"]
|===

2+a| [blue]*Ficheros binarios*

a| - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a3_writeBinary/App.java[Clase plantilla] para [blue]*escribir en un fichero binario* se usa la [blue]*clase __DataOutputStream__*
a| - link:https://github.com/USantaTecla-tech-java/src/blob/main/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a4_readBinary/App.java[Clase plantilla] para [blue]*leer de un fichero binario* se usa la [blue]*clase __DataInputStream__*

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a3_writeBinary/App.java[]
....

a|
[source, java]
....
include::../../../../../../../src/src/main/java/es/usantatecla/a0_itinerario/a5_excepciones/a4_readBinary/App.java[]
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust8_serialize/diagramaPersona3.adoc ===== -->

[plantuml,Persona,svg]
....

skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
class Person {
- name: String
}
class Teacher {
- code: int
}
class Student {
- qualification : float
}

Person <\|-- Teacher
Person <\|-- Student 
Teacher "*"-> "*" Student
....



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust8_serialize/diagramaProfesor.adoc ===== -->

[plantuml.Profesor,svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

class "Ana:Teacher" as AnaProfesor {
# Jose,Juan
}
class "Jesus:Teacher" as JesusProfesor {
# Maria,Juan
}
class "Jose:Student" as JoseAlumno {
# Ana
}
class "Juan:Student" as JuanAlumno {
# Ana,Jesus
}
class "Maria:Student" as MariaAlumno {
# Jesus
}
AnaProfesor <\|-- JoseAlumno
AnaProfesor <\|-- JuanAlumno
JesusProfesor <\|-- JuanAlumno
JesusProfesor <\|-- MariaAlumno
....



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust8_serialize/ust0_index.adoc ===== -->

### Serialización de Objetos

[cols="55,45", options="header"]
|===

2+a| [blue]*Serialización de Objetos*

a|
- resuelve el problema de almacenar en un fichero (o transmitir por una línea de comunicación, etc.) un [red]*conjunto de objetos de distintas clases, posiblemente relacionados entre sí, y posteriormente restaurarlos de nuevo en la memoria de un programa*, de forma que se mantengan el mismo número de objetos, los mismos valores de sus atributos y las mismas relaciones entre ese conjunto de objetos que en la situación original
** resolver este problema mediante ficheros de texto o binarios es complejo:
*** porque los [red]*objetos tienen un tamaño variable* dependiendo de su clase,
*** porque los [red]*datos de los objetos deberían almacenarse una sola vez* en el fichero,
*** porque [red]*no se pueden almacenar y restaurar las referencias, ya que se corresponden con direcciones de memoria*, y al volver a cargar un objeto, éste ocupará una dirección de memoria diferente de la original;

^.^a|
include::diagramaPersona3.adoc[]
include::diagramaProfesor.adoc[]

|===

[cols="50,50", options="header"]
|===

2+a| [blue]*Flujos de Objetos*

2+a|
* la solución consiste en guardar en el fichero cada objeto con un “número de serie” único;
** Java proporciona los flujos de bytes _ObjectOutputStream_ y _ObjectInputStream_ para resolver automáticamente el problema de la serialización de objetos;

a|
* al almacenar un objeto en el fichero:
** se asocia un número de serie a cada referencia,
** al encontrar por primera vez una referencia, se almacenan los datos del objeto en el fichero y su número de serie,
** las siguientes veces que se encuentre esa referencia, escribir sólo el número de serie;

a|
* al restaurar un objeto del fichero:
** al restaurar por primera vez un objeto, se crea, se inicializa con sus datos, y se recuerda la asociación entre la nueva referencia y su número de serie,
** al encontrar sólo su número de serie, recuperar la referencia de ese número de serie;

a|
* para almacenar *(serializar)* los objetos se usa la clase _ObjectOutputStream_, que implementa el interfaz ObjectOutput que, a su vez, extiende el interfaz _DataOutput_, con lo que, además de poder escribir cualquier dato en formato binario, añade entre otros los siguientes métodos:
* que permiten serializar objetos en un flujo de bytes; 

a|
* para restaurar *(deserializar)* los objetos se usa la clase _ObjectInputStream_, que implementa el interfaz _ObjectInput_ que, a
su vez, extiende el interfaz _DataInput_, con lo que, además de poder leer cualquier dato en formato binario, añade entre otros los siguientes métodos:

* que permiten deserializar objetos desde un flujo de bytes;

a|
[source,java]
....
public ObjectOutputStream(OutputStream out) throws IOException
public final void writeObject(Object obj) throws IOException
public void defaultWriteObject() throws IOException
....

a|
[source,java]
....
public ObjectInputStream(InputStream in) throws IOException
public final Object readObject() throws IOException, ClassNotFoundException
public void defaultReadObject() throws IOException, ClassNotFoundException
....

2+a|
* el único requisito que se necesita para poder almacenar y restaurar objetos en los flujos de objetos es que las clases de esos objetos deben implementar el interfaz _java.io.Serializable_:
* el interfaz _Serializable_ no tiene ningún método, por lo que, en principio, no hay que modificar nada más en las clases de los objetos a serializar;
* el mecanismo de serialización por defecto de Java se encarga de almacenar y restaurar automáticamente todos los atributos de los objetos, excepto los atributos _static_; que nunca se serializan ni se deserializan;

[source,java]
....
class Clase implements Serializable { … }
....

|===

include::ust1_default.adoc[]
include::ust2_custom.adoc[]





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust8_serialize/ust1_default.adoc ===== -->

##### Serilización por defecto

[cols="50,50"]
|===

a|
* en la serialización por defecto, todos los atributos que sean tipos primitivos o cadenas de texto se escriben con el formato usado en _DataOutputStream_;

* en la serialización por defecto, todos los campos que sean referencias a objetos deben ser, a su vez, serializables;

* si durante el proceso de serialización o deserialización se intenta almacenar o restaurar algún objeto no serializable, se eleva una excepción de la clase _NotSerializableException_;

* si durante la deserialización no se encuentra la clase de un objeto o no se puede cargar por otra razón, se eleva una excepción _ClassNotFoundException_;

* si una clase serializable es una subclase de otra clase no serializable, entonces los atributos de la superclase no son serializados;
 
* además, la superclase no serializable debe tener un constructor sin argumentos que sea accesible desde la subclase, para que la deserialización por defecto pueda inicializar los atributos de las superclase, en caso contrario se produce una excepción _InvalidClassException_;

a|
[source,java]
....
import java.io.Serializable;
abstract class Persona implements Serializable {
      …
}
class Escuela {
  private void guardar() {
    ObjectOutputStream out = null;
    try {
        out = new ObjectOutputStream (new FileOutputStream("fichero.dat"));
        out.writeInt(numPersonas);
        for (int i = 0; i < numPersonas; i++) {
            out.writeObject(personas[i]);
               }
         } catch (IOException ex) {
            System.out.println("IOException al escribir: " +
                        ex.getMessage());
         } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                  System.out.println("IOException al cerrar: " +
                              ex.getMessage());
                }
            }
    }
}
private void restaurar() {
  personas = new Persona[100];
  numPersonas = 0;
  ObjectInputStream in = null;
  try {
    in = new ObjectInputStream (new FileInputStream("fichero.dat"));
    int total = in.readInt();
    for (int i = 0; i < total; i++) {
        personas[numPersonas] = (Persona) in.readObject();
        numPersonas++;
    }
  } catch (IOException ex) {
    System.out.println("IOException al leer: " +
            ex.getMessage());
  } catch (ClassNotFoundException ex) {
    System.out.println("ClassNotFoundException al leer: " +
            ex.getMessage());
  } finally {
    if (in != null) {
        try {
            in.close();
        } catch (IOException ex) {
            System.out.println("IOException al cerrar: " +
                ex.getMessage());
        }
    }
  }
}
....

a|
* otra solución más sencilla es escribir y leer directamente el vector en el fichero, en lugar de hacerlo elemento a elemento:

a|
[source,java]
....
class Escuela {
     private void guardar() {
         ObjectOutputStream out = null;
         try {
            out = new ObjectOutputStream (new
FileOutputStream("fichero.dat"));
            out.writeInt(numPersonas);
            out.writeObject(personas);
         } catch (IOException ex) {
             System.out.println("IOException al escribir: " +
                     ex.getMessage());
         } finally {
            if (out != null) {
                try {
                     out.close();
                } catch (IOException ex) {
                    System.out.println("IOException al cerrar: " +
                        ex.getMessage());
                }
         }
      }
}
private void restaurar() {
    numPersonas = 0;
    ObjectInputStream in = null;
    try {
        in = new ObjectInputStream (new FileInputStream("fichero.dat"));
        int total = in.readInt();
        personas = (Persona[]) in.readObject();
        numPersonas = total;
    } catch (IOException ex) {
        System.out.println("IOException al leer: " + 
    ex.getMessage());
    } catch (ClassNotFoundException ex) {
        System.out.println("ClassNotFoundException al leer: " +
              ex.getMessage());
    } finally {
        if (in != null) {
            try {
                 in.close();
            } catch (IOException ex) {
                System.out.println("IOException al cerrar: " +
                     ex.getMessage());
            }
        }
    }
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust7_exceptions/ust8_serialize/ust2_custom.adoc ===== -->

##### Serialización personalizadas

[cols="40,60", options="header"]
|===

a|
a| *[blue]#Ejemplos#*

a|
* en ciertas ocasiones es necesario personalizar el mecanismo de serialización por defecto de Java; por ejemplo:

* ciertos atributos de los objetos de la clase no deben serializarse porque contienen información redundante o que no tiene sentido después del proceso (por ejemplo, enlaces de listas, referencias de ficheros abiertos, ventanas, etc.);

* ciertos atributos de los objetos de la clase no implementan el interfaz _Serializable_, por lo que no deben serializarse mediante el mecanismo por defecto, sino que deben ser esos objetos los que deben responsabilizar almacenar y restaurar sus atributos;

* una clase es una subclase de otra clase no serializable, y también se debe responsabilizar de almacenar y restaurar sus atributos heredados;

* para indicar que algún atributo de una clase no debe ser serializado por el mecanismo por defecto, se añade a la declaración del atributo el modificador transient;

a|
[source,java]
....
import pooa.util.Lista; // NO SERIALIZABLE
class AlumnoDinamico extends Persona {
      private transient Lista profesores = new Lista(); // NO
SERIALIZABLE
      private int numProfesores = 0;
      …
}
....

a|
* cuando no se desea usar el mecanismo de serialización por defecto para una clase, se deben definir los siguientes métodos, respetando exactamente sus cabeceras:

a|
[source,java]
....
private void readObject(ObjectInputStream in)
  throws IOException, ClassNotFoundException
private void writeObject(ObjectOutputStream out)
  throws IOException
....

a|
* en cuyo caso, los objetos de la clase no se serializan ni deserializan por el mecanismo por defecto, sino que:

** en la serialización se invoca al método _writeObject_ para que el objeto haga el proceso de la manera oportuna;

** en la deserialización, sólo se crea el objeto de la clase, y se invoca el método _readObject_ para que el objeto haga el proceso;

a|
[source,java]
....
import pooa.util.Lista; // NO SERIALIZABLE
class AlumnoDinamico extends Persona {
      private float nota = 0.1f;
      private transient Lista profesores = new Lista(); // NO
SERIALIZABLE
      …
      private void writeObject(ObjectOutputStream out)
              throws IOException {
         out.defaultWriteObject();
         out.writeInt(profesores.size());
         Iterador iterador = profesores.iterador();
         while (iterador.hasNext()) {
            Profesor profesor = (Profesor) iterador.next();
            out.writeObject(profesor);
         }
     }
private void readObject(ObjectInputStream in)
         throws IOException, ClassNotFoundException {
     in.defaultReadObject();
     profesores = new Lista();
     int numProfesores = in.readInt();
     for (int i = 0; i < numProfesores; i++) {
         Profesor profesor = (Profesor) in.readObject();
         profesores.add(profesor);
     }
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/diagramaObjetos.adoc ===== -->

[plantuml,FlujoDeCaracteres.svg]
....

skinparam backgroundColor #222222
skinparam handwritten true
hide circle
hide stereotype
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey
}

abstract class Readable 
abstract class Closeable 
abstract class Reader 

class "Buffered\nReader" as BufferedReader 
class "CharArray\nReader" as CharArrayReader
class "Filter\nReader" as FilterReader 
class "InputStream\nReader" as InputStreamReader
class "Piped\nReader" as PipedReader
class "String\nReader" as StringReader
class "LineNumber\nReader" as LineNumberReader 
class "Pushback\nReader" as PushbackReader 
class "File\nReader" as FileReader 
Readable <|.. Reader
Closeable <|.. Reader
Reader <|-- BufferedReader
BufferedReader <|-- LineNumberReader
Reader <|-- CharArrayReader
Reader <|-- FilterReader
FilterReader <|-- PushbackReader
Reader <|-- InputStreamReader
InputStreamReader <|-- FileReader
Reader <|-- PipedReader
Reader <|-- StringReader
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust0_index.adoc ===== -->

## Programación Parametrizada

[cols="50,50", options="header"]
|===

a|
a| [blue]*Genericos*

a| 
- Se desea definir [green]*clases cuyos atributos puedan ser de cualquier clase, y para definir métodos que puedan recibir argumentos y devolver resultados de cualquier clase*.
* Una posible solución sería [red]*declarando los atributos de estas clases y los argumentos de estos métodos con el tipo más débil posible*, por ejemplo, [blue]*_Object_*.
** Con esta solución es [red]*necesario convertir la dirección devuelta por el método __remove__(), que es de la clase __Object__, a una dirección de la clase concreta mediante el operador de conversión de tipos (__cast__)*.
** Al sacar un elemento existe la [red]*posibilidad de que se produzca un error de conversión de tipos en tiempo de ejecución* al sacar los elementos, que no es detectado en tiempo de compilación, si los objetos que [red]*se meten en la pila son de distinta clase de la que se espera que sean al sacarlos*.

a|
- Estos problemas se pueden resolver mediante la [green]*declaración de una clase parametrizada, que permita declarar la clase de los elementos de la pila como un parámetro de tipo*.
* A partir de la JDK 1.5 se pueden declarar clases, interfaces y métodos parametrizados, mediante los [blue]*_parámetros de tipo_*, también llamados [blue]__variables de tipo__.
* Las clases parametrizadas se denominan [blue]*clases genéricas*; y los métodos parametrizados se denominan [blue]*métodos genéricos*.
* Tienen las siguientes [green]*ventajas*:
** proporcionan una [green]*comprobación estricta de tipos en tiempo de compilación*;
** su uso [green]*no necesita comprobación de tipos en tiempo de ejecución*;
** producen código más [green]*robusto* y, en consecuencia, aumentan la facilidad del [green]*mantenimiento de los programas*.

|===

[cols="57,43", options="header"]
|===

2+a|
- Dispensers : link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a7_modular[_fractions_] - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a8_parametrized/a1_object[objects]

a|
[source, java]
....
...
9: 1
10: 0
Exception in thread "main" java.lang.ClassCastException: class es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Fraction cannot be cast to class java.lang.Integer (es.usantatecla.aX_dispensers.a8_parametrized.a1_object.utils.Fraction is in unnamed module of loader 'app'; java.lang.Integer is in module java.base of loader 'bootstrap')
        at es.usantatecla.aX_dispensers.a8_parametrized.a1_object.App.main(App.java:49)
....

a|
[source, java]
....
  try {
    BoundedQueue boundedQueue = new BoundedQueue(1);
    //boundedQueue.add(2);
    boundedQueue.add(new Fraction(1, 2));
    int element = (int) boundedQueue.remove();
    Console.getInstance().writeln(element);
 } catch (DispenserException e) {
    e.printStackTrace();
  }
....

|===

include::ust1_generic_classes.adoc[]
include::ust2_limited_parameters.adoc[]
include::ust3_wildcard_parameters.adoc[]
include::ust4_generic_methods.adoc[]

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - TicTacToe - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_ticTacToe/a9_generics[generics] 

a| 

a|

|===

include::ust5_collections/ust0_index.adoc[]



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust1_generic_classes.adoc ===== -->

### Clases Genéricas

[cols="50,50", options="header"]
|===

a| [blue]*Sintaxis*
a| [blue]_Ejemplo_

a|
[source,java]
....
class <ClaseGenerica><<ParametroTipo1>, ...,<ParametroTipo2>> {

  private ParametroTipo1 atributo;

  public ParametroTipo1 metodo(ParametroTipo2 parameter) {
    ...
  }
 ...
}
...
private <ClaseGenerica><<Tipo1/Clasificador1>, ...,<Tipo2/Clasificador2>> objeto 
  = new <ClaseGenerica><<Tipo1/Clasificador1>, ...,<Tipo2/Clasificador2>>(...)
....

a|
- donde los [blue]*identificadores encerrados entre < y > son los parámetros de tipo*.
* [blue]*pueden usarse dentro de la clase parametrizada para declarar el tipo de sus atributos, argumentos de sus métodos, o objetos locales de sus métodos*.
* [blue]*se especifican posteriormente con un tipo concreto (actual) en la instanciación de un objeto de la clase parametrizada o al declarar una clase hija de la clase parametrizada*, lo que produce la [blue]*encarnación* de la clase parametrizada, que se convierte en una clase concreta, proceso que se realiza en [green]*tiempo de compilación*.
- Dispensers : link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a8_parametrized/a1_object[_objects_] - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a8_parametrized/a2_generic[generics]
- Map : link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_dispensers/a8_parametrized/a4_map[iterator]

|===

[cols="50,50"]
|===

a|
- Con esta solución [blue]*NO es necesario convertir la dirección devuelta por el método __remove()__ a una dirección de la clase concreta mediante el operador de conversión de tipos (__cast__)*
* Al sacar un elemento [green]*NO existe la posibilidad de que se produzca un error de conversión de tipos en tiempo de ejecución al sacar los elementos, porque el error es detectado en tiempo de compilación, si se trata de meter elementos que no son de la clase adecuada*.

a|
[source,java]
....
  try {
    BoundedQueue<Integer> boundedQueue = new BoundedQueue<Integer>(1);
    boundedQueue.add(2);
    // boundedQueue.add(new Fraction(1, 2)); No compila!!!
    int element = boundedQueue.remove();
    Console.getInstance().writeln(element);
  } catch (DispenserException e) {
    e.printStackTrace();
  }
....
   
|===

[cols="18,82"]
|===

2+a|
- Por [red]*razones de compatibilidad con códigos anteriores a la JDK 1.5*, está [green]*permitido el uso de las clases parametrizadas sin especificar sus parámetros*, aunque el compilador genera un aviso

a|
- estas clases se denominan [blue]*tipos crudos* ([blue]_raw types_):
* Se [green]*puede asignar una referencia de una clase parametrizada a un tipo crudo, y viceversa*.
* Una utilidad de los tipos crudos es [green]*poder crear vectores de objetos de clases parametrizadas*, lo cual Java [red]*no permite en la actualidad*;

a|
[source,java]
....
  BoundedQueue<Double> b0 = new BoundedQueue<Double>(10);
  b0.add(0.0);
  //b0.add(0); // Error!!!
  //b0.add(new Fraction(0,2)); // Error!!!
  Console.getInstance().writeln(""+b0.remove());

  BoundedQueue<Double> b1 = new BoundedQueue(10);
  b1.add(1.1);
  //b1.add(1); // Error!!!
  //b1.add(new Fraction(1,2)); // Error!!!
  Console.getInstance().writeln(""+b1.remove());

  BoundedQueue b2 = new BoundedQueue<Double>(10);
  b2.add(2.2);
  //b2.add(2); // Warning!!! y Error!!!
  //b2.add(new Fraction(2,2)); // Warning!!! y Error!!!
  Console.getInstance().writeln(""+b2.remove());

  BoundedQueue b3 = new BoundedQueue(10); // Integer!!!
  //b3.add(3.3); // Warning!!! y Error!!!
  b3.add(3);
  //b3.add(new Fraction(3,2)); // Warning!!! y Error!!!
  Console.getInstance().writeln(""+b3.remove());

  //BoundedQueue<Integer>[] a0 = new BoundedQueue<Integer>[3]; // Error!!!
  BoundedQueue<Integer>[] a0 = new BoundedQueue[3];
  for(BoundedQueue<Integer> boundedQueue : a0){
    boundedQueue = new BoundedQueue<>(5);
  }
....

|===


#### Clases genéricas y herencia 

[cols="34,66", options="header"]
|===

a|
a| [blue]#Ejemplo#

a| * [blue]*Una clase genérica puede heredar de otra clase genérica*
a|
[source,java]
....
public class BoundedStack<E> extends BoundedDispenser<E>
....

a| * [blue]*Una clase genérica puede heredar de una clase no genérica*
a|
[source,java]
....
public class BoundedStack<E> implements Serializable
....
 
 a| * [blue]*Una clase no genérica puede heredar de una clase genérica*
a|
[source,java]
....
public class IntBoundedStack extends BoundedStack<Integer>
public final class Integer extends Number implements Comparable<Integer>
....

|===

#### Limitaciones de las clases genéricas

[cols="30,70", options="header"]
|===

a|
a| [blue]#Ejemplo#

a|
* [red]*No se pueden encarnar clases genéricas con tipos primitivos*

a|
[source,java]
....
BoundedStack<int> intBoundedStack; // ERROR
....

a|
* [red]*No se pueden crear clases parametrizadas de excepciones*

a|
[source,java]
....
public class XException<E> extends Exception { ... } // ERROR
....

a|
* [red]*No pueden aparecer genéricos en las cláusulas __catch__*

a|
[source,java]
....
try { ... } catch (E e) { ... } // ERROR
....

a|
* [red]*No se pueden crear vectores de objetos de clases genéricas*

a|
[source,java]
....
public class BoundedStack<E> {

   protected E[] elements;
   ...
   public BoundedStack(int size) {
       this.elements = new E[size]; // ERROR
       this.elements = (E[]) new Object[size]; // AVISO
   ...
   }
}

PilaAcotada<Integer>[] pilas = new PilaAcotada<Integer>[10];        // ERROR
PilaAcotada<Integer>[] pilas = new PilaAcotada[10];                // AVISO 
....

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust2_limited_parameters.adoc ===== -->

### Parámetros Limitados

[cols="75,25", options="header"]
|===

a| [blue]*Sintaxis:* 
a| [blue]_Ejemplo_

a|
- En la declaración de un [blue]*parámetro de tipo de una clase parametrizada se puede especificar una restricción que debe cumplir ese tipo*; estos parámetros de tipo se conocen como [blue]*parámetros de tipo limitados (__bounded__)*.

[source, java]
....
class <clase><<parámetro> extends <tipoBase>,…> {
  ...
}
....

* donde se especifica que el [blue]*parámetro de tipo que se declara <parámetro> debe ser el tipo <tipoBase> o cualquier tipo derivado de él*;
** el [blue]*tipo base puede ser una clase o un interfaz*;
** se [blue]*pueden especificar más interfaces separándolos por __&__*;
** el [blue]*tipo base puede estar, a su vez, parametrizado*.

a|
* por ejemplo, la clase Interval puede parametrizarse, pero con la restricción de que sus elementos sean link:https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html[comparables]: link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/a5_units/a1_interval/a7_parametrized[bounded]

[source, java]
....
interface Comparable<T> {
   int comparteTo(T o);
}
....


|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust3_wildcard_parameters.adoc ===== -->

### Parámetros Comodines

[cols="40,60"]
|===

a|
* link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_listas/a5_parametrized[Código] con [red]#error de compilación porque la clase __List<Double>__ no es una subclase de __List<Number>__ aunque __Double__ sea una subclase de __Number__#

a|
[source, java]
....
  List<Double> doubleList = new List<Double>();
  List<Number> numberList = doubleList; // !!!ERROR
  numberList.add(Integer.valueOf(3));
  Double value = doubleList.get(0);
....

2+^.^a|
La razón es que si fuera así, entonces las siguientes sentencias, harían que [red]*pudiéramos copiar una referencia a un entero en una referencia a un doble, lo cual es incorrecto*

|===

[cols="40,60"]
|===

a|
- Los [blue]*parámetros de tipos comodines (__wildcards__) son parámetros sin nombre que pueden usarse para declarar tipos parametrizados de los atributos, argumentos, objetos locales y valores devueltos de métodos de cualquier clase, parametrizada o no*; y que representan únicamente que se trata de un [blue]*tipo cualquiera desconocido*

a|
- se representan mediante el [blue]*símbolo __?__*
- al ser [blue]*anónimos no pueden usarse para referirse a él* en el interior de la clase o método donde se declaran;
- [blue]*pueden limitarse como cualquier otro* parámetro de tipo;
- su principal utilidad consiste en que [blue]*relajan el sistema de tipos de Java de forma que resulta más fácil asignar instancias de tipos genéricos*.

|===

[cols="35,65"]
|===

a|
* El link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_listas/a5_parametrized2[error de compilación no se produce] porque el uso del [blue]*parámetro comodín relaja el sistema de tipos*, de manera que las siguientes sentencias son correctas:
* Sin embargo, usar el parámetro comodín [red]#impone que con la referencia no se puedan usar métodos de la clase parametrizada que pudieran producir una incompatibilidad de tipos#
* pero sí se [green]#pueden usar métodos que no puedan producir incompatibilidad de tipos#

a|
[source,java]
....
  List<Double> doubleList = new List<Double>();
  // List<Number> numberList = doubleList; // !!!ERROR
  //numberList.add(Integer.valueOf(3));
  Double value = doubleList.get(0);

  // Se podria omitir extends Number
  List<? extends Number> numberList = doubleList; 
  //numberList.add(new Double(3)); // !!!ERROR
  //Number numero = new Double(3);
  //numberList.add(numero); // !!!ERROR
  //Double x1 = numberList.get(0); // !!!ERROR

  Number number = numberList.get(0);
  String string = numberList.toString();
  numberList.clear(); 
  string = numberList.toString();
....

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust4_generic_methods.adoc ===== -->

### Métodos Genéricos

[cols="50,50"]
|===

a|
- Los métodos también se pueden parametrizar, tanto si están en una clase parametrizada como si no lo están.
* Para parametrizar un método se declaran los parámetros de tipo antes de la declaración del tipo del valor devuelto por el método.

[source,java]
....
<acceso> <<parámetro1>,…,<parámetroN>>
<tipoDevuelto> <nombreMétodo>(<argumentos>) {
 ...
}
....

a|
* Los [blue]*parámetros de tipo pueden usarse dentro del método parametrizado para declarar el tipo del valor devuelto por el método, de sus argumentos y de sus objetos locales*.
* Estos [blue]*parámetros de tipo (formales) se especifican posteriormente con un tipo concreto (actual) al invocar el método parametrizado*, lo que produce la encarnación del método.
* _Ejemplo_: link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/aX_listas/a5_parametrized3[greaters]

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/diagramaCollection.adoc ===== -->

[plantuml,Collection,svg]
....
interface Collection <<E>> #gray/white
interface List <<E>>  #gray/white
interface Queue <<E>> #gray/white
interface Set <<E>> #gray/white
interface Deque <<E>> #gray/white
interface "SortedSet" as SortedSet <<E>> #gray/white
interface "NavigableSet" as NavigableSet <<E>> #gray/white


Collection <\|-down-List
Collection <\|-- Queue
Collection <\|-- Set
Queue <\|-- Deque
Set <\|-- SortedSet
SortedSet <\|-- NavigableSet
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/diagramaCollection2.adoc ===== -->

[plantuml,Collection2,svg]
....
interface Collection <<E>> #gray/white
class "Abstract Collection" as AbstractCollection <<E>> #bisque/white
interface List <<E>> #gray/white
interface Queue <<E>> #gray/white
interface Set <<E>> #gray/white
class "AbstractList" as AbstractLIst <<E>> #bisque/white
class "AbstractQueue" as AbstractQueue <<E>> #bisque/white
class "AbstractSet"  as AbstractSet <<E>> #bisque/white
class "AbstractSequential List" as AbstractSequentialLIst <<E>> #bisque/white
interface Deque <<E>> #gray/white
interface "NavigableSet" as NavigableSet <<E>> #gray/white
class "ArrayList" as ArrayList <<E>> #gold/white
class Vector <<E>> #gold/white
class "LinkedList" as LinkedList <<E>> #gold/white
class "ArrayDeque" as ArrayDeque <<E>> #gold/white
class "PriorityDueue" as PriorityDueue <<E>> #gold/white
class "EnumSet" as EnumSet <<E>> #gold/white
class "HashSet" as HashSet <<E>> #gold/white
class "TreeSet" as TreeSet <<E>> #gold/white
class Stack <<E>> #gold/white
class "LinkedHashSet" as LinkedHashSet <<E>> #gold/white

Collection <\|..AbstractCollection
AbstractCollection <\|-- AbstractLIst
List <\|-- AbstractLIst
AbstractCollection <\|-- AbstractQueue
Queue <\|-- AbstractQueue
AbstractCollection <\|-- AbstractSet
Set  <\|-- AbstractSet
AbstractLIst  <\|-- ArrayList
AbstractLIst  <\|-- Vector
AbstractLIst  <\|-- AbstractSequentialLIst
AbstractSequentialLIst  <\|-- LinkedList
AbstractQueue  <\|-- PriorityDueue
AbstractSet  <\|-- EnumSet
AbstractSet  <\|-- HashSet
AbstractSet  <\|-- TreeSet
NavigableSet  <\|-- TreeSet
HashSet  <\|-- LinkedHashSet
Deque  <\|.. LinkedList
Deque  <\|.. ArrayDeque
Vector  <\|-- Stack
....





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/diagramaIterator.adoc ===== -->

[plantuml, Iterator, svg]
....
interface Iterator <<E>> #gray/white
interface "ListIterator"  as ListIterator <<E>>  #gray/white
Iterator <\|-down-ListIterator
....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/diagramaMap.adoc ===== -->

[plantuml,Map,svg]
....
interface Map <<K>> <<V>> #gray/white
interface "SortedMap"  as SortedMap <<K>><<V>> #gray/white
interface "NavigableMap" as NavigableMap <<K>> <<V>> #gray/white

Map <\|-- SortedMap
SortedMap <\|-- NavigableMap
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/diagramaMap2.adoc ===== -->

[plantuml,Map2,svg]
....
interface Map <<K>> <<V>> #grey/white
interface "NavigableMap" as NavigableMap <<K>> <<V>> #grey/white
class "AbstractMap" as AbstractMap <<K>> <<V>> #bisque/white
class "TreeMap" as TreeMap <<K>> <<V>> #gold/white
class "EnumMap" as EnumMap <<K>> <<V>> #gold/white
class "HashMap" as HashMap <<K>> <<V>>#gold/white 
class "WeakHash Map" as WeakHashMap <<K>> <<V>> #gold/white
class "IdentityHashMap" as IdentityHashMap <<K>> <<V>> #gold/white
class "LinkedHash Map" as LinkedHashMap <<K>> <<V>> #gold/white

Map <\|.. AbstractMap
NavigableMap <\|.. TreeMap
AbstractMap <\|-- TreeMap
AbstractMap <\|-- EnumMap
AbstractMap <\|-- HashMap
AbstractMap <\|-- WeakHashMap
AbstractMap <\|-- IdentityHashMap
HashMap <\|-- LinkedHashMap
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/ust0_index.adoc ===== -->

### Colecciones 

[cols="2"]
|===

2+a|
Java proporciona en el paquete _java.util_ un conjunto de clases para representar y manejar estructuras de datos.

a|
* Antes de la aparición de la plataforma Java 2, sólo se disponía de un conjunto muy limitado de clases para las estructuras de datos más comunes: _Vector, Stack, Hashtable,_ y el interfaz _Enumeration_ para recorrer los elementos de estas clases.

* Java 2 incorpora un  _framework_ más completo inspirado en la librería STL de C++, pero manteniendo compatibles las clases heredadas de las versiones anteriores.

a|
* Esta biblioteca de clases separa los interfaces de sus implementaciones, lo que proporciona mayor abstracción al usar la biblioteca, y facilita la extensibilidad de la misma.

* A partir de la JDK 1.5 las clases de la biblioteca son clases parametrizadas.

|===

[cols="30,40,30"]
|===

a|
include::diagramaIterator.adoc[]

a|
include::diagramaCollection.adoc[]


a|
include::diagramaMap.adoc[]

|===

[cols="100%"]
|===

a|

a|
include::diagramaCollection2.adoc[]

a|

a|
include::diagramaMap2.adoc[]

|===

[cols="50,50"]
|===

a|
- *[underline]#Interfaz Collection<E>:#* Es la raíz de la jerarquía de las clases de colecciones, y proporciona los métodos comunes a todas ellas:

a|
[source,java]
....
int size()
boolean isEmpty()
boolean contains(Object o)
boolean containsAll(Collection<?> c)
Iterator<E> iterator()
Object[] toArray()
<T> T[] toArray(T[] a)
boolean add(E e)
boolean remove(Object o)
boolean addAll(Collection<? extends E> c)
boolean removeAll(Collection<?> c)
boolean retainAll(Collection<?> c)
void clear()
boolean equals(Object o)
int hashCode()
....

a|
- *[underline]#Interfaz Iterator<E>:#* Permite recorrer los elementos de las clases de colecciones:

* donde el método _remove_() debe llamarse sólo después de _next_(), y elimina de la colección el último elemento devuelto por éste;

* no debe modificarse una colección mientras un iterador la recorre de ninguna otra manera que invocando _remove_() sobre ese iterador, porque, en otro caso, el comportamiento del iterador no está definido (la implementación actual produce una excepción _ConcurrentModificationException_);

a|
[source,java]
....
boolean hasNext()
E next()
void remove()
....

|===

include::ust1_lists.adoc[]
include::ust2_queues.adoc[]
include::ust3_sets.adoc[]
include::ust4_maps.adoc[]

[cols="33,33,33", options="header"]
|===

3+a| [green]*Aplicaciones*

a| - MultiMap - link:https://github.com/USantaTecla-tech-java/src/tree/main/src/main/java/es/usantatecla/a0_itinerario/a7_parametrized/a1_multimap[v0] 

a| 

a|

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/ust1_lists.adoc ===== -->

#### Listas

[cols="50,50"]
|===

a|
- *Interfaz List<E>:* Representa una secuencia de elementos que ocupan una cierta posición en la colección, en la que puede haber elementos repetidos.

a|
[source,java]
....
E get(int index)
E set(int index, E element)
void add(int index, E element)
E remove(int index)
int indexOf(Object o)
int lastIndexOf(Object o)
ListIterator<E> listIterator()
ListIterator<E> listIterator(int index)
List<E> subList(int fromIndex, int toIndex)
boolean addAll(int index, Collection<? extends E> c)
....

a|
- *Interfaz ListIterator<E>:* Recorre los elementos de una lista:

a|
[source,java]
....
boolean hasPrevious()
E previous()
int nextIndex()
int previousIndex()
void add(E e)
void set(E e)
....

|===


* donde el método _remove()_ debe llamarse sólo después de _next()_ o _previous()_, y elimina de la colección el último elemento devuelto por éstos;

* donde _add()_ inserta justo antes del elemento que se obtendría con _next()_ y justo después del elemento que se obtendría con _previous()_;

* _set()_ reemplaza el último elemento devuelto por _next_() o _previous()_, y sólo puede invocarse si después de estas operaciones no se ha invocado _add()_ o _set()_;

- Las clases que implementan el interfaz List<E> son:

[cols="50,50"]
|===

a|
- *Clase ArrayList<E>:* que proporciona una implementación basada en vectores de elementos que autoajustan su tamaño según se añaden elementos;

a|
[source,java]
....
public ArrayList()
public ArrayList(int initialCapacity)
public ArrayList(Collection<? extends E> c)
public void trimToSize()
public void ensureCapacity(int minCapacity)
....

a|
- *Clase LinkedList<E>:* que utiliza listas doblemente enlazadas; además implementa el *interfaz Deque<E>*, por lo que puede usarse para tratar con colas (se verá más adelante);

a|
[source,java]
....
public LinkedList()
public LinkedList(Collection<? extends E> c)
....

a|
- *Clase Vector<E>:* también usa vectores autoajustables, y se mantiene por razones de compatibilidad con código heredado; además está sincronizada para evitar accesos concurrentes, lo que conlleva un cierto sobrecoste adicional;

a|
[source,java]
....
public Vector()
public Vector(int initialCapacity)
public Vector(int initialCapacity, int capacityIncrement)
public Vector(Collection<? extends E> c)
public void copyInto(Object[] anArray)
public void trimToSize()
public void ensureCapacity(int minCapacity)
public void setSize(int newSize)
public int capacity()
public Enumeration<E> elements()
public int indexOf(Object o, int index)
public int lastIndexOf(Object o, int index)
public E elementAt(int index)
public E firstElement()
public E lastElement()
public void setElementAt(E obj, int index)
public void removeElementAt(int index)
public void insertElementAt(E obj, int index)
public void addElement(E obj)
public boolean removeElement(Object obj)
public void removeAllElements()
....

a|
- *Stack<E>:* Representa una pila LIFO.

a|
[source,java]
....
public Stack()
public E push(E item)
public E pop()
public E peek()
public boolean empty()
public int search(Object o)
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/ust2_queues.adoc ===== -->

#### Colas

[cols="50,50"]
|===

a|
- *Interfaz Queue<E>:* Las colas ordenan sus elementos según un orden determinado (normalmente FIFO, aunque no necesariamente):

a|
[source,java]
....
boolean offer(E e)
E remove()
E poll()
E element()
E peek()
....

|===


[cols="30,35,35", options="header"]
|===

a|
a|*Excepción* 
a| *No excepción*

a|*Inserción*
a| _add()_
a| _offer()_

a|*Extracción*
a|_remove()_
a|_poll()_

a|*Consulta*
a|_element()_
a|_peek()_

|===


* La única clase que implementa el *_interfaz Queue<E>_* es:

[cols="45,55"]
|===

a|
- *Clase PriorityQueue<E>:* proporciona una implementación basada en prioridades que se establecen por el orden natural de sus elementos (según el interfaz _Comparable_) o por un comparador de elementos que se suministra a la cola en su construcción. Todas las claves deben implementar el interfaz _Comparable_ (o ser aceptadas por su _Comparator_).

a|
[source,java]
....
public PriorityQueue()
public PriorityQueue(int initialCapacity)
public PriorityQueue(int initialCapacity,
Comparator<? super E> comparator)
public PriorityQueue(Collection<? extends E> c)
public PriorityQueue(PriorityQueue<? extends E> c)
public PriorityQueue(SortedSet<? extends E> c)
....

a|
- *Interfaz Deque<E>:* Son colas que permiten la inserción y extracción de elementos en ambos extremos (_double ended queue_).

a|
[source,java]
....
void addFirst(E e)
void addLast(E e)
boolean offerFirst(E e)
boolean offerLast(E e)
E removeFirst()
E removeLast()
E pollFirst()
E pollLast()
E getFirst()
E getLast()
E peekFirst()
E peekLast()
boolean removeFirstOccurrence(Object o)
boolean removeLastOccurrence(Object o)
void push(E e)
E pop()
Iterator<E> descendingIterator()
....

|===



* Las clases que implementan el *interfaz Deque<E>* son:

[cols="40,60"]
|===

a|
- *Clase LinkedList<E>:* Implementación mediante listas doblemente enlazadas.

a|
[source,java]
....
public LinkedList()
public LinkedList(Collection<? extends E> c)
....

a|
- *Clase ArrayDeque<E>:* Implementación mediante vectores autoajustables.

a|
[source,java]
....
public ArrayDeque()
public ArrayDeque(Collection<? extends E> c)
....

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/ust3_sets.adoc ===== -->

#### Conjuntos

- Representa una colección de elementos no repetidos. No añade ningún método nuevo a _Collection<E>_, sólo estipula ciertas restricciones en sus métodos;

- Las clases que implementan este interfaz son:

[cols="50,50",]
|===

a|
* *Clase EnumSet<E extends Enum<E>>:* Los elementos del conjunto deben ser valores de enumerados. Proporcionan una representación muy compacta y eficiente. Los elementos se recorren según su orden natural. La clase es abstracta y sólo tiene métodos genéricos estáticos para crear los conjuntos.

a|
[source,java]
....
public static <E extends Enum<E>> EnumSet<E>
noneOf(Class<E> elementType)
public static <E extends Enum<E>> EnumSet<E>
allOf(Class<E> elementType)
public static <E extends Enum<E>> EnumSet<E> copyOf(EnumSet<E> s)
public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c)
public static <E extends Enum<E>> EnumSet<E>
    complementOf(EnumSet<E> s)
public static <E extends Enum<E>> EnumSet<E> of(E e)
public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2)
public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3)
public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4)
public static <E extends Enum<E>> EnumSet<E> of(E e1, E e2, E e3, E e4, E e5)
public static <E extends Enum<E>> EnumSet<E> of(E first, E... rest)
public static <E extends Enum<E>> EnumSet<E> range(E from, E to)
public EnumSet<E> clone()
....

a|
* *Clase HashSet<E>:* Implementación mediante una tabla hash (realmente un _HashMap_). No garantiza ningún orden al iterar sobre el conjunto.

a|
[source,java]
....
public HashSet()
public HashSet(int initialCapacity)
public HashSet(int initialCapacity, float loadFactor)
public HashSet(Collection<? extends E> c)
....

a|
* *Clase LinkedHashSet<E>:#* Implementación mediante tabla hash y listas enlazadas (mediante _LinkedHashMap_), en la que los elementos se recorren en el mismo orden en el que se insertaron.

a|
[source,java]
....
public LinkedHashSet()
public LinkedHashSet(int initialCapacity)
public LinkedHashSet(int initialCapacity, float loadFactor)
public LinkedHashSet(Collection<? extends E> c)
....

a|
* *Interfaz SortedSet<E>:* Representa un conjunto que establece un orden total sobre sus elementos. Los elementos se ordenan por su orden natural (según el interfaz _Comparable_) o por un comparador de elementos que se suministra al conjunto en su construcción. Todas las claves deben implementar el interfaz _Comparable_ (o ser aceptadas por su _Comparator_).

a|
[source,java]
....
Comparator<? super E> comparator()
SortedSet<E> subSet(E fromElement, E toElement)
SortedSet<E> headSet(E toElement)
SortedSet<E> tailSet(E fromElement)
E first()
E last()
....

a|
* *Interfaz NavigableSet<E>:* Extiende _SortedSet<E>_ para buscar un elemento menor, menor o igual, mayor o igual, y mayor que un cierto elemento dado, más otros métodos de búsqueda.

a|
[source,java]
....
E lower(E e)
E floor(E e)
E ceiling(E e)
E higher(E e)
E pollFirst()
E pollLast()
NavigableSet<E> descendingSet()
Iterator<E> descendingIterator()
NavigableSet<E> subSet(E fromElement, boolean fromInclusive,
E toElement, boolean toInclusive)
NavigableSet<E> headSet(E toElement, boolean inclusive)
NavigableSet<E> tailSet(E fromElement, boolean inclusive)
SortedSet<E> subSet(E fromElement, E toElement)
SortedSet<E> headSet(E toElement)
SortedSet<E> tailSet(E fromElement)
....

|===

- La única clase que implementa el interfaz _NavigableSet<E>_ es:

[cols="50,50"]
|===

a|
* *Clase TreeSet<E>:* Implementación mediante _TreeMap_, en la que los elementos se recorren según su orden natural.

a|
[source,java]
....
public TreeSet()
public TreeSet(Comparator<? super E> comparator)
public TreeSet(Collection<? extends E> c)
public TreeSet(SortedSet<E> s)
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust4_how/ust8_parametrized/ust5_collections/ust4_maps.adoc ===== -->

#### Mapas

[cols="50,50"]
|===

a|
- *Interfaz Map<K,V>:* Un mapa representa una colección de elementos formados por una clave y un valor. En un mapa no puede haber elementos con claves repetidas, cada clave puede tener un valor como máximo.

a|
[source,java]
....
boolean containsKey(Object key)
boolean containsValue(Object value)
V get(Object key)
V put(K key, V value)
V remove(Object key)
void putAll(Map<? extends K,? extends V> m)
Set<K> keySet()
Collection<V> values()
Set<Map.Entry<K,V>> entrySet()
....

|===


- Las clases que implementan este interfaz son:

[cols="50,50"]
|===

a|
- *Clase EnumMap<K extends Enum<K>,V>:* Implementación para usarse con claves de tipo enumerados. Las claves deben ser valores de enumerados. Proporcionan una representación muy compacta y eficiente basada en vectores. Los elementos se recorren según su orden natural.

a|
[source,java]
....
public EnumMap(Class<K> keyType)
public EnumMap(EnumMap<K,? extends V> m)
public EnumMap(Map<K,? extends V> m)
....

a|
- *Clase HashMap<K,V>:* Implementación mediante una tabla hash. No garantiza ningún orden al iterar sobre el mapa.

a|
[source,java]
....
public HashMap()
public HashMap(int initialCapacity)
public HashMap(int initialCapacity, float loadFactor)
public HashMap(Map<? extends K,? extends V> m)
....

a|
- *Clase LinkedHashMap<K,V>:* Implementación mediante una tabla hash y listas doblemente enlazadas. Los elementos se recorren en el orden de inserción de sus claves.

a|
[source,java]
....
public LinkedHashMap()
public LinkedHashMap(int initialCapacity)
public LinkedHashMap(int initialCapacity, float loadFactor)
public LinkedHashMap(Map<? extends K,? extends V> m)
public LinkedHashMap(int initialCapacity, float loadFactor,
     boolean accessOrder)
....

a|
- *Clase WeakHashMap<K,V>:* Implementación mediante una tabla hash y claves débiles. Los elementos cuyas claves dejan de ser referenciadas se destruyen automáticamente.

a|
[source,java]
....
public WeakHashMap()
public WeakHashMap(int initialCapacity)
public WeakHashMap(int initialCapacity, float loadFactor)
public WeakHashMap(Map<? extends K,? extends V> m)
....

a|
- *Clase IdentityHashMap<K,V>:* Implementación mediante una tabla hash y con comparación de claves y valores mediante == en lugar de equals.

a|
[source,java]
....
public IdentityHashMap()
public IdentityHashMap(int expectedMaxSize)
public IdentityHashMap(Map<? extends K,? extends V> m)
....

a|
- *Interfaz SortedMap<K,V>:* Un mapa que proporciona un orden total sobre sus claves. El mapa se ordena según el orden natural de sus claves, o mediante un _Comparator_ que se suministra al crear el mapa. Este orden se sigue al iterar sobre las colecciones que devuelve el mapa. Todas las claves deben implementar el interfaz _Comparable_ (o ser aceptadas por su _Comparator_).

a|
[source,java]
....
Comparator<? super K> comparator()
SortedMap<K,V> subMap(K fromKey, K toKey)
SortedMap<K,V> headMap(K toKey)
SortedMap<K,V> tailMap(K fromKey)
K firstKey()
K lastKey()
Set<K> keySet()
....

a|
- *Interfaz NavigableMap<K,V> (I):* Extiende _SortedMap<E>_ para buscar un elemento menor, menor o igual, mayor o igual, y mayor que un cierto elemento dado, más otros métodos de búsqueda.

a|
[source,java]
....
Map.Entry<K,V> lowerEntry(K key)
K lowerKey(K key)
Map.Entry<K,V> floorEntry(K key)
K floorKey(K key)
Map.Entry<K,V> ceilingEntry(K key)
K ceilingKey(K key)
Map.Entry<K,V> higherEntry(K key)
K higherKey(K key)
Map.Entry<K,V> firstEntry()
Map.Entry<K,V> lastEntry()
Map.Entry<K,V> pollFirstEntry()
Map.Entry<K,V> pollLastEntry()
NavigableMap<K,V> descendingMap()
....

a|
- *Interfaz NavigableMap<K,V> (II):*

a|
[source,java]
....
NavigableSet<K> navigableKeySet()
NavigableSet<K> descendingKeySet()
NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive,
                         K toKey, boolean toInclusive)
NavigableMap<K,V> headMap(K toKey, boolean inclusive)
NavigableMap<K,V> tailMap(K fromKey, boolean inclusive)
....

|===


- La única clase que implementa el interfaz _NavigableMap<K,V>_ es:

[cols="50,50"]
|===

a|
- *Clase TreeMap<K,V>:* Implementación mediante un árbol, en la que los elementos se recorren según su orden natural (o en el orden que proporciona su _Comparator_).

a|
[source,java]
....
public TreeMap()
public TreeMap(Comparator<? super K> comparator)
public TreeMap(Map<? extends K,? extends V> m)
public TreeMap(SortedMap<K,? extends V> m)
....

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust5_synthesis.adoc ===== -->

## *Sintesis*





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust6_bibliography.adoc ===== -->

## *Bibliografía*

[cols="25,25,25,25",options="header"]

|===

a| Obra, Autor y Edición
a| Portada
a| Obra, Autor y Edición
a| Portada

a|
a|

a|
a|

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/ust7_speaker.adoc ===== -->

## Ponente

[cols="30,30,40"]
|===

a|
- *__Luis Fernández Muñoz__*
* _Formador/Consultor_
* link:https://es.linkedin.com/in/luisfernandezmunyoz[_Linkedin_]
^.^a|
image:setillo.jpg[]
a|
* _Doctor en Inteligencia Artificial por la UPM_
* _Ingeniero en Informática por la UMA_
* _Diplomado en Informática por la UPM_
* _Profesor Titular de ETSISI de la UPM_

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/lenguaje.adoc ===== -->


## Lenguaje

- *[underline]#Componentes:#*

* *Léxico:* determina las piezas del lenguaje

* *Sintaxis/Gramática:* determina la secuencia correcta de las piezas del lenguaje

* *Semántica:* determina el significado de la secuencia correcta de las piezas del lenguaje

* [red]#Ejemplos:# semáforo, abanico, árbitro de baloncesto, castellano, Java (*Código ASCII*), ...



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/logica.adoc ===== -->


## Lógica

[cols="100%", grid=none, frame=none]
|===
^.^a|
image:Logica.png[height32]
|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/piramideDIKW.adoc ===== -->

## Pirámide DIKW

[cols="100%", drid=none, frame=none]
|===

^.^a|
image:Piramide2.png[height32]

|===

- *[underline]#Señales:#* visual, sonoro, táctil, ... humanos, murciélagos, ...

-  *[underline]#Datos:#* señal con formato significativo (estándar)

** [red]#Ejemplos:#

*** Sonoro: palabras (números, ...), alarmas, ...

*** Visual: palabras (números, ...), emoticonoes, gestos, ...

*** Táctil: caricia, bofetón, ...

*** ...

*** Millones de datos de clientes en una base de datos

-  *[underline]#Información:#* datos relacionados

* [red]#Ejemplos:#

** Visual: barro con rayas, sello egipcio, ...

** Fórmula: el espacio recorrido es proporcional al tiempo y la velocidad, ...

** ...

** Millones de características de clientes en una base de datos

- *[underline]#Conocimiento:#* aplica la información a un contexto

* [red]#Ejemplos:#

** Expertos, profesionales, ... que aplican leyes, heurísticas, ...

** ...

** Tipos de clientes en una base de datos

- *[underline]#Sabiduría:#* conoce las consecuencias de la aplicación

* [red]#Ejemplos:#

** Sócrates, Lao Tse, Jesucristo, Buda, ...

** Premios Nobel, Turing,



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/sistemasNumericas.adoc ===== -->


## Sistemas numéricos

image::Sistemas.png[height32]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/universo.adoc ===== -->

## Universo

[cols="30,70", grid=none, frame=none]
|===

a|*[red]#Clasificación#* de *[underline]#Recursos:#*

* Espacio/Tiempo

* Materia/Energía

a|image::Universo.png[height32]
|===

[cols="30,70", grid=none, frame=none]
|===

a|*[underline]#Objetos:#*

* *[red]#Clasificación#* de Partículas subatómicas *[red]#compuestas#* de Cuerdas (física cuántica)

.2+^a|image::Universo2.png[height32]

a|image::Universo3.png[height32]
|===

[cols="30,70", grid=none, frame=none]
|===

a|*[underline]#Objetos:#*

* *[red]#Clasificación#* de Átomos *[red]#compuestos#* de Partículas Elementales

.2+^a|image::Tablaperiodica.png[height32]

a|image::Universo4.png[height32]
|===

* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Moléculas *[red]#compuestas#* de Átomos

[cols="100%", grid=none, frame=none]
|===
^.^a|
image:Universo5.png[height32]
^.^a|
image:Universo6.png[height32]
|===

* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Orgánulos Celulares *[red]#compuestas#* de Moléculas

[cols="30,70", Grid=none, frame=none]
|===

^.^a|
image:Universo8.png[height32]
^.^a|
image:Universo7.png[height32]
|===

* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Células *[red]#compuestas#* de Membrana, Orgánulos Celulares y Núcleo

[cols="30,70", Grid=none, frame=none]
|===

^.^a|
image:Universo10.png[height32]
^.^a|
image:Universo9.png[height32]

|===

* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Tejidos *[red]#compuestos#* de Células

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Universo11.png[height32]

|===

* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Órganos *[red]#compuestos#* de Tejidos

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Universo12.png[height32]

|===
* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Ser Vivo *[red]#compuestos#* de Órganos

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Universo13.png[height32]

|===

* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Planeta *[red]#compuestos#* de Seres Vivos, Orografía, Hidrografía, Atmósfera, ...

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Universo14.png[height32]

|===

* *[underline]#Objetos :#*

**  *[red]#Clasificación#* de Sistemas Solares *[red]#compuestos#* de Estrellas, Planetas, ...

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Universo15.png[height32]

|===

* *[underline]#Objetos :#*

** Universo *[red]#compuestos#* de Galaxias, ...

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Universo16.png[height32]

|===

* *[underline]#Patrones:#*

** *[red]#Objeto/Sistema:#* *[underline]#conjunto#* de sub-objetos que interaccionan entre sí con un objetivo común

** *[red]#Clase/Entidad:#* *[underline]#conjunto#* de propiedades necesarias y suficientes que cumplen un *[underline]#conjunto#* “homogéneo” de sistemas/objetos

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Rosas.png[height32]

|===

** *[red]#Conjunto#* es colección no ordenada de elementos por extensión o por comprensión cumpliendo cierta propiedad

***  Operaciones: intersección, unión, diferencia, ...

*** *[red]#Elementos:#* objetos, clases y/o conjuntos de elementos ... paradojas!!!

** *[red]#Jerarquías:#*

*** *[red]#Jerarquías de Composición#* conjuntos de objetos que son conjuntos de objetos que ... (unión de objetos)

*** *[red]#Jerarquías de Clasificación#* conjuntos de clases que son conjuntos de clases que ... (intersección de propiedades)

** *[red]#Secuencia (1:1)#* estructura en que toda entidad (nodo)

***  se relaciona con una única entidad como máximo y

*** se relaciona con ella otra única entidad como máximo

*** [red]#Ejemplo:#

[cols="50,50", grid=none, frame=none]
|===

a|**** Pilas: LIFO, last in last out

**** Colas: FIFO, first in first out

**** Secuencia circular

**** Matrices: secuencia de secuencias de nodos

**** Cubo: secuencia de matrices de nodos

^.^a|
image:Universo17.png[height32]

|===

** *[red]#Par ordenado/Tupla#* es conjunto con dos conjuntos:

***  { {a}, {a,b}}; {{x,y}, {x}}; ...

***  Primero: intersección

**** {a} x {a,b} = {a};

**** {x,y} x {x} = {x}

*** Segundo: diferencia de la unión y la intersección

**** {a} + {a,b} - {a} x {a,b} = {b};

**** {x,y} + {x} - {x,y} x {x} = {y}

** *[red]#Árbol (1:N)#* estructura en que toda entidad (nodo)

***  se relaciona con una única entidad como máximo y

***  se relacionan con ella otras entidades sin limitación

***  Denominación:

[cols="50,50", grid=none, frame=none]
|===

a|**** Padre, hija, ... tio abuelo, ...

^.^a|
image::Universo18.png[height32]

|===

[cols="50,50", grid=none, frame=none]
|===

a|** *[red]#Grafo (N:M)#* estructura en que toda entidad (nodo)

*** se relaciona con otras entidades sin limitación y

*** se relacionan con ella otras entidades sin limitación

** *[red]#Jerarquía:#* grafo próximo a un árbol con algunos nodos con varios padres y con hijos de diferentes niveles

^.^a|
image:Universo19.png[height32]

|===

* *[underline]#Ciencia:#*

**  *¿por qué?* Necesidades, objetivos, prioridades, ...

[cols="100%", grid=none, frame=none]
|===

^.^a|
image:Piramide.png[height32]

|===

[cols="50,50", grid=none, frame=none]
|===

a|** *¿para qué?* Efectividad, equilibrio entre:

*** Eficacia, cumplimiento de objetivos

***  Eficiencia, consumo de recursos

^.^a|
image::Universo20.png[height32]

|===

[cols="50,50", grid=none, frame=none]
|===

a|** *¿cómo?* Herramientas para complementar las posibilidades humanas:

*** Cuantitativa vs Cualitativa

*** [red]#Ejemplos:#

**** Abstractas: Lenguaje, Lógica, Matemática, Informática

**** Concretas: Escritura, Armas, Computadora/ Ordenador...

^.^a|
image:Universo21.png[height32]

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x10-programacionRedes/0-index.adoc ===== -->

## 10-Programación de Redes

include::1-socketsConConexion.adoc[]
include::2-servidorConConexion.adoc[]
include::3-clienteConConexion.adoc[]
include::4-socketsSinConexion.adoc[]
include::5-servidorSinConexion.adoc[]
include::6-clienteSinConexion.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x10-programacionRedes/1-socketsConConexion.adoc ===== -->

## Sockets con conexión

[cols="50,50"]
|===

a|
- Un socket es una abstracción que representa cada uno de los extremos de un canal de comunicación entre dos programas, por el que pueden transmitirse datos en ambos sentidos.

image:sockets.png[]

- En Java, un socket se representa mediante un objeto de la clase Socket del paquete _java.net_.

- Cada socket tiene asociados dos flujos, un flujo de entrada para recibir datos, y un flujo de salida para enviar datos.

a|
- El flujo de salida del socket de cada extremo está conectado al flujo de entrada del socket del otro extremo.

- Dependiendo del tipo de datos que se intercambien, se usan flujos de texto, binarios, o de objetos.

- La comunicación mediante sockets usa la *_arquitectura cliente-servidor_*, en la que existe un servidor que espera conexiones por parte de uno o varios clientes, gestionadas por el protocolo de comunicaciones TCP.

- Una vez que se establece una conexión entre un cliente y el servidor, se crea un socket en el cliente y otro en el servidor, y se procede al intercambio de información entre ambos, mediante los flujos asociados a cada socket.

|===










<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x10-programacionRedes/2-servidorConConexion.adoc ===== -->

## Servidor con conexión

[cols="50,50"]
|===

a|
- Para que el servidor comience a aceptar conexiones de los clientes, en primer lugar se debe crear un objeto de la clase _ServerSocket_ del paquete _java.net_.

a|
[source, java]
....
ServerSocket socketServidor = new ServerSocket(2020);
....

a|
* donde se debe especificar el puerto de la máquina local en el que el servidor debe esperar las conexiones.

* Un mismo puerto no puede ser utilizado por dos programas distintos en la misma máquina.

* Los números de puertos están comprendidos entre 0 y 65535, aunque de 0 a 1024 están reservados para uso del sistema operativo.

* Una vez creado el objeto, se debe invocar el método _accept()_, que hace que el hilo se bloquee hasta que llegue una petición de conexión por parte de un cliente.

a|
[source, java]
....
Socket socketConexion = socketServidor.accept();
....

a|
- Cuando se produzca la conexión, el hilo se desbloquea y se devuelve el socket de esa conexión.

- Se puede obtener la dirección y puerto del socket del cliente, usando los métodos _getInetAddress()_ y _getPort()_ de la clase _Socket_.

a|
[source, java]
....
InetAddress inetAddress = socketConexion.getInetAddress();
String direccion = inetAddress.getHostAddress();
int puerto = socketConexion.getPort();
....

a|
- El siguiente paso consiste en obtener los flujos de entrada y salida del socket, por los que se recibirán y enviarán los datos. 

a|
[source, java]
....
OutputStream outStream = socketConexion.getOutputStream();
InputStream inStream = socketConexion.getInputStream();
....

a|
- Dependiendo del tipo de datos que se deseen intercambiar, se crean los flujos de entrada y salida, en los que se leerán y escribirán los datos en el formato adecuado.

* En el caso de flujos de texto:

a|
[source, java]
....
PrintWriter out = new PrintWriter(outStream);
BufferedReader in = new BufferedReader(
    new InputStreamReader(inStream));
....

a|
* En el caso de flujos de objetos:

a|
[source, java]
....
ObjectOutputStream out = new ObjectOutputStream(outStream);
out.flush();
ObjectInputStream in = new ObjectInputStream(inStream);
....

a|
* Una vez obtenidos los flujos, se lee y escribe en los flujos.

* En el caso de flujos de texto:

a|
[source, java]
....
String lineaRecibir = in.readLine();
String lineaEnviar = ...
out.println(lineaEnviar);
out.flush();
....

a|
* En el caso de flujos de objetos:

a|
[source, java]
....
Object objetoRecibir = in.readObject();
Object objetoEnviar = ...
out.writeObject(objetoEnviar);
out.flush();
....

|===

[cols="50,50"]
|===

2+a|
*[red]#Ejemplos:#*

a|
[source, java]
....
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ServidorEcoTexto {

  public static void main(String[] args) {
    try {
      // Crear socket servidor
      ServerSocket socketServidor = new ServerSocket(2020);

      System.out.println("Servidor> Esperando conexion...");

      // Esperar conexion del cliente
      Socket socketConexion = socketServidor.accept();

      System.out.println("Servidor> Recibida conexion de " +
          socketConexion.getInetAddress().getHostAddress() +
          ":" + socketConexion.getPort());


      PrintWriter out = null;
      BufferedReader in = null;
      try {
        // Obtener flujos de salida y entrada
        OutputStream outStream =
            socketConexion.getOutputStream();
        InputStream inStream =
            socketConexion.getInputStream();

        // Crear flujos de escritura y lectura
        out = new PrintWriter(outStream);
        in = new BufferedReader(
            new InputStreamReader(inStream));

        // Leer y escribir en los flujos
        boolean salir = false;
        String linea;
        while (!salir && (linea = in.readLine()) != null) {
          System.out.println("Servidor> Recibida linea = " +
              linea);
          if (linea.trim().equals("adios")) {
            salir = true;
          } else {
            out.println(linea);
            out.flush();
          }
        }

      } finally {
        // Cerrar flujos
        if (out != null) {
          out.close();
        }
        if (in != null) {
          in.close();
        }
        // Cerrar socket de la conexion
        socketConexion.close();
        System.out.println("Servidor> Fin de conexion");

        // Cerrar socket servidor
        socketServidor.close();
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
....

a|
[source, java]
....
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ServidorEcoObjetos {

  public static void main(String[] args) {
    try {
      // Crear socket servidor
      ServerSocket socketServidor = new ServerSocket(2020);

      System.out.println("Servidor> Esperando conexion...");

      // Esperar conexion del cliente
      Socket socketConexion = socketServidor.accept();

      System.out.println("Servidor> Recibida conexion de " +
          socketConexion.getInetAddress().getHostAddress() +
          ":" + socketConexion.getPort());

      ObjectOutputStream out = null;
      ObjectInputStream in = null;
      try {
        // Obtener flujos de salida y entrada
        OutputStream outStream =
            socketConexion.getOutputStream();
        InputStream inStream =
            socketConexion.getInputStream();

        // Crear flujos de escritura y lectura
        out = new ObjectOutputStream(outStream);
        out.flush();
        in = new ObjectInputStream(inStream);


        // Leer y escribir en los flujos
        boolean salir = false;
        String linea;
        while (!salir &&
             (linea = (String) in.readObject()) != null) {
          System.out.println("Servidor> Recibida linea = " +
              linea);
          if (linea.trim().equals("adios")) {
            salir = true;
          } else {
            out.writeObject(linea);
            out.flush();
          }
        }

      } finally {
        // Cerrar flujos
        if (out != null) {
          out.close();
        }
        if (in != null) {
          in.close();
        }
        // Cerrar socket de la conexion
        socketConexion.close();
        System.out.println("Servidor> Fin de conexion");

        // Cerrar socket servidor
        socketServidor.close();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
....

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x10-programacionRedes/3-clienteConConexion.adoc ===== -->

## Cliente con conexión

[cols="50,50"]
|===

a|
- Para que el cliente solicite establecer una conexión con el servidor, en primer lugar se debe crear un objeto de la clase _Socket_ del paquete _java.net_.

a|
[source, java]
....
Socket socketConexion = new Socket("localhost", 2020);
....

a|
* donde se debe especificar el nombre y el puerto de la máquina remota en el que el servidor espera las conexiones.

- Cuando se establezca la conexión, se devuelve el socket de esa conexión.

- El siguiente paso consiste en obtener los flujos de entrada y salida del socket, por los que se recibirán y enviarán los datos.

a|
[source, java]
....
OutputStream outStream = socketConexion.getOutputStream();
InputStream inStream = socketConexion.getInputStream();
....

a|
- Dependiendo del tipo de datos que se deseen intercambiar, se crean los flujos de entrada y salida, en los que se leerán y escribirán los datos en el formato adecuado.

- En el caso de flujos de texto:

a|
[source, java]
....
PrintWriter out = new PrintWriter(outStream);
BufferedReader in = new BufferedReader(
    new InputStreamReader(inStream));
....

a|
- En el caso de flujos de objetos:

a|
[source, java]
....
ObjectOutputStream out = new ObjectOutputStream(outStream);
out.flush();
ObjectInputStream in = new ObjectInputStream(inStream);
....

a|
- Una vez obtenidos los flujos, se escribe y lee en los flujos.

- En el caso de flujos de texto:

a|
[source, java]
....
String lineaEnviar = ...
out.println(lineaEnviar);
out.flush();
String lineaRecibir = in.readLine();
....

a|
- En el caso de flujos de objetos:

a|
[source, java]
....
Object objetoEnviar = ...
out.writeObject(objetoEnviar);
out.flush();
Object objetoRecibir = in.readObject();
....

|===

[cols="50,50"]
|===

2+a|
*[blue]#Ejemplo:#*

a|
[source, java]
....
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

class ClienteEcoTexto {

  public static void main(String[] args) {
    try {
      // Crear socket cliente y establecer conexion
      Socket socketConexion = new Socket("localhost", 2020);

      System.out.println("Cliente> Establecida conexion");

      PrintWriter out = null;
      BufferedReader in = null;
      try {
        // Obtener flujos de salida y entrada
        OutputStream outStream =
            socketConexion.getOutputStream();
        InputStream inStream =
            socketConexion.getInputStream();

        // Crear flujos de escritura y lectura
        out = new PrintWriter(outStream);
        in = new BufferedReader(
            new InputStreamReader(inStream));

        // Crear flujo para leer de la entrada estandar
        BufferedReader inStd = new BufferedReader(
            new InputStreamReader(System.in));


        // Escribir y leer en los flujos
        boolean salir = false;
        while (!salir) {
          System.out.print("Cliente> Escriba una linea: ");
          String lineaEnviar = inStd.readLine();
          out.println(lineaEnviar);
          out.flush();
          String lineaRecibir = in.readLine();
          if (lineaRecibir == null) {
            salir = true;
          } else {
            System.out.println("Cliente> Recibida linea = " +
                lineaRecibir);
          }
        }
    } finally {
        // Cerrar flujos
        if (out != null) {
          out.close();
        }
        if (in != null) {
          in.close();
        }
        // Cerrar socket de la conexion
        socketConexion.close();
        System.out.println("Cliente> Fin de conexion");
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
....

a|
[source, java]
....
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

class ClienteEcoObjetos {

  public static void main(String[] args) {
    try {
      // Crear socket cliente y establecer conexion
      Socket socketConexion = new Socket("localhost", 2020);

      System.out.println("Cliente> Establecida conexion");
      ObjectOutputStream out = null;
      ObjectInputStream in = null;
      try {
        // Obtener flujos de salida y entrada
        OutputStream outStream =
            socketConexion.getOutputStream();
        InputStream inStream =
            socketConexion.getInputStream();

        // Crear flujos de escritura y lectura
        out = new ObjectOutputStream(outStream);
        out.flush();
        in = new ObjectInputStream(inStream);

        // Crear flujo para leer de la entrada estandar
        BufferedReader inStd = new BufferedReader(
            new InputStreamReader(System.in));
        // Escribir y leer en los flujos
        boolean salir = false;
        while (!salir) {
          System.out.print("Cliente> Escriba una linea: ");
          String lineaEnviar = inStd.readLine();
          out.writeObject(lineaEnviar);
          out.flush();
          String lineaRecibir = (String) in.readObject();
          if (lineaRecibir == null) {
            salir = true;
          } else {
            System.out.println("Cliente> Recibida linea = " +
                lineaRecibir);
          }
        }
      } finally {
        // Cerrar flujos
        if (out != null) {
          out.close();
        }
        if (in != null) {
          in.close();
        }
        // Cerrar socket de la conexion
        socketConexion.close();
        System.out.println("Cliente> Fin de conexion");
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x10-programacionRedes/4-socketsSinConexion.adoc ===== -->

## Sockets sin conexión

[cols="50,50"]
|===

a|
- Otra manera de intercambiar información entre dos programas en red es mediante el protocolo UDP, en el que no se usan conexiones.

- En este caso, también se usa la *_arquitectura cliente-servidor_*, en la que existe un servidor que espera recibir paquetes de información, llamados _datagramas_, que son enviados desde los clientes.

a|
- Este protocolo no garantiza que los paquetes no se pierdan, se reciban duplicados, o lleguen en distinto orden en que se enviaron.

- Por tanto, si se necesita cumplir con los anteriores requisitos, es imprescindible que sea el programador quien proporcione los mecanismos oportunos.

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x10-programacionRedes/5-servidorSinConexion.adoc ===== -->

## Servidor sin conexión

[cols="50,50"]
|===

a|
- Para que el servidor pueda recibir y enviar paquetes, primero se debe crear un objeto de la clase _DatagramSocket_ del paquete _java.net_.

a|
[source, java]
....
DatagramSocket socket = new DatagramSocket(2020);
....

a|
* donde se debe especificar el puerto de la máquina local en el que el servidor debe esperar los paquetes.

- Un mismo puerto no puede ser utilizado por dos programas distintos en la misma máquina.

- Los números de puertos están comprendidos entre 0 y 65535, aunque de 0 a 1024 están reservados para uso del sistema operativo.

- Después, se debe crear un paquete donde recibir los datos, instanciando un objeto de la clase _DatagramPacket_ de _java.net_.

a|
[source, java]
....
byte[] datosRecibir = new byte[100];
DatagramPacket paqueteRecibir =
    new DatagramPacket(datosRecibir, datosRecibir.length);
....

a|
* donde se debe especificar el máximo número de bytes a recibir.

- Una vez creado el paquete se invoca el método receive() sobre el socket, y el hilo se bloquea hasta que se reciba el paquete.

a|
[source, java]
....
socket.receive(paqueteRecibir);
....

a|
- Cuando se reciba el paquete, el hilo se desbloquea y se pueden obtener los datos del paquete.

a|
[source, java]
....
byte[] datos = paqueteRecibir.getData();
int longitud = paqueteRecibir.getLength();
....

a|
- Si el servidor desea enviar una respuesta al cliente, se debe crear un paquete para enviar los datos, instanciando otro objeto de la clase _DatagramPacket_ de _java.net_.

a|
[source, java]
....
byte[] datosEnviar = new byte[100];
DatagramPacket paqueteEnviar =
    new DatagramPacket(datosEnviar, datosEnviar.length,
        paqueteRecibir.getAddress(),
        paqueteRecibir.getPort());
....

a|
* donde se debe especificar el número de bytes a enviar, la dirección y el puerto del cliente.

- Y finalmente se envía el paquete al cliente.

a|
[source, java]
....
socket.send(paqueteEnviar);
....

|===

[cols="50,50"]
|===

2+a|
*[blue]#Ejemplo:#*

a|
[source, java]
....
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class ServidorEcoDatagramas {

  public static void main(String[] args) {
    try {
      // Crear socket servidor
      DatagramSocket socket = new DatagramSocket(2020);

      System.out.println("Servidor> Esperando paquetes...");
      try {
        // Leer y escribir en el socket
        boolean salir = false;
        String linea;
        while (!salir) {
          // Crear paquete a recibir
          byte[] datos = new byte[100];
          DatagramPacket paqueteRecibir =
              new DatagramPacket(datos, datos.length);
        // Esperar a recibir el paquete
          socket.receive(paqueteRecibir);
          linea = new String(paqueteRecibir.getData(),
              0, paqueteRecibir.getLength());
          System.out.println("Servidor> Recibida linea de " +
              paqueteRecibir.getAddress() + ":" +
              paqueteRecibir.getPort() + " = " + linea);
....

a|
[source,java]
....
          if (linea.trim().equals("adios")) {
            salir = true;
            // Crear paquete a enviar
            DatagramPacket paqueteEnviar = new DatagramPacket(
                paqueteRecibir.getData(),
                0,
                paqueteRecibir.getAddress(),
                paqueteRecibir.getPort());
            // Enviar el paquete
            socket.send(paqueteEnviar);
          } else {
            // Crear paquete a enviar
            DatagramPacket paqueteEnviar = new DatagramPacket(
                paqueteRecibir.getData(),
                paqueteRecibir.getLength(),
                paqueteRecibir.getAddress(),
                paqueteRecibir.getPort());
            // Enviar el paquete
            socket.send(paqueteEnviar);
          }
        }
      } finally {
        // Cerrar socket
        socket.close();
        System.out.println("Servidor> Fin");
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x10-programacionRedes/6-clienteSinConexion.adoc ===== -->

## Cliente sin Conexión

[cols="50,50"]
|===

a|
- Para que el cliente pueda enviar y recibir paquetes, primero se debe crear un objeto de la clase DatagramSocket del paquete java.net.

a|
[source, java]
....
DatagramSocket socket = new DatagramSocket();
....

a|
* lo que crea un socket en un puerto libre de la máquina local.

- Después se debe crear un paquete para enviar los datos al servidor, y se envía el paquete al servidor.

a|
[source, java]
....
byte[] datosEnviar = new byte[100];
DatagramPacket paqueteEnviar =
    new DatagramPacket(datosEnviar, datosEnviar.length,
          InetAddress.getByName("localhost"), 2020);
socket.send(paqueteEnviar);
....

a|
* donde se debe especificar la dirección y el puerto de la máquina remota en el que el servidor espera los paquetes.

- Después, se debe crear un paquete donde recibir los datos.

a|
[source, java]
....
byte[] datosRecibir = new byte[100];
DatagramPacket paqueteRecibir =
    new DatagramPacket(datosRecibir, datosRecibir.length);
....

a|
* donde se debe especificar el máximo número de bytes a recibir.

- Una vez creado el paquete se invoca el método receive() sobre el socket, y el hilo se bloquea hasta que se reciba el paquete.

a|
[source, java]
....
socket.receive(paqueteRecibir);
....

a|
- Cuando se reciba el paquete, el hilo se desbloquea y se pueden obtener los datos del paquete.

a|
[source, java]
....
byte[] datos = paqueteRecibir.getData();
int longitud = paqueteRecibir.getLength();
....

|===

[cols="50,50"]
|===

2+a|
*[blue]#Ejemplo:#*

a|
[source, java]
....
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class ClienteEcoDatagramas {

  public static void main(String[] args) {
    try {
      // Crear socket cliente
      DatagramSocket socket = new DatagramSocket();

      try {
        // Crear flujo para leer de la entrada estandar
        BufferedReader inStd = new BufferedReader(
            new InputStreamReader(System.in));
        // Escribir y leer en el socket
        boolean salir = false;
        while (!salir) {
          System.out.print("Cliente> Escriba una linea: ");
          String lineaEnviar = inStd.readLine();
          byte[] datosEnviar = lineaEnviar.getBytes();
....

a|
[source,java]
....
          // Crear paquete a enviar
          DatagramPacket paqueteEnviar = new DatagramPacket(
              datosEnviar, datosEnviar.length,
              InetAddress.getByName("localhost"), 2020);

          // Enviar el paquete
          socket.send(paqueteEnviar);
          // Crear paquete a recibir
          byte[] datosRecibir = new byte[100];
          DatagramPacket paqueteRecibir =
              new DatagramPacket(datosRecibir,
                  datosRecibir.length);

          // Esperar a recibir el paquete
          socket.receive(paqueteRecibir);
          String lineaRecibir = new String(
              paqueteRecibir.getData(),
              0, paqueteRecibir.getLength());
          System.out.println("Cliente> Recibida linea = " +
              lineaRecibir);
          if (lineaRecibir.trim().equals("")) {
            salir = true;
          }
        }
      } finally {
        // Cerrar socket
        socket.close();
        System.out.println("Cliente> Fin");
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x11-programacionBasesDatos/0-index.adoc ===== -->

## 11-Programación de Bases a Datos

- _Presentar los conceptos fundamentales para el acceso desde programas en Java a la información alojada en las bases de datos relacionales._

include::1-introduccion/0-index.adoc[]
include::2-lenguajeSQL.adoc[]
include::3-JDBC.adoc[]






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x11-programacionBasesDatos/1-introduccion/0-index.adoc ===== -->

## Introducción

[cols="60,40"]
|===

a|
- *Base de Datos:* es un conjunto de datos homogénea almacenada en ordenador que permite realizar consultas y actualizaciones (inserciones, modificaciones, borrados)

- *Sistema Gestor de Base de Datos:* es un programa que permite la definición y manipulación de bases de datos.

- *Base de Datos Relacional:* está basada en la teoría de conjuntos y en el concepto matemático de relación donde la estructura lógica principal son tablas  que tienen un número fijo de columnas  (atributos) y un número variable de filas (tuplas). Una base de datos relacional está compuesta por varias tablas o relaciones

a|
* *[blue]#Ejemplo:#*

** Se desea almacenar la información de los modelos del proyecto Agenda:

include::diagramaInformacionModelos.adoc[]

|===

* *[blue]#Ejemplo:#*

** Se proponen las siguientes tablas:

[cols="25,25,25,25"]
|===

a|
*CONTACTO:*

* idContacto(entero)   
* nombre(string)
* idDirectorioPadre(entero) 

a|
*DIRECTORIO:*

* idContacto(entero)

a|
*INDIVIDUAL:*

* idContacto(entero)
* telefono(string)

a|
*EMERGENCIA:*

* idContacto(entero)

a|
*PERSONA:*

* idContacto(entero)
* correo(string)
* direccion(string)
* idContactoAlternativo(entero)

a|
*BLOC:*

* idBloc(entero)
* nombre(string)

a|
*NOTA:*

* idNota(entero)

a|
*LINEA:*

* idLinea(entero)
* idNota(entero)
* texto(string)

|===

[cols="50,50"]
|===

2+a|
*[blue]#Ejemplo:#*

a|
* Para los siguientes datos:

[source]
....
CONTACTOS
	Luis,tel:111,mail:111,dir:111
	LPSI
		Director,tel:222,mail:222,dir:222,alt:Secretaria
		Secretaria,tel:333,mail:333,dir:333
	Paula,tel:444,mail:444,dir:444,alt:Luis
	RECTORADO
		Rector,tel:555,mail:555,dir:555,alt:Vicerrector
		Vicerrector,tel:666,mail,666,dir:666
		Seguridad,tel:777
	Policia,tel:888
NOTAS
	//primera nota//de la agenda//
	//segunda nota//de la agenda//
	////

....

a|
* Se corresponde con las siguientes tuplas:

image:tuplas.png[]

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x11-programacionBasesDatos/1-introduccion/diagramaInformacionModelos.adoc ===== -->

[plantuml, InformacionModelos, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BorderColor<<yellow>> #FFD700
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
    FontColor<<yellow>> #FFD700
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
hide stereotype

class MAgenda
class MContacto
class MIndividual
class MDirectorio
class MBloc
class MPersona
class MEmergencia
class MNota

MContacto <\|-- MIndividual
MContacto <\|-- MDirectorio
MContacto --* MDirectorio
MAgenda *-- MDirectorio
MAgenda *-- MBloc
MIndividual <\|-- MPersona
MPersona --> MPersona
MIndividual <\|-- MEmergencia
MBloc *-- MNota
....









<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x11-programacionBasesDatos/2-lenguajeSQL.adoc ===== -->

## Lenguaje SQL

[cols="50,50"]
|===

a|
- *[blue]#SQL (Structured Query Language):#* es un lenguaje estándar para la consulta y manipulación de la información de las bases de datos relacionales.

- Sentencias: 

* *SELECT* para consultas

* *INSERT* para inserciones

* *UPDATE* para modificaciones

* *DELETE* para borrados

a|
*Sentencia SELECT:*

[source, java]
....
SELECT ( ‘*’ \| <atributo > { ‘,’ <atributo> }* )
FROM  <tabla>
[ WHERE <condicion> ]
[ ORDER BY <atributo > { ‘,’ <atributo> }* (ASC\|DESC) ]
....

|===

[cols="50,50"]
|===

a|
*** Donde: 

**** la clausula SELECT indica la lista de atributos que se desea consultar o, alternativamente, ‘*’ para especificar todos los atributos;

**** la clausula FROM especifica la tabla en la que se encuentran los atributos consultados;

**** la clausula opcional WHERE especifica la condición de búsqueda (expresión lógica) con operandos constantes y/o atributos y operadores relacionales (‘<‘, ‘<=‘, ’>’, ‘>=‘, ’<>’, ’=‘) y/o lógicos (‘AND’, ‘OR’, ‘NOT’);

**** la clausula ORDER BY determina el orden ascendente o descendente de las tuplas seleccionadas

a|
** *Sentencia INSERT:* 

[source]
....
INSERT INTO <tabla> 
‘(‘ <atributo > { ‘,’ <atributo> }* ‘)’
VALUES ‘(‘ <valor> { ‘,’ <valor> }* ‘)’
....

a|
*** Donde: 

**** la tabla especificada alberga la tupla a insertar;

**** las listas de atributos y de valores, correlativas y de igual longitud, especifican los valores de la tupla insertada ; 

a|
** *Sentencia UPDATE:* 

[source]
....
UPDATE <tabla> 
SET <atributo >  ‘=’ <expresión> { ‘,’ <atributo >  ‘=’ <expresión> }* 
[ WHERE <condición> ]
....

a|
*** Donde: 

**** la tabla especificada alberga las tuplas a modificar;

**** los pares atributo/expresión especifican las modificaciones;

**** la clausula opcional WHERE especifica la condición de modificación (expresión lógica) con operandos constantes y/o atributos y operadores relacionales (‘<‘, ‘<=‘, ’>’, ‘>=‘, ’<>’, ’=‘) y/o lógicos (‘AND’, ‘OR’, ‘NOT’);

a|
** *Sentencia DELETE:*

[source]
....
DELETE FROM <tabla> 
[ WHERE <condicion> ]
....

2+a|
*** Donde: 

**** la tabla especificada alberga las tuplas a eliminar;

**** la clausula opcional WHERE especifica la condición de eliminación (expresión lógica) con operandos constantes y/o atributos y operadores relacionales (‘<‘, ‘<=‘, ’>’, ‘>=‘, ’<>’, ’=‘) y/o lógicos (‘AND’, ‘OR’, ‘NOT’);

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x11-programacionBasesDatos/3-JDBC.adoc ===== -->

## JDBC

[cols="30,35,35"]
|===

3+a|
- *[blue]#JDBC (Java Database Connectivity):#* es la tecnología que permite acceder a bases de datos relacionales desde aplicaciones Java. Está implementado en el paquete *java.sql*.

a|
- *[blue]#Carga del CONTROLADOR:#* para cargar e inicializar el controlador JDBC que permite operar con el sistema gestor de base de datos se usa el método *_forName()_* de la clase *_Class_*:

a|
[source, java]
....
public final class Class<T> {
  public static Class<?> forName(String className)
      throws ClassNotFoundException 
  …
}
....

a|
* Donde: 
** _className_ es el nombre de la clase del controlador

[source]
....
 (“org.apache.derby.jdbc.ClientDriver”)
....

** Basta con ejecutar el método una única vez en el programa

a|
- *[blue]#CONEXION:#* para conseguir la conexión de la aplicación Java al sistema gestor de base de datos se utiliza la clase *_DriverManager_*:

a|
[source, java]
....
public class DriverManager {
  public static Connection getConnection(String url, String user, String password)
     throws SQLException;
  …
}
....

a|
* Donde: 

** _url_ localiza la base de datos 

a|
[source] 
....
(“jdbc:derby://localhost:1527/bd”)
....

** _user_ y _password_ habilitan mecanismos de seguridad

|===

* [blue]#*Ejemplo:*# 

[source, java]
....
import java.sql.Connection;
import java.sql.DriverManager;
…
Class.forName("org.apache.derby.jdbc.ClientDriver");
…
Connection conexion = DriverManager.getConnection(
	"jdbc:derby://localhost:1527/bd", "app", "app");
....

[cols="50,50"]
|===

a|
- *[blue]#MANIPULACIÓN:#* para ejecutar cualquier sentencia de SQL se requiere obtener una sentencia, objeto de una clase que implementa el interfaz *_Statement_*, a través de la conexión sobre la que se desea ejecutar la sentencia:

a|
[source, java]
....
public interface Connection … {
  Statement createStatement() throws SQLException;
  …
}
public interface Statement … {
  int executeUpdate(String sql) throws SQLException;
  // para sentencias que no son consulta (INSERT, UPDATE, DELETE)
  ResultSet executeQuery(String sql) throws SQLException;
  // para sentencias que son consultas (SELECT)
  void close() throws SQLException;
  // libera los recursos asociados a la sentencia
  …
}
....
|===

[cols="50,50"]
|===

2+a|
*[blue]#Ejemplos:#* 

a|
[source, java]
....
…
// insertar una nueva nota con una línea con el texto
// 'otra linea'
Statement sentencia1 = conexion.createStatement();
sentencia1.executeUpdate(
	"INSERT INTO Nota (idNota) VALUES (4)");
…
Statement sentencia2 = conexion.createStatement();
sentencia2.executeUpdate(
	"INSERT INTO Linea (idLinea, idNota, texto)" +
	" VALUES (6, 4, 'otra linea')");
…  
// modificación de la persona Luis con idContacto = 2
// con el correo luis@empresa.com
Statement sentencia3 = conexion.createStatement();
sentencia3.executeUpdate(
	"UPDATE Persona SET correo = 'luis@empresa.com'" +
	" WHERE idContacto = 2");
public interface ResultSet … {
  boolean next() throws SQLException;
// avanza a la siguiente tupla del resultado de la consulta devolviendo cierto si
// existe
  
int getInt(String atributo) throws SQLException;
String getString(String atributo) throws SQLException;
…
// obtienen según el tipo el valor del atributo correspondiente a la tupla actual
 
void close() throws SQLException;
// libera los recursos asociados al resultado
…
}
....

a|
[source, java]
....
…
  // nombres de contactos del directorio Rectorado
  // con idDirectorioPadre = 7
Statement sentencia4 = conexion.createStatement();
ResultSet iterador = sentencia4.executeQuery(
	"SELECT nombre FROM Contacto" + 
	" WHERE idDirectorioPadre = 7");
while (iterador.next()) {
  System.out.println(iterador.getString("nombre"));
}
…
....

|===


[cols="33,33,33"]
|===

a|
- *[blue]#DESCONEXION:#* para conseguir la desconexión de la aplicación Java del sistema gestor de base de datos se utiliza el interfaz

a|
* *_Connection:_*

[source, java]
....
public interface Connection … {
  void close() throws SQLException;
  …
}
....

a|
* *[blue]#Ejemplo:#*

[source, java]
....
…
conexion.close();
…
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/0-index.adoc ===== -->

## 12-Programación Web

- _Presentar los conceptos básicos de la programación de aplicaciones en servidores Web mediante el uso de_ *_servlets_* _y_ *_JSPs_*

include::1-introduccion.adoc[]
include::2-aplicacionesMulticapa.adoc[]
include::3-servlets.adoc[]
include::4-JSPs.adoc[]
include::5-gestionNavegacion.adoc[]
include::6-gestionDatos.adoc[]
include::7-MVC-Servlets-JSP.adoc[]








<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/1-introduccion.adoc ===== -->

## Introducción

[cols="40,60"]
|===

a|
-  Las aplicaciones basadas en Web son aplicaciones que se ejecutan en un servidor Web y que se encargan de generar páginas para los navegadores Web que se ejecutan en las máquinas de los clientes.

image:intercambiarInformacion.png[]


- El Protocolo de Transferencia de Hipertexto (HTTP) permite a los clientes y servidores intercambiar información de una manera uniforme y segura.
a|
- HTTP utiliza los URLs (Localizadores Uniformes de Recursos) para especificar la ubicación de archivos o directorios, y también pueden hacer referencia a objetos que realicen tareas complejas.

- Cuando un navegador Web solicita un recurso a un servidor Web, realiza una transacción HTTP para obtener y mostrar la página Web que se encuentra en una dirección URL.

- Para solicitar el recurso, el cliente puede usar los métodos GET o POST de HTTP.

- En su forma más simple, una página Web no es nada más que un documento HTML que contiene “marcas” que describen al navegador Web cómo mostrar la información del documento.

- Los documentos HTML pueden contener datos de hipertexto (hipervínculos) que vinculan a otras páginas, o a otras partes de la misma página.

|===

 


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/2-aplicacionesMulticapa.adoc ===== -->

## Aplicaciones Multicapa

[cols="40,60"]
|===

a|
- Las aplicaciones basadas en Web son aplicaciones que dividen su funcionalidad en varios niveles que, por lo general, residen en computadores separados.

image::aplicacionMulticapa.png[]

- El nivel inferior (o nivel de datos) almacena los datos de la aplicación. Por lo general, en un sistema de administración de bases de datos relacionales (RDBMS).

a|
- El nivel intermedio implementa la lógica de negocio, tanto de control como de presentación, para controlar las interacciones
entre los clientes de la aplicación y sus datos. 

- La lógica de control del nivel intermedio procesa las peticiones de los clientes y obtiene los datos de la base de datos.
 La lógica de presentación del nivel intermedio procesa los datos del nivel de datos y presenta el contenido al cliente en forma de documentos HTML.

- La lógica en el nivel intermedio asegura que los datos sean correctos antes de actualizar la base de datos, o presentar los datos a los usuarios.

- El nivel superior (nivel del cliente) es la interfaz de usuario de la aplicación, la cual recopila los datos de entrada y de salida. Los usuarios interactúan con el nivel intermedio a través del navegador Web.

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/3-servlets.adoc ===== -->

## Servlets

[cols="50,50"]
|===

a|
- Los *_servlets_* son objetos del lenguaje Java que se usan para ampliar las capacidades de los servidores Web, principalmente para la generación de contenido dinámico.

- Los paquetes _javax.servlet_ y _javax.servlet.http_ proporcionan los interfaces y las clases para escribir servlets.

- Todos los servlets deben implementar el interfaz _Servlet_ que define los métodos del ciclo de vida de los servlets.

- El ciclo de vida de un servlet empieza cuando el contenedor de servlets del servidor Web lo carga en memoria; por lo general, en respuesta a la primera petición del servlet.

- El contenedor de servlets del servidor Web invoca al método _init_ del servlet, el cual se llama sólo una vez durante el ciclo de vida de un servlet para inicializarlo. Una vez que _init_ termina su ejecución, el servlet está listo para responder a su primera petición.
a|
- El contenedor de servlets del servidor Web recibe las peticiones (normalmente HTTP) de los clientes y dirige cada petición al servlet apropiado. El servlet procesa la petición y devuelve una respuesta apropiada al cliente (normalmente en forma de un documento HTML).

- Todas las peticiones se gestionan mediante el método _service_ de un servlet, el cual recibe la petición, la procesa y envía la respuesta al cliente. Se hace una llamada al método service por cada petición.

- Cuando el contenedor de servlets termina el servlet, hace una llamada al método _destroy_ del servlet para liberar los recursos que éste ocupando.

- La clase _HttpServlet_ proporciona los métodos _doGet_ and _doPost_ para gestionar las peticiones HTTP.

|===


[cols="30,70"]
|===

a|
- Para definir un servlet HTTP hay que crear una clase que herede de la clase _HttpServlet_ de _javax.servlet.http_ y redefinir los métodos _init_, _destroy_, _doGet_ y/o _doPost_ (sólo aquéllos que sean necesarios).

a|
[source, java]
....

public abstract class HttpServlet extends GenericServlet implements java.io.Serializable {
  …
  public void init() throws ServletException;

  public void destroy();

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException;

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException;
  …
}
....
|===

[cols="30,70"]
|===

a|
- Para obtener el flujo de salida para escribir el documento HTML de respuesta se debe usar el método _getWriter_ del interfaz _HttpServletResponse_.

a|
[source, java]
....
public interface HttpServletResponse extends ServletResponse {
  …
  public PrintWriter getWriter() throws IOException;
  …
  public void sendRedirect(String location) throws IOException;
  public void sendError(int code, String msg) throws IOException;
  …
}
....
|===

[cols="25,75"]
|===

a|
- Para obtener los parámetros de una petición HTTP se debe invocar el método _getParameter_ del interfaz _HttpServletRequest_.

a|
[source, java]
....
public interface HttpServletRequest extends ServletRequest {
  …
  public String getParameter(String name);
  …
  public Object getAttribute(String name);
  public void setAttribute(String name, Object value);
  …
  public HttpSession getSession() ;
  …
  public String getRemoteAddr();
  public int getRemotePort();
  …
  public String getHeader(String name) ;
  public String getQueryString();
  …
}
....
|===

[cols="45,55"]
|===

a|
- Una sesión HTTP representa un conjunto de atributos que definen  el estado de un conjunto de peticiones sucesivas del mismo cliente. 

- Para obtener y/o modificar los atributos de una sesión HTTP se debe invocar los métodos _getAttribute_ y/o _setAttribute_ del interfaz _HttpSession_.

a|
[source, java]
....

public interface HttpSession  {
  …
  public Object getAttribute(String name);
  public void setAttribute(String name, Object value);
  …
}
....
|===

[cols="60,40"]
|===

2+a|
* *[blue]#Ejemplo: index.html#*

a|
[source, html]
....
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>Ejemplo Servlet</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <h1>Ejemplo Servlet</h1>

    <a href="EjemploServlet?origen=1">Entra directamente</a>
    <br>
    <br>
    <form method="get" action="EjemploServlet">
      <b>Nombre:</b>
      <input type="text" name="nombre" size="25" value="">
      <input type="hidden" name="origen" value="2">
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
....

^.^a|
image:servlet.png[]

|===

[cols="50,50"]
|===

2+a|
* *[blue]#Ejemplo: EjemploServlet.java#*

a|
[source, java]
....
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EjemploServlet extends HttpServlet {

  private int vecesTotal = 1000;

  public void init() throws ServletException {
    System.out.println(
        "----------------- SE INICIA EL SERVLET -----------------");
    vecesTotal = 0;
  }

  public void destroy() {
    System.out.println(
        "---------------- SE DESTRUYE EL SERVLET ----------------");
  }
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response) throws ServletException,
                                           IOException {
    this.processRequest(request, response);
  }

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException,
                                           IOException {
    this.processRequest(request, response);
  }

  public String getServletInfo() {
    return "EjemploServlet";
  }
....

a|
[source,java]
....
  protected void processRequest(HttpServletRequest request,
      HttpServletResponse response) throws ServletException,
                                           IOException {
    vecesTotal++;
    HttpSession session = request.getSession();
    Integer vecesSesion = (Integer) session.getAttribute("veces");
    if (vecesSesion == null) {
      vecesSesion = new Integer(1);
    } else {
      vecesSesion = vecesSesion + 1;
    }
    session.setAttribute("veces", vecesSesion);

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet EjemploServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet EjemploServlet at " +
          request.getContextPath() + "</h1>");
      int origen = Integer.parseInt(request.getParameter("origen"));
      if (origen == 1) {
        out.println("<b>Has pinchado en el enlace</b>");
      } else {
        out.println(
            "<b>Has pinchado en el formulario con el nombre " +
            "<font color=\"red\">" +
            request.getParameter("nombre") +
            "</font></b>");
      }
      out.println("<br><br>");
      out.println("Es la " + vecesSesion +
          "ª vez que se usa el servlet en esta sesi&oacute;n");
      out.println("<br><br>");
      out.println("Es la " + vecesTotal +
          "ª vez que se usa el servlet en total");
      out.println("</body>");
      out.println("</html>");
    } finally {
      out.close();
    }
  }
}
....
|===


[cols="50,50", grid=none, frame=none]
|===

^.^a|
image:servlets.png[]

^.^a|
image:servlets2.png[]

|===








<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/4-JSPs.adoc ===== -->

## JSPs

[cols="50,50"]
|===

a|
- La tecnología *_JavaServer Pages (JSP)_* es una extensión de la tecnología de los servlets que permite crear fácilmente contenidos Web con componentes tanto estáticos como dinámicos.

- Las JSPs poseen todas las capacidades dinámicas de los servlets pero proporcionan una manera más natural para crear el contenido estático y para separar el contenido de las páginas y su presentación.
a|
- Cuando un servidor habilitado para JSPs recibe la primera petición para una JSP, el contenedor de JSPs traduce esa JSP en un servlet, el cual maneja todas las peticiones a esa JSP.

- Las JSPs se basan en el mismo mecanismo de petición-respuesta que los servlets para procesar las peticiones de los clientes, y enviar las respuestas. 

|===

[cols="50,50"]
|===

2+a|
- *[blue]#Contenido estático:#*

a|
* En una página JSP se puede escribir contenido estático de la misma forma que se escribe una página sólo con ese contenido, bien manualmente o con herramientas de construcción de páginas.

* El formato por defecto es HTML, pero se pueden usar otros como XML o WML, simplemente usando la siguiente directiva JSP: 

a|
[source, html]
....
<%@ page contentType="text/vnd.wap.wml"%>
....

* Todo el contenido estático de la página JSP es enviado por el servlet generado al cliente.

* Si el código estático contiene *<%* debe especificarse mediante *<\%*

|===

[cols="50,50"]
|===

2+a|
- *[blue]#Elementos de scripting:#*

a|
* Los elementos de scripting permiten incrustar código Java en el servlet generado a partir de la página JSP.
a|
* Si se desea usar el código %> dentro de un elemento hay que susituirlo por %\>
2+a|
* Hay tres tipos de elementos:
a|
** *[blue]#Declaraciones:#* Se usan para definir atributos o métodos fuera del método _service_ del _servlet_ generado.
a|
[source, java]
....
<%! declaraciones Java %>
<jsp:declaration> declaraciones Java </jsp:declaration >
....

[source, java]
....
<%! private int vecesTotal = 0; %>
....
a|
- *[blue]#Expresiones:#* Se usan para insertar valores en la salida.
a|
[source, java]
....
<%= expresion Java %>
<jsp:expression> expresion Java </jsp:expression>
....

[source]
....
Es la <%= vecesTotal %>ª vez que se usa el servlet en total
....
a|
- *[blue]#Scriptlets:#* Se usan para insertar cualquier código Java.
a|
[source, java]
....
<% codigo Java %>
<jsp:scriptlet> codigo Java </jsp:scriptlet>
....

[source, java]
....
<%
  vecesTotal++;
  ...
  if (vecesSesion == null) {
    vecesSesion = new Integer(1);
  } else {
    vecesSesion = vecesSesion + 1;
  }
%>
....
|===

[cols="50,50"]
|===

2+a|
- *[blue]#Directivas JSP:#*
a|
* Una directiva JSP afecta a toda la estructura del servlet. Tiene la siguiente sintaxis:
a|
[source, java]
....
<%@ tipoDirectiva atributo=“valor” %>
<jsp:directive.tipoDirectiva atributo=“valor” />
....
a|
* La directiva _page_ permite definir un conjunto de atributos tales como el tipo de contenido, codificación de caracteres, importación de clases, modos de sincronización multihilo, etc.
a|
[source, java]
....
<%@ page import="java.util.*" %>
....
a|
* La directiva _include_ permite incluir otros ficheros cuando la página se traduce al servlet:
a|
[source, java]
....
<%@ include file="otra.jsp" %> 
....
|===

[cols="50,50"]
|===

2+a|
- *[blue]#Acciones JSP:#*

a|
* Las acciones JSP se usan para controlar el comportamiento del motor de _servlets_. Tienen la sintaxis de construcciones XML.

* La acción _include_ permite incluir otros ficheros cada vez que se presenta la página:
a|
[source, java]
....
<jsp:include page="otra.jsp" flush="true" />
....

a|
* La _acción forward_ redirige la petición a otra página:

a|
[source, java]
....
<jsp:forward page="WebAgenda">
  <jsp:param name="opcion" value="abrir" />
</jsp:forward>
....

|===

[cols="60,40", options="header"]
|===

a|
*[blue]#Comentarios:#*
a|
*[blue]#Variables predefinidas:#*

a|
[source]
....
<%-- Este comentario no se envía a la página del cliente --%>
....

a|
** _request_
** _response_
** _out_
** _session_
** _application_
** …

|===

[cols="50,50"]
|===

2+a|
*[red]#Ejemplo: index.html#*

a|
[source, html]
....
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <title>Ejemplo JSP</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <h1>Ejemplo JSP</h1>

    <a href="EjemploJSP.jsp?origen=1">Entra directamente</a>
    <br>
    <br>
    <form method="get" action="EjemploJSP.jsp">
      <b>Nombre:</b>
      <input type="text" name="nombre" size="25" value="">
      <input type="hidden" name="origen" value="2">
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
....

^.^a|
image:jsp.png[]

|===

[cols="50,50"]
|===

2+a|
*[blue]#Ejemplo: EjemploJSP.jsp#*

a|
[source, html]
....
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP EjemploJSP</title>
  </head>
  <body>
    <%! private int vecesTotal = 0; %>
<%
    vecesTotal++;

    Integer vecesSesion = (Integer) session.getAttribute("veces");
    if (vecesSesion == null) {
      vecesSesion = new Integer(1);
    } else {
      vecesSesion = vecesSesion + 1;
    }
    session.setAttribute("veces", vecesSesion);
%>
....

a|
[source,html]
....
    <h1>JSP EjemploJSP at <%= request.getContextPath() %> </h1>
<%
    int origen = Integer.parseInt(request.getParameter("origen"));
    if (origen == 1) {
%>
      <b>Has pinchado en el enlace</b>
<%
    } else {
%>
      <b>Has pinchado en el formulario con el nombre
        <font color="red">
          <%= request.getParameter("nombre") %>
        </font>
      </b>
<%
    }
%>
    <br><br>
    Es la <%= vecesSesion %>ª vez que se usa la JSP
    en esta sesi&oacute;n
    <br><br>
    Es la <%= vecesTotal %>ª vez que se usa la JSP en total
  </body>
</html>
....
|===

[cols="50,50", grid=none, frame=none]
|===

^.^a|
image:jsps.png[]
^.^a|
image:jsps2.png[]

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/5-gestionNavegacion.adoc ===== -->

## Gestión de navegación

[cols="30,70"]
|===

a|
-  Para hacer una petición desde un navegador web a un servlet o a una JSP se usan los elementos de marcado de HTML.

a|
* *[blue]#Ejemplo:#*

[source]
....
  <!-- Para servlets -->

  <a href="Servlet">Entrar</a>

  <form method="get" action="Servlet">
    <input type="submit" value="Entrar">
  </form>

  <!-- Para JSPs -->

  <a href="JSP.jsp">Entrar</a>

  <form method="get" action="JSP.jsp">
    <input type="submit" value="Entrar">
  </form>

....

a|
* Para invocar desde un servlet a otro servlet o a una JSP, se pueden usar dos técnicas alternativas.

* La primera es redirigir la petición usando el método forward del interfaz _RequestDispatcher_.

a|
[source, java]
....
public interface HttpServletRequest extends ServletRequest {
  …
  public RequestDispatcher getRequestDispatcher(path);
}

public interface RequestDispatcher {
  …
  public void forward(ServletRequest request, ServletResponse response)
      throws ServletException, IOException;
}
....

* *[blue]#Ejemplo:#*

[source, java]
....
request.getRequestDispatcher("Servlet").forward(request, response);
request.getRequestDispatcher("JSP.jsp").forward(request, response);
....

a|
* La segunda técnica es responder al navegador web del cliente para que haga una nueva petición, usando el método _sendRedirect_ del interfaz _HttpServletResponse_.

a|
[source, java]
....
public interface HttpServletResponse extends ServletResponse {
  …
  public void sendRedirect(String location) throws IOException;
}
....

* *[blue]#Ejemplo:#*

[source, java]
....
  response.sendRedirect("Servlet");

  response.sendRedirect("JSP.jsp");
....

a|
*  Para invocar desde una JSP a un servlet o a otra JSP, se pueden usar las mismas dos técnicas alternativas usadas para los servlets desde el código de un scriptlet.

* Además, se puede usar la acción forward para redirigir la petición a otro servlet o JSP.  

a|
* *[blue]#Ejemplo:#*

[source, java]
....
<jsp:forward page="Servlet" />

<jsp:forward page="JSP.jsp" />
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/6-gestionDatos.adoc ===== -->

## Gestión de datos

[cols="33,33,33"]
|===

3+a|
- Los servlets y las JSPs proporcionan varios objetos que pueden almacenar datos. Dependiendo del tiempo de persistencia de esos datos, se distingue entre:

a|
** *_[blue]#Datos de la petición:#_* Persisten únicamente durante el tiempo que dura una petición.

a|
** *_[blue]#Datos de la sesión:#_* Persisten durante el tiempo que dura una sesión.

a|
** *_[blue]#Datos de la aplicación:#_* Persisten durante toda la vida de la aplicación web.

|===

[cols="35,65"]
|===

a|
- Para guardar y recuperar los datos de la petición se usa el interfaz _HttpServletRequest_.

a|
[source, java]
....
public interface HttpServletRequest extends ServletRequest {
  …
  public String getParameter(String name);
  …
  public Object getAttribute(String name);
  public void setAttribute(String name, Object value);
  …
}
....

a|
* Para guardar y recuperar los datos de la sesión se usa el interfaz _HttpSession_.

a|
[source, java]
....
public interface HttpServletRequest extends ServletRequest {
  …
  public HttpSession getSession() ;
  …
}
....
[source, java]
....
public interface HttpSession  {
  …
  public Object getAttribute(String name);
  public void setAttribute(String name, Object value);
  …
}
....

a|
* Para guardar y recuperar los datos de la aplicación se usa el interfaz _ServletContext_.

a|
[source, java]
....
public abstract class GenericServlet implements Servlet, ServletConfig, Serializable {
  …
   public ServletContext getServletContext() ;
  …
}

public abstract class HttpServlet extends GenericServlet implements Serializable {  …
}
....

[source, java]
....
public interface ServletContext {
  …
  public Object getAttribute(String name);
  public void setAttribute(String name, Object value);
  …
}
....
|===


[cols="50,50"]
|===

a|
* Para pasar datos en una petición desde un navegador web a un servlet o a una JSP se usan los elementos de marcado de HTML. Estos datos sólo pueden ser *cadenas de caracteres*, que se envían como *parámetros* de la petición.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  <!-- Para servlets -->

  <a href="Servlet?nombre1=valor1&nombre2=valor2">Entrar</a>

  <form method="get" action="Servlet">
    <b>Nombre:</b>
    <input type="text" name="nombre" size="25" value="">
    <input type="hidden" name="origen" value="2">
    <input type="submit" value="Entrar">
  </form>

  <!– Igual para JSPs -->
....

a|
* Para pasar *cadenas de caracteres* en la invocación desde un servlet a otro servlet o a una JSP, se pueden usar los *parámetros* de la petición.

* Si se usa el método _forward_ del interfaz _RequestDispatcher_.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  request.getRequestDispatcher(
    "Servlet?nombre1=valor1&nombre2=valor2").forward(
      request, response);

  // Igual para JSPs
....

a|
* Si se usa el método _sendRedirect_ del interfaz _HttpServletResponse_.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  response.sendRedirect("Servlet?nombre1=valor1&nombre2=valor2");

  // Igual para JSPs
....

a|
* Los *parámetros* de la petición pueden obtenerse desde un servlet o de una JSP mediante el método _getParameter_ del interfaz _HttpServletRequest_.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  // Igual para servlets y JSPs
  String valor1 = request.getParameter("nombre1");
....

a|
* Para pasar *objetos* en la invocación desde un servlet a otro servlet o a una JSP, se pueden usar los *atributos de la petición*, si se usa el método _forward_ del interfaz _RequestDispatcher_.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  request.setAttribute("nombre1", objeto1);
  request.getRequestDispatcher("Servlet").forward(request, response);

  // Igual para JSPs
....

a|
* Si se usa el método _sendRedirect_ del interfaz _HttpServletResponse_, no se pueden pasar objetos por los atributos de la petición, porque se fuerza a que se realice una nueva petición desde el cliente, por lo que deben usarse los *atributos de la sesión*.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  request.getSession.setAttribute("nombre1", objeto1);
    response.sendRedirect("Servlet");

    // Igual para JSPs
....

a|
* Los *atributos de la petición* pueden obtenerse desde un servlet o de un JSP mediante el método _getAttribute_ del interfaz _HttpServletRequest_.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  // Igual para servlets y JSPs
  Clase1 objeto1 = (Clase1) request.getAttribute("nombre1");
....

a|
* Los *atributos de la sesión* pueden obtenerse desde un servlet o de un JSP mediante el método _getAttribute_ del interfaz _HttpSession_.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  // Igual para servlets y JSPs
  Clase1 objeto1 = (Clase1)
      request.getSession().getAttribute("nombre1");

  // Solo para JSPs
  Clase1 objeto1 = (Clase1) session.getAttribute("nombre1");
....

a|
* Los *atributos de la aplicación* pueden guardarse y recuperarse desde un servlet o de una JSP mediante los métodos _getAttribute_ y _setAttribute_ del interfaz _ServletContext_.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
  this.getServletContext().setAttribute("nombre1”, objeto1);

  Clase1 objeto1 = (Clase1) this.getServletContext().
      getAttribute("nombre1");
....

a|
* Además, desde el código de un scriptlet de una JSP se dispone del objeto predefinido application para guardar y recuperar los datos de la aplicación.

a|
* *[blue]#Ejemplo:#*

[source, java]
....
application.setAttribute("nombre1", objeto1);

  Clase1 objeto1 = (Clase1) application.getAttribute("nombre1");
....

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x12-programacionWeb/7-MVC-Servlets-JSP.adoc ===== -->

## MVC con Servlets y JSPs

[cols="40,60"]
|===

a|
- Las aplicaciones basadas en Web suelen estar basadas en el patrón arquitectónico MVC, para dividir su funcionalidad entre la gestión de los datos, la lógica de presentación y la lógica de control.

image:MVC.png[]

a|
* El cliente, mediante un navegador web, realiza una petición HTTP a un servlet que desempeña el papel de controlador.

* El servlet selecciona el modelo y la vista adecuada para esa petición, y redirige la petición a una JSP, que hace el papel de vista, pasándole como atributo el modelo seleccionado.

* Finalmente el JSP se encarga de devolver al cliente el código HTML correspondiente, a partir de los datos del modelo.

|===

[cols="2"]
|===

2+a|
* *[blue]#Ejemplo: index.jsp#*

a|
[source, java]
....

<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <title>Ejemplo MVC</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <h1>Ejemplo MVC</h1>

    <form method="get" action="CVerPersona">
      <b>Nombre:</b>
      <input type="text" name="nombre" size="25" value="">
      <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
....

^.^a|
image:MVC2.png[]

|===

[cols="35,65", options="header"]
|===

a|
* *[blue]#Ejemplo: MPersona.java#*
a|
* *[blue]#Ejemplo: CVerPersona.java#*

a|
[source, java]
....
package pooa.modelos;

public class MPersona {

  private String nombre;
  private String dni;
  private int edad;

  public MPersona(String nombre, String dni, int edad) {
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDNI() {
    return dni;
  }

  public int getEdad() {
    return edad;
  }
}
....

a|
[source, java]
....
package pooa.servlets;
…
public class CVerPersona extends HttpServlet {

  private Map<String, MPersona> mapaPersonas;

  public void init() throws ServletException {
    mapaPersonas = new HashMap<String, MPersona>();
    MPersona pepe = new MPersona("pepe", "10305070A", 25);
    mapaPersonas.put(pepe.getNombre(), pepe);
    MPersona juan = new MPersona("juan", "20406080B", 45);
    mapaPersonas.put(juan.getNombre(), juan);
    MPersona rosa = new MPersona("rosa", "30507090C", 15);
    mapaPersonas.put(rosa.getNombre(), rosa);
  }

  public void destroy() {
  }
  protected void doGet(HttpServletRequest request,
      HttpServletResponse response) throws ServletException,
                                           IOException {
    this.processRequest(request, response);
  }

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException,
                                           IOException {
    this.processRequest(request, response);
  }

  public String getServletInfo() {
    return "Controlador CVerPersona";
  }
  protected void processRequest(HttpServletRequest request,
      HttpServletResponse response) throws ServletException,
                                           IOException {
    String nombre = request.getParameter("nombre");
    MPersona mPersona = mapaPersonas.get(nombre);
    if (mPersona != null) {
      request.setAttribute("mPersona", mPersona);
      request.getRequestDispatcher("VPersona.jsp").forward(
          request, response);
    } else {
      request.setAttribute("mensaje",
          "No existe la persona '" + nombre + "'");
      request.getRequestDispatcher("DError.jsp").forward(
          request, response);
    }
  }
}
....

|===

[cols="50,50"]
|===

2+a|
* *[blue]#Ejemplo: VPersona.jsp#*

a|
[source, html]
....
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<%@ page import="pooa.modelos.MPersona" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Vista Persona</title>
  </head>
  <body>
    <h1>Vista Persona</h1>
<%
    MPersona mPersona = (MPersona) request.getAttribute("mPersona");
%>
    <br>Nombre = <%= mPersona.getNombre() %>
    <br>DNI    = <%= mPersona.getDNI()    %>
    <br>Edad   = <%= mPersona.getEdad()   %>
     <br>
    <br><a href="index.jsp">Volver</a>
   </body>
</html>
....

^.^a|
image:MVC3.png[]

|===

[cols="50,50"]
|===

2+a|
* *[blue]#Ejemplo: DError.jsp#*

a|
[source, html]
....
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ERROR</title>
  </head>
  <body>
    <h1>ERROR</h1>

<%
    String mensaje = (String) request.getAttribute("mensaje");
%>
    <%= mensaje %>
    <br>
    <br><a href="index.jsp">Volver</a>
  </body>
</html>

....

^.^a|
image:errorMVC.png[]

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/0-index.adoc ===== -->

## 13-Programación Distribuida

- _Presentar los conceptos básicos de la programación de aplicaciones distribuidas en Java mediante el uso de_ *_RMI_*


include::1-aplicacionesDistribuidas.adoc[]
include::2-RMI/0-index.adoc[]
include::3-definicionInterfaces/0-index.adoc[]
include::4-implementacionObjetosRemotos/0-index.adoc[]
include::5-implementacionCliente.adoc[]
include::6-serializacionObjetosRemoto.adoc[]





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/1-aplicacionesDistribuidas.adoc ===== -->

## Aplicaciones Distribuidas

[cols="50,50"]
|===

a|
- Las aplicaciones de objetos distribuidos son aplicaciones cuyos objetos pueden ejecutarse en computadores diferentes, conectados entre ellos a través de una red de comunicaciones.

image:objetosDistribuidos.png[]

a|
- En el caso más simple, una aplicación distribuida se compone de un objeto cliente que envía un mensaje para ejecutar un cierto método a otro objeto servidor que puede ejecutarse en una máquina remota.

- A este tipo de objetos que se ejecutan en una máquina distinta de la del cliente se les denomina *_objetos remotos_*.

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/2-RMI/0-index.adoc ===== -->

## RMI

[cols="50,50"]
|===

a|
- *[blue]#RMI#* (*_[blue]#Remote Method Invocation#_*) es una tecnología de Java que proporciona los mecanismos necesarios para que objetos que se ejecutan en máquinas JVM distintas (posiblemente en distintos computadores) puedan intercambiar información entre ellos.

- Para que un objeto cliente en una máquina local pueda interactuar con un objeto servidor remoto es necesario:

* Obtener una referencia del objeto remoto.

* Invocar un método sobre el objeto remoto.

- Una característica esencial de RMI es que permite realizar ambas tareas de manera transparente para el programador,  que puede programar el objeto cliente de la misma manera que si el objeto remoto estuviera ubicado en la máquina local.

a|
- La idea que subyace en RMI para lograr que el objeto cliente invoque un método sobre un objeto remoto de la misma manera que si éste fuera local consiste en utilizar un proxy del objeto servidor en el lado del cliente (lo que se llama *_stub_*).

- El cliente invoca el método sobre el proxy como si se tratara del objeto remoto, y el proxy se encarga de codificar y enviar por la red la información del método a ejecutar y sus argumentos (lo que se llama *_marshalling_*).

- Para conseguir que el programador del objeto servidor remoto lo haga de la misma manera que si éste fuera local, la solución consiste en instalar otro proxy en el lado del servidor (*_skeleton_*).

- El proxy del servidor recibe y decodifica la información del método y sus argumentos (*_unmarshalling_*), invoca el método del objeto servidor y codifica y envía el valor devuelto por el método al proxy del cliente.

|===

[cols="50,50", grid=none, frame=none]
|===

^.^a|
include::diagramaRMI.adoc[]

[red]#LUIS REVISA EL DIAGRAMA#

a|
- Para crear una aplicación distribuida con RMI se deben seguir los siguientes pasos:

* Definir los interfaces remotos.

* Implementar los objetos remotos.

* Implementar los clientes.

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/2-RMI/diagramaRMI.adoc ===== -->

[plantuml, RMI, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam sequence {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
}
skinparam participant {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
}
skinparam sequence {
LifeLineBorderColor DarkGray
LifeLineBackgroundColor #222222
BoxBorderColor #DarkGray
BoxBackgroundColor #222222
BoxFontColor #DarkGray
}
hide stereotype

box Cliente
participant Cliente 
participant "Servidor Stub" as servidorStub
end box
Cliente -> servidorStub :Invocar al stub
activate Cliente #DarkGrey
activate servidorStub #DarkGrey

box Servidor
participant "Servidor Skeleton" as servidorSkeleton
participant Servidor
end box
servidorStub -> servidorSkeleton : Enviar datos del metodo
activate servidorStub #DarkGrey
activate servidorSkeleton #DarkGrey

servidorSkeleton -> Servidor :Invocar al servidor
activate servidorSkeleton #DarkGrey
activate Servidor #DarkGrey

Servidor --> servidorSkeleton : Devolver resultado
deactivate Servidor
servidorSkeleton --> servidorStub :Enviar resultado del metodo
deactivate servidorSkeleton
servidorStub --> Cliente :Devolver resultado
deactivate servidorStub
....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/3-definicionInterfaces/0-index.adoc ===== -->

## Definición de interfaces

[cols="35,65"]
|===

a|
- Un interfaz remoto declara los métodos que pueden invocarse desde el cliente sobre los objetos servidores remotos.

- Un interfaz remoto debe extender el interfaz java.rmi.Remote.

[source, java]
....
public interface Remote {
}
....

a|
- Todos los métodos del interfaz deben declarar que elevan la excepción _java.rmi.RemoteException_.

- Si un método declara un argumento o valor devuelto que NO implementa el interfaz _Remote_, entonces ese argumento es serializado durante las llamadas al método remoto.

- Si un método declara un argumento o valor devuelto que SI implementa el interfaz _Remote_, entonces se serializa el stub del objeto durante las llamadas al método remoto, no el propio objeto remoto.

|===

[cols="10,40,50", grid=none, frame=none]
|===

a|
*[blue]#Ejemplo:#*

*Local*
a|
include::diagramaLocal.adoc[]

.2+a|
[source, java]
....
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Escuela extends Remote {

	Profesor getProfesor(String nombre) throws RemoteException;
}
....

a|
*[blue]#Ejemplo:#*

*Remoto*
a|
include::diagramaRemoto.adoc[]


|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/3-definicionInterfaces/diagramaLocal.adoc ===== -->

[plantuml, Local, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BorderColor<<yellow>> #FFD700
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
    FontColor<<yellow>> #FFD700
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
hide stereotype

class "Cliente Escuela" as clienteEscuela {
+ getProfesor(nombre : String) : Profesor
}

class Escuela {
+ getProfesor(nombre : String) : Profesor
}

class Profesor {
- nombre :String
- asignaturas : String[*]
}

clienteEscuela -right-> Escuela
Escuela o-down-> Profesor
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/3-definicionInterfaces/diagramaRemoto.adoc ===== -->

[plantuml, Remoto, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BorderColor<<yellow>> #FFD700
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
    FontColor<<yellow>> #FFD700
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
hide stereotype

class "Cliente Escuela" as clienteEscuela {
+ getProfesor(nombre : String) : Profesor
}

interface Escuela {
+ getProfesor(nombre : String) : Profesor
}

interface Remote {
(java.rmi)
}

clienteEscuela -right-> Escuela
Remote <\|-down- Escuela

....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/4-implementacionObjetosRemotos/0-index.adoc ===== -->

## Implementación de objetos remotos

[cols="50,50"]
|===

a|
- Las clases de los objetos remotos deben implementar uno o varios interfaces remotos.

- Si se usan otras clases en los argumentos o valores devueltos de sus métodos, éstas también deben implementarse.

- La manera más sencilla de definir las clases de los objetos remotos consiste en extender de la clase _java.rmi.UnicastRemoteObject_.

a|
[source, java]
....
public class UnicastRemoteObject  extends RemoteServer {
  …
  protected UnicastRemoteObject() throws RemoteException; 
  protected UnicastRemoteObject(int port) throws RemoteException;
  public static Remote exportObject(Remote obj, int port) throws RemoteException;
  public static boolean unexportObject(Remote obj, boolean force)
    throws NoSuchObjectException;
  …
}
....
|===

[cols="10,40,50", grid=none, frame=none]
|===

^.^a|
*[blue]#Ejemplo:#*

*Remoto*
.2+^.^a|
include::diagramaImplementacion.adoc[]

a|
[source, java]
....
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
…

public class EscuelaRemota extends UnicastRemoteObject
    implements Escuela {

  …

  public EscuelaRemota() throws RemoteException {
    // Lanza un hilo para esperar invocaciones remotas 
    super();
    …
  }
....
|===

[cols="35,65"]
|===

a|
- Otra posibilidad para definir las clases de los objetos remotos consiste en usar el método estático _exportObject_ de la clase _java.rmi.UnicastRemoteObject_.

- Esto es necesario si la clase de los objetos remotos extendiera alguna otra clase.

a|
[source, java]
....
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
…

public class EscuelaRemota implements Escuela {

  …

  public EscuelaRemota() throws RemoteException {
    // Lanza un hilo para esperar invocaciones remotas        
    UnicastRemoteObject.exportObject(this, 0);
    …
  }
....

a|
- Los objetos remotos pueden usar un servicio de registro para poder ser localizados por los clientes, proporcionado por el programa _rmiregistry_ de la JRE.

- Para ello se dispone de la clase _java.rmi.registry.LocateRegistry_ y del interfaz _java.rmi.registry.Registry_.

a|
[source, java]
....
public final class LocateRegistry {
  …
  public static Registry getRegistry() throws RemoteException;
  public static Registry getRegistry(int port) throws RemoteException; 
  public static Registry getRegistry(String host) throws RemoteException;
  public static Registry getRegistry(String host, int port) throws RemoteException;
  …
}
....

a|
- Si no se especifica el host, se considera _localhost_.

- Si no se especifica el puerto, se toma por defecto el puerto 1099-

a|
[source, java]
....

public interface Registry extends Remote {
  …
  void bind(String name, Remote obj)
    throws RemoteException, AlreadyBoundException, AccessException;
  void rebind(String name, Remote obj)
    throws RemoteException, AccessException;
   void unbind(String name)
    throws RemoteException, NotBoundException, AccessException; 
  …
}
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
…

public class EscuelaRemota extends UnicastRemoteObject
    implements Escuela {

  private HashMap<String, Profesor> profesores;

  public EscuelaRemota() throws RemoteException {
    super();

    profesores = new LinkedHashMap<String, Profesor>();
    Profesor pepe = new Profesor("Pepe");
    pepe.setAsignatura("POO");
    pepe.setAsignatura("POOA");
    profesores.put("Pepe", pepe);
    Profesor juan = new Profesor("Juan");
    juan.setAsignatura("UML");
    profesores.put("Juan", juan);
  }

  public void iniciar() throws Exception {
    Registry registry = LocateRegistry.getRegistry("localhost", 2020);
    registry.rebind("EUI", this);
    System.out.println("EscuelaRemota::iniciar -> " +
        "Servidor registrado en //localhost:2020/EUI");
  }

  public void terminar() throws Exception {
    Registry registry = LocateRegistry.getRegistry("localhost", 2020);
    registry.unbind("EUI");
    UnicastRemoteObject.unexportObject(this, true);
  }

  public Profesor getProfesor(String nombre) throws RemoteException {
    Profesor profesor = profesores.get(nombre);
    System.out.println("EscuelaRemota::getProfesor -> " +
      profesor.getString());
    return profesor;
  }
}
import java.io.Serializable;
…

public class Profesor implements Serializable {

  private String nombre;
  private List<String> asignaturas;

  public Profesor(String nombre) {
    this.nombre = nombre;
    asignaturas = new ArrayList<String>();
  }

  public void setAsignatura(String asignatura) {
    asignaturas.add(asignatura);
  }

  public String getString(){
    String cadena = "Profesor: nombre = " + nombre +
        ", asignaturas = " + asignaturas;
    System.out.println("Profesor::getString -> " + cadena);
    return cadena;
  }
}
....

|===








<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/4-implementacionObjetosRemotos/diagramaImplementacion.adoc ===== -->

[plantuml, Implementacion, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BorderColor<<yellow>> #FFD700
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
    FontColor<<yellow>> #FFD700
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
hide stereotype

class "Cliente Escuela" as clienteEscuela {
+ getProfesor(nombre : String) : Profesor
}

interface Escuela {
+ getProfesor(nombre : String) : Profesor
}

interface Remote {
(java.rmi)
}

class "Unicas Remote Object" as unicasremoteObject {
(java.rmi)
}

class "Escuela Remota" as escuelaRemota {
+ getProfesor(nombre : String) : Profesor
}

class Profesor {
- nombre: String
- asignatura : String[*]
}

clienteEscuela -right-> Escuela
Remote <\|-down- Escuela
Escuela <\|.. escuelaRemota
unicasremoteObject <\|-- escuelaRemota
escuelaRemota o-- Profesor
....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/5-implementacionCliente.adoc ===== -->

## Implementación del cliente

[cols="40,60"]
|===

a|
- Para que el cliente pueda obtener una referencia del stub correspondiente al objeto remoto, debe obtener el registro donde está registrado el objeto remoto usando la clase _java.rmi.registry.LocateRegistry_ y usar los siguientes métodos del interfaz _java.rmi.registry.Registry_.

a|
[source, java]
....
public interface Registry extends Remote {
	…
	Remote lookup(String name)
		throws RemoteException, NotBoundException, AccessException;
	String[] list() throws RemoteException, AccessException; 
	…
}
....

a|
- Después , el cliente puede invocar los métodos del objeto remoto de la misma manera que si estuviera ubicado en la máquina local.

a|
[source, java]
....
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
…

public class ClienteEscuela {

	private Escuela escuela;

	public void iniciar() throws Exception {
		Registry registry = LocateRegistry.getRegistry("localhost", 2020);
		escuela = (Escuela) registry.lookup("EUI");
		System.out.println("ClienteEscuela::iniciar -> " +
				"Conectado al servidor registrado en " +
				"//localhost:2020/EUI");
	}

	public Profesor getProfesor(String nombre) throws Exception {
		Profesor profesor = escuela.getProfesor(nombre);
		System.out.println("ClienteEscuela::getProfesor -> " +
			profesor.getString());
		return profesor;
	}
}
....
|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x13-programacionDistribuida/6-serializacionObjetosRemoto.adoc ===== -->

## Serialización de objetos Remotos

[cols="50,50"]
|===

a|
- Cuando se debe serializar un objeto remoto, porque es pasado como argumento en la llamada a un método remoto, o es devuelto por un método remoto, entonces lo que se serializa es el stub del objeto remoto, lo que permite transmitir la referencia del objeto remoto a los clientes

a|
[source, java]
....
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Departamento extends Remote {

  String getNombre() throws RemoteException;
}
....
|===

[cols="50,50"]
|===

a|
[source, java]
....
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
…
public class DepartamentoRemoto extends UnicastRemoteObject
    implements Departamento {

  private String nombre;

  public DepartamentoImpl(String nombre) throws RemoteException {
    super();
    this.nombre = nombre;
  }

  public String getNombre() throws RemoteException {
    System.out.println("DepartamentoRemoto::getNombre -> " + nombre);
    return nombre;
  }
}
public class Profesor implements Serializable {

  private String nombre;
  private List<String> asignaturas;
  private Departamento departamento;

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

   public String getString() throws RemoteException {
    String cadena = "Profesor: nombre = " + nombre +
        ", asignaturas = " + asignaturas +
        ", departamento = " + departamento.getNombre();
    System.out.println("Profesor::getString -> " + cadena);
    return cadena;
  }
}
....

a|
[source,java]
....
public class EscuelaRemota extends UnicastRemoteObject
  implements Escuela {

  private List<DepartamentoRemoto> departamentos;
  private HashMap<String, Profesor> profesores;

  public EscuelaRemota() throws RemoteException {
    super();

    departamentos = new ArrayList<DepartamentoRemoto>();
    DepartamentoRemoto lpsi = new DepartamentoRemoto("lpsi");
    departamentos.add(lpsi);
    DepartamentoRemoto oei = new DepartamentoRemoto("oei");
    departamentos.add(oei);
    …
    pepe.setDepartamento(lpsi);
    …
    juan.setDepartamento(oei);
    …
}
....
|===

[cols="50,50"]
|===

a|
- *[blue]#Cliente:#*
a|
- *[blue]#Servidor:#*
a|
[source]
....
ClienteEscuela::iniciar -> Conectado al servidor registrado en //localhost:2020/EUI
Profesor::getString -> Profesor: nombre = Pepe, asignaturas = [POO, POOA], departamento = lpsi
ClienteEscuela::getProfesor -> Profesor: nombre = Pepe, asignaturas = [POO, POOA], departamento = lpsi
Profesor::getString -> Profesor: nombre = Juan, asignaturas = [UML], departamento = oei
ClienteEscuela::getProfesor -> Profesor: nombre = Juan, asignaturas = [UML], departamento = oei
....

a|
[source]
....
EscuelaRemota::iniciar -> Servidor registrado en //localhost:2020/EUI
DepartamentoRemoto::getNombre -> lpsi
Profesor::getString -> Profesor: nombre = Pepe, asignaturas = [POO, POOA], departamento = lpsi
EscuelaRemota::getProfesor -> Profesor: nombre = Pepe, asignaturas = [POO, POOA], departamento = lpsi
DepartamentoRemoto::getNombre -> lpsi
DepartamentoRemoto::getNombre -> oei
Profesor::getString -> Profesor: nombre = Juan, asignaturas = [UML], departamento = oei
EscuelaRemota::getProfesor -> Profesor: nombre = Juan, asignaturas = [UML], departamento = oei
DepartamentoRemoto::getNombre -> oei
....

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/0-index.adoc ===== -->

## 8-Programación Eventos

include::1-programacionEventos(I)/0-index.adoc[]
include::2-programacionEventos(II)/0-index.adoc[]





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/0-index.adoc ===== -->


include::1-introduccion/0-index.adoc[]
include::2-elementosGraficos.adoc[]
include::3-eventos.adoc[]
include::4-gestoresEventos.adoc[]
include::5-controles.adoc[]
include::6-paneles.adoc[]
include::7-ventanaAplicacion.adoc[]
include::8-arquitecturaGUI/0-index.adoc[]





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/1-introduccion/0-index.adoc ===== -->

## Introducción  

include::1-aplicacionConsola.adoc[]
include::2-aplicacionInterfazGrafica.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/1-introduccion/1-aplicacionConsola.adoc ===== -->

### Aplicación de consola

[cols="40,60"]
|===

^.^a|
- Ejecución secuencial de las instrucciones siguiendo el orden jerárquico de las llamadas a los subprogramas a partir del _main_;
- Las instrucciones de salida por pantalla generan datos por pantalla y retornan;
- Las instrucciones de entrada bloquean la ejecución hasta que el usuario introduce datos y retornan;
- Finaliza la ejecución de la aplicación al ejecutarse la última instrucción.

^.^a|
image:aplicacionConsola.png[]

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/1-introduccion/2-aplicacionInterfazGrafica.adoc ===== -->

### Aplicación de interfaz gráfica

[cols="35,30,35", options="header"]
|===

a| *[blue]#Elemento gráfico#*
a| *[blue]#Evento#*
a| *[blue]#Gestor de eventos#*

a|
- Un *elemento gráfico* es:

* un objeto de alguna clase derivada de _javax.swing.JFrame_ (para la ventana de aplicación);

* un objeto de alguna clase derivada de _javax.swing.JComponent_ (para cualquier elemento del interior de la ventana de aplicación);

a|
- Un *evento* es la notificación que genera un elemento gráfico cuando el usuario interactúa con él; 

* es un objeto de alguna clase derivada de _java.util. EventObject_;  

a|
- Un *gestor de eventos* es el código asociado a un elemento gráfico que se ejecuta cuando se produce un evento por la interacción del usuario con éste;

* es un objeto de alguna clase derivada de _java.util.EventListener_;

|===

[cols="40,60"]
 
|===

^.^a|
 - Construcción de la interfaz inicial con sus elementos gráficos y la asociación de los *gestores de eventos* a estos elementos;

 - Ejecución secuencial de las instrucciónes de los gestores de eventos en función de la secuencia de *eventos* generados por las interacciones del usuario (entradas) que conlleva a los consecuentes cambios en la interfaz (salidas); 

 - Finaliza la ejecución de la aplicación al ejecutarse _System.exit_().

^.^a|
image:aplicacionInterfazGrafica.png[]

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/2-elementosGraficos.adoc ===== -->

## Elementos Gráficos

[cols="25,25,50", options="header"]
|===

3+a|
*Responsabilidad de las Clases*

a|
* *_Ventana de Aplicación_*: en una aplicación gráfica existe al menos una ventana de aplicación (*_JFrame_*) que maneja el título, el menú, la línea de estado, los bordes y su área de trabajo (espacio interior);

a|
* *_Panel_*: en cada momento la ventana tiene un panel (*_JPanel_*) que determina el aspecto de su área de trabajo. El panel puede contener controles y subpaneles para agrupar subconjunto de controles;

a|
* *_Controles_*: pueden ser etiquetas, botones, listas, campos de texto, áreas de texto, … (*_JLabel, JButton, JList, JTextField, JTextArea, …_*)

** cada control genera distintos tipos de eventos (de clases hijas de *_EventObject_*) al interactuar con el usuario;

** el gestor de eventos será una clase que implemente los auditores (clases hijas de *_EventListener_*), recibe el evento de cada interacción y maneja los datos y presencia de la interfaz;

|===

[cols="60,40", options="header"]
|===

2+a| [blue]#Ejemplo:# Conversor de Euros a Pecetas

^.^a|
- *_Estructura_*: una ventana de aplicación con un panel que contiene dos etiquetas, un campo de texto y un botón;

- *_Funcionalidad_*: el botón _Convertir_ recoge la cantidad el campo de texto y actualiza la etiqueta inferior con la cantidad en euros; si el texto no es numérico, se muestra un mensaje de error a través de la etiqueta inferior;

image::elementosGraficos.png[]


^.^a|
image::elementosGraficos2.png[]

_La pulsación sobre el botón produce un evento que es manejado por el gestor de eventos que actualiza la interfaz_


|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/3-eventos.adoc ===== -->

## Eventos

[cols="20,80"]
|===

a|
a| *[blue]#Ejemplo#*

a|
-  existen más en *_java.awt.event_* (para el foco, las teclas, …)

a|
[source, java]
....
class EventObject {
  public Object getSource();
  /* devuelve la dirección del elemento que lo ha generado
     (ventana, panel, componentes,...) */
}
class MouseEvent extends EventObject {
  /* para clases de iteracciones que produce la manipulación 
  del raton */  
}
class ActionEvent extends EventObject {
  /* para clases de iteracciones que dan ordenes (enter en 
  una entrada, click en un botón, ...) */
}
class ItemEvent extends EventObject {
  /* para clases de iteracciones que producen cambios en un 
  control  */
}
....

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/4-gestoresEventos.adoc ===== -->

## Gestores de Eventos

[cols="30,70"]
|===

a|
- Existen un interfaz auditor para cada clase de evento en *_java.awt.event_* :

a|
[source, java]
....
interface MouseListener extends EventListener {
  void mouseClicked(Mou¡seEvent e);
  void mouseReleased(MouseEvent e);
  void mousePressed(MouseEvent e);
  void mouseExited(MouseEvent e);
  void mouseEntered(MouseEvent e);
}
interface ActionListener extends EventListener {
  void actionPerformed(ActionEvent e);
}
interface ItemListener extends EventListener {
  void itemStateCharged(ItemEvent e);
}
....

|===

[cols="2", options="header"]
|===

2+a|
La *gestión de eventos* requiere:

a|
* que una clase implemente los interfaces de aquellas clases de eventos correspondientes a las interacciones a las que se desea reaccionar y, por tanto, redefinir los métodos abstractos:

** o bien, con el código que, accediendo al evento que llega por parámetro si hiciera falta, manipule los datos y elementos gráficos correspondientes a la funcionalidad establecida

** o bien, con código vacío para evitar que las clase sea abstracta cuando no se desea reaccionar a cierta interacción

a|
* asociar un objeto de esta clase a aquellos controles que se desea auditar con métodos presentes en la jerarquía  de controles (derivadas de *_javax.swing.JComponent_*):

** void *addMouseListener*(MouseListener auditor);

** void *addActionListener*(ActionListener auditor);

** void *addItemListener*(ItemListener auditor);

|===


[cols="70,30"]
|===

a|
[source, java]
....
package pooa;
import java.awt.event.*;
class ConversorEuros implements ActionListener {
  public ConversorEuros() {
    ...
  }
  public void actionPerformed(ActionEvent e) {
    ...
  }
  public static void main(String[] args) {
    new ConversorEuros();
  }
}
....

a|
image:gestoresEventos.png[]

- _para capturar la pulsación del botón y entonces calcular y presentar la conversión de euros a pesetas_

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/5-controles.adoc ===== -->

## Controles

[source, java]
....
class JComponent extends java.awt.Component {
  public void setForeground(Color color) 
  // pone color al texto del componente
  public Color getForeground()
  // obtiene el color del texto del componente
  void addMouseListener(MouseListener aud)
  // asocia un auditor del ratón al componente
  …
}
....

[cols="2"]
|===

2+a|
* donde:

a|
[source, java]
....
class java.awt.Color {
    public static final Color RED;
    public static final Color BLUE;
    …
}
class JLabel extends JComponent {
  public JLabel(String texto)
  public String getText()
  public void setText(String texto)
  …
}
class JButton extends JComponent {
  public JButton(String texto)
  public String getText()
  public void setText(String texto)
  public void addActionListener(ActionListener aud)
  public void addItemListener(ItemListener aud)
  …
}
class JTextField extends JComponent {
  public JTextField(int anchoCaracteres)
  public String getText()
  public void setText(String texto)
  public void setEditable(boolean);
  public void addActionListener(ActionListener aud)
  …
}
....

a|
[source, java]
....
class JTextArea extends JComponent {
    public JTextArea(String texto)
    public String getText()
    public void setText(String texto)
    public void setEditable(boolean);
    …
}
class JRadioButton extends JComponent {
  public JRadioButton(String texto)
  public String getText()
  public void setText(String texto)
  public void setSelected(boolean)
  public boolean isSelected()
  public void addActionListener(ActionListener aud)
  public void addItemListener(ItemListener aud)
    …
}
....

|===

* donde la siguiente clase permite la alternancia entre varios botones radio:


[cols="80,20"]
|===

a|
[source, java]
....
class ButtonGroup {
  public ButtonGroup();
  public void add(JRadioButton botonRadio)
  …
}

import javax.swing.*;

class ConversorEuros implements ActionListener {
  private JTextField entrada;
  private JLabel resultado;

  public ConversorEuros() {
    JLabel explicacion = new JLabel("Importe en Euros");
    entrada = new JTextField(20);
    JButton convertir = new JButton("Convertir");
    convertir.addActionListener(this);
    resultado = new JLabel("Pulse para obtener el " + 
      "importe en pesetas");
    …
  }
....

^.^a|
image:controles.png[]

* para construir los controles de la aplicación gráfica

|===

[cols="80,20"]
|===

a|
[source, java]
....
  public void actionPerformed(ActionEvent e) {
    try {
      double euros = Double.parseDouble(entrada.getText());
      double pesetas = euros * 166.386;
      resultado.setText("Equivale a " + pesetas + " pesetas");
    } catch (NumberFormatException e2) {
      resultado.setText(
        "En el campo de texto no hay un numero");
    }
  }
…
....

^.^a|
image:controles2.png[]

* para actualizar los controles de la interfaz gráfica tras el evento

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/6-paneles.adoc ===== -->

## Paneles

[source, java]
....
class JPanel extends JComponent {
  public JPanel()
  public void add(JComponent componente)
  public void setBorder(Border borde)
  …
}
....

[cols="2"]
|===
2+a|
* donde: 

^.^a|
image:paneles.png[]

a|
[source,java]
....
class JScrollPane extends JComponent {
  public JScrollPane(JComponent componente)
  public void setPreferredSize(Dimension tamaño)
  …
}
....
|===

[cols="25,60,15"]
|===

a|
* donde la dimensión establecida es el tamaño máximo que puede ocupar el componente que se pasa por parámetro en el constructor del panel, a partir de ese tamaño, surgen las barras de desplazamiento:

a|
[source, java]
....
class java.awt.Dimension {
  public Dimension(int anchoPixels, int altoPixels)
  …	
}
class ConversorEuros implements ActionListener {
  …
  public ConversorEuros() {
    …
    JPanel panelDeContenido = new JPanel();
    panelDeContenido.add(explicacion);
    panelDeContenido.add(entrada);
    panelDeContenido.add(convertir);
    panelDeContenido.add(resultado);    …
    …
  }
…
....

a|
image:paneles3.png[]

* para construir el panel y añadirle los controles

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/7-ventanaAplicacion.adoc ===== -->

## Ventana de Aplicación

[cols="50,50"]
|===

.2+a|
[source, java]
....
class JFrame extends java.awt.Window {
 public JFrame()
  public void setContentPane(JPanel panel)
  public void setTitle(String titulo)
  public void setDefaultCloseOperation(int codigo)
  public static final int EXIT_ON_CLOSE
  …
  public void setLocation(int pixelX, int pixelY)
  public void setSize(int pixelX, int pixelY)
  public void serResizable(boolean escalable)
  public void setVisible(boolean visible)
  // este método debe ser el último de todo: 
  // la creación de controles con sus auditores
  // la creación del panel con sus controles
  // la creación de la ventana con su panel 
  …
}
....

a|
[source, java]
....
class ConversorEuros implements ActionListener {
  …
  public ConversorEuros() {
    …
    JFrame ventana = new JFrame(
      "Conversor de Euros a pesetas");
    ventana.setLocation(150, 150);
    ventana.setSize(300, 150);
    ventana.setResizable(false);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setContentPane(panelDeContenido);
    ventana.setVisible(true);
  }
  …
}

....

^.^a|
image:ventanaAplicacion.png[]

para construir la ventana y añadirle el panel

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/0-index.adoc ===== -->

## Arquitectura de la GUI

[cols="5,35,35,25"]
|===

.2+a|
La *arquitectura de la GUI* aborda diferentes diseños para la existencia de clases, sus relaciones, reparto de responsabilidades, … 


a| 
*Asociación/Composición*
include::diagramaAsociacion.adoc[]

a| *Dependencia (uso)*
include::diagramaDependencia.adoc[]

.2+a| *Herencia*
include::diagramaHerencia.adoc[]

a| *Eventos*
include::diagramaEventos.adoc[]

a| *Composición gráfica*
include::diagramaComposicion.adoc[]


|===

[cols="65,35", options="header"]
|===

2+a|
- [blue]#*Ejemplo1:*# Traductor de Español a Inglés

a|
* _Estructura_: una ventana de aplicación con un panel que contiene un campo de texto y un botón y una etiqueta;

* _Funcionalidad_: el botón Traducir recoge el texto del campo de texto y actualiza la etiqueta inferior con la palabra traducida; si el texto no se encuentra en el diccionario, se muestra el mensaje “????????” a través de la etiqueta inferior

^.^a|
image:traductorEspañolIngles.png[]

image:traductorEspañolIngles1.png[]
|===

include::1-arquitecturaMVC/0-index.adoc[]
include::2-jerarquizacionVistas3niveles/0-index.adoc[]
include::3-gestionEventosCompartidaEventosDiferentes/0-index.adoc[]
include::4-mismaGestionEventosMismoEvento/0-index.adoc[]
include::5-distintaGestionEventosDistintosEventos/0-index.adoc[]
include::6-reutilizacionGestionEventos/0-index.adoc[]
include::7-jerarquizacionVistas4Niveles/0-index.adoc[]
include::8-jerarquizacionVistas5NivelesReutilizacion/0-index.adoc[]




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/1-arquitecturaMVC/0-index.adoc ===== -->

### Arquitectura MVC

[cols="60,40", options="header"]
|===

2+a|
*[blue]#Responsabilidad de las Clases:#*

a|
* existe una separación de los datos, *modelo/ Traductor*, de la presentación, vista/ *VentanaTraductor*;

* el *controlador/ AplicacionTraductor* asocia la vista al modelo y cede el control a la vista para que interactúe con el usuario;

* la vista hereda de *JFrame* y gestiona el evento de la pulsación del botón implementando el auditor *ActionListener*;

a|
* la ventana contiene el panel *JPanel* que a su vez contiene los controles: *JTextField, JButton y Jlabel*;

* la vista consulta al modelo y actualiza la etiqueta con el resultado de la traducción del texto recogido a través del campo de texto. 

|===

- *Diagrama de Clases*:

[cols="100%", grid=none, frame=none]
|===

^.^a|
include::diagramaClases.adoc[]

|===

[source, java]
....
package pooa;

class AplicacionTraductor {

    public AplicacionTraductor() {
        new VentanaTraductor(new Traductor());
    }
    public static void main(String[] args) {
        new AplicacionTraductor();
    }
}

....

[source, java]
....
package pooa;

import java.util.StringTokenizer;

public class Traductor {

  public static final int FRANCES = 0;
  public static final int ESPAÑOL = 1;
  public static final int INGLES = 2;
  public static final int NUM_IDIOMAS = 3;
  public static String getCadenaIdioma(int codIdioma) { … }
  public static int getCodIdioma (String idioma) { … }
  public Traductor() { … } 
  public void setIdiomaOrigen(int idiomaOrigen) { … }
  public void setIdiomaDestino(int idiomaDestino) { … }
  public int getIdiomaOrigen() { … }
  public int getIdiomaDestino() { … }
  public void invierteIdioma() { … }
  public String[] getPalabras(int codIdioma) { … }
  public String traducePalabra(String palabra) { … }
  public String traducePalabra(String palabra, 
    int codOrigen,int codDestino) { … }
  public String traduceTexto(String texto) { … }
  public String traduceTexto(String texto, 
    int codOrigen, int codDestino) { … }
}
....

[source, java]
....
package pooa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class VentanaTraductor extends JFrame implements
		ActionListener {

  private Traductor traductor;
  private JLabel traduccion;
  private JTextField entrada;

  public void actionPerformed(ActionEvent e) {
    traduccion.setText(
      traductor.traducePalabra(
        entrada.getText()));
  }
  public VentanaTraductor(Traductor traductor) {
    this.traductor = traductor;

    entrada = new JTextField(20);
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);
    traduccion = new JLabel("Pulsa el boton para traducir");

    JPanel panelContenido = new JPanel();
    panelContenido.add(entrada);
    panelContenido.add(traducir);
    panelContenido.add(traduccion);

    this.setContentPane(panelContenido);
    this.setTitle("Traductor de Español a Inglés");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(150, 150);
    this.setSize(250, 125);
    this.setResizable(false);
    this.setVisible(true);
  }
}
....





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/1-arquitecturaMVC/diagramaClases.adoc ===== -->

[plantuml, Clases1, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}
class ": Aplicación Traductor" as aplicacionTraductor
class JFrame
class ActionListener <<interface>>
class ":Traductor" as traductor
together {
class "Ventana: Ventana Traductor" as ventanaTraductor
class "panelContenido: JPanel" as panelContenido
}
together {
class "boton:JButton" as boton
class "campo:JTextField" as campo
class "etiqueta: JLabel" as etiqueta
}
aplicacionTraductor .down.> ventanaTraductor
aplicacionTraductor .down.> traductor
JFrame <\|-- ventanaTraductor
ActionListener <\|-- ventanaTraductor
traductor <-- ventanaTraductor
ventanaTraductor ..> panelContenido
ventanaTraductor --o panelContenido
ventanaTraductor -[hidden] panelContenido
ventanaTraductor --> boton
boton ..> ventanaTraductor
ventanaTraductor --> campo
ventanaTraductor --> etiqueta
panelContenido --o boton
panelContenido --o campo
panelContenido --o etiqueta
boton -[hidden]-campo
campo -[hidden]-etiqueta
....



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/2-jerarquizacionVistas3niveles/0-index.adoc ===== -->

### Jerarquizació de las vistas en 3 niveles

[cols="50,50", options="header"]
|===

2+a|
*Responsabilidad de las Clases*:

a|
 * se separa la ventana, *VentanaTraductor*, del *panel PanelTraductor*

* la ventana contiene al panel y éste a los controles

* la ventana hereda de *JFrame* y no gestiona eventos

a|
* el panel hereda de *JPanel* y gestiona el evento de la pulsación del botón implementando el auditor *ActionListener* desempeñando el papel de controlador;

* sólo el panel se asocia al modelo *Traductor*;

|===

- *Diagrama de clases:*

[cols="100%", grid=none, frame=none] 
|===

^.^a|
include::diagramaClases.adoc[]

|===

[source, java]
....
package pooa;

import javax.swing.JFrame;

class VentanaTraductor extends JFrame {

  public VentanaTraductor(Traductor traductor) {
    this.setContentPane(new PanelTraductor(traductor));
    this.setTitle("Traductor de Español a Inglés");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(150, 150);
    this.setSize(250, 125);
    this.setResizable(false);
    this.setVisible(true);
  }
}
....

[source, java]
....
package pooa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PanelTraductor extends JPanel implements ActionListener {

  private Traductor traductor;
  private JTextField entrada;
  private JLabel traduccion;
  public PanelTraductor(Traductor traductor) {
    this.traductor = traductor;

    entrada = new JTextField(20);
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);
    traduccion = new JLabel("Pulsa el boton para traducir");

    this.add(entrada);
    this.add(traducir);
    this.add(traduccion);
  }

  public void actionPerformed(ActionEvent e) {
    traduccion.setText(
      traductor.traducePalabra(
        entrada.getText()));
  }
}
....

[cols="60,40", options="header"]
|===

2+a|
[blue]#*Ejemplo2:*# Traductor de Español a Inglés

a|
* Funcionalidad: tanto el botón Traducir como la pulsación de “_Enter_” en el campo de texto recogen el texto de la entrada y actualiza la etiqueta inferior con la palabra traducida; 

* el resto se mantiene igual;

^.^a|
image:traductorEspañolIngles.png[]

image:traductorEspañolIngles1.png[]
|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/2-jerarquizacionVistas3niveles/diagramaClases.adoc ===== -->

[plantuml, Clases2, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}
class ": Aplicación Traductor" as aplicacionTraductor
together {
class JFrame
class ":Traductor" as traductor
}
class JPanel
class ActionListener <<interface>>
together { 
class "Ventana: Ventana Traductor" as ventanaTraductor
class ": PanelTraductor" as panelTraductor
}
class "boton:JButton" as boton
class "campo:JTextField" as campo
class "etiqueta: JLabel" as etiqueta

aplicacionTraductor .down.> ventanaTraductor
aplicacionTraductor .down.> traductor
ventanaTraductor -up-\|> JFrame
JPanel <\|-- panelTraductor
ActionListener <\|-- panelTraductor
ventanaTraductor .up.> traductor
panelTraductor --> traductor
ventanaTraductor .right.> panelTraductor
ventanaTraductor -right-o panelTraductor
panelTraductor --> boton
boton ..> panelTraductor
panelTraductor --> campo
panelTraductor --> etiqueta
panelTraductor --o boton
panelTraductor --o campo
panelTraductor --o etiqueta
JFrame -[hidden] traductor
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/3-gestionEventosCompartidaEventosDiferentes/0-index.adoc ===== -->

### Gestión de eventos compartida para eventos diferentes

[cols="40,60", options="header"]
|===

a|
*Responsabilidad de las Clases:*
a|
*Diagrama de Clases:*

a|
* el panel hereda de *JPanel* y gestiona el evento producido tanto por la pulsación del botón como la pulsación de “_Enter_” en el campo de texto implementando únicamente el auditor *ActionListener*;

* el resto se mantiene igual;

a|
include::diagramaClases.adoc[]

|===


[source, java]
....
  public PanelTraductor(Traductor traductor) {
    this.traductor = traductor;

    entrada = new JTextField(20);
    entrada.addActionListener(this);
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);
    traduccion = new JLabel("Pulsa el boton para traducir");

    this.add(entrada);
    this.add(traducir);
    this.add(traduccion);
  }
....

[cols="40,60", options="header"]
|===

2+a|
[blue]#*Ejemplo3:*# Traductor de Español a Ingés

a|
* _Estructura_: se añade un botón para invertir el sentido de la traducción y una etiqueta que indica el sentido vigente;

* _Funcionalidad_: se añade un botón para invertir el sentido de la traducción;

* el resto se mantiene igual;

^a|
image:traductorEspañolIngles3.png[]

image:traductorEspañolIngles2.png[]

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/3-gestionEventosCompartidaEventosDiferentes/diagramaClases.adoc ===== -->

[plantuml, Clases3, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}
class ": Aplicación Traductor" as aplicacionTraductor
together {
class JFrame
class ":Traductor" as traductor
}
class JPanel
class ActionListener <<interface>>
together { 
class "Ventana: Ventana Traductor" as ventanaTraductor
class ": PanelTraductor" as panelTraductor
}
class "boton:JButton" as boton
class "campo:JTextField" as campo
class "etiqueta: JLabel" as etiqueta

aplicacionTraductor .down.> ventanaTraductor
aplicacionTraductor .down.> traductor
JFrame <\|-- ventanaTraductor
JPanel <\|-- panelTraductor
ActionListener <\|-- panelTraductor
ventanaTraductor .up.> traductor
panelTraductor --> traductor
ventanaTraductor .right.> panelTraductor
ventanaTraductor -right-o panelTraductor
panelTraductor --> boton
boton ..> panelTraductor
panelTraductor --> campo
panelTraductor --> etiqueta
panelTraductor --o boton
panelTraductor --o campo
panelTraductor <.. campo
panelTraductor --o etiqueta
JFrame -[hidden] traductor
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/4-mismaGestionEventosMismoEvento/0-index.adoc ===== -->

### Misma gestión de Eventos para el mismo evento

[cols="35,65", options="header"]
|===

a|
*Responsabilidad de las Clases:*
a|
*Diagrama de clases*

a|
* el panel hereda de *JPanel* y gestiona de forma diferente el evento de la pulsación de un botón: traducir o invertir el sentido de la traducción implementando únicamente el auditor *ActionListener*;

* el resto se mantiene igual;

^.^a|
include::diagramaClases.adoc[]

|===

[cols="50,50"]
|===

a|
[source, java]
....
package pooa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PanelTraductor extends JPanel implements
		ActionListener {

  private Traductor traductor;
  private JTextField entrada;
  private JButton invertir;
  private JLabel traduccion;
  private JLabel sentidoTraduccion;
  public PanelTraductor(Traductor traductor) {
    this.traductor = traductor;

    entrada = new JTextField(20);
    entrada.addActionListener(this);
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);
    traduccion = new JLabel("Pulsa el boton para traducir");
    invertir = new JButton("Invierte sentido traducción");
    invertir.addActionListener(this);
    sentidoTraduccion = new JLabel();
    this.muestraSentidoTraduccion();
....

a|
[source, java]
....
    this.add(entrada);
    this.add(traducir);
    this.add(traduccion);
    this.add(invertir);
    this.add(sentidoTraduccion);
  }
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == invertir) {
      traductor.invierteIdioma();
      this.muestraSentidoTraduccion();
    } else {
      traduccion.setText(
        traductor.traducePalabra(
          entrada.getText()));
    }
  }

  private void muestraSentidoTraduccion() {
    sentidoTraduccion.setText(
      Traductor.getCadenaIdioma(traductor.getIdiomaOrigen()) +
      " - " +
      Traductor.getCadenaIdioma(traductor.getIdiomaDestino()));
  }
}
....
|===


[cols="55,45",options="header"]
|===

2+a|
*[blue]#Ejemplo4:#* Traductor de Español a Indlés

^.^a|
* _Funcionalidad_: se resaltan en color azul los textos de todos los controles cuando el cursor sobrepasa su área gráfica y vuelve a su color negro original cuando ya no sobrepasa;

* el resto se mantiene igual;

^.^a|
image:traductorEspañolIngles4.png[]

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/4-mismaGestionEventosMismoEvento/diagramaClases.adoc ===== -->

[plantuml, Clases4, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}
class ": Aplicación Traductor" as aplicacionTraductor
together {
class JFrame
class ":Traductor" as traductor
}
class JPanel
class ActionListener <<interface>>
together { 
class "Ventana: Ventana Traductor" as ventanaTraductor
class ": PanelTraductor" as panelTraductor
}
class "boton:JButton" as boton
class "campo:JTextField" as campo
class "etiqueta: JLabel" as etiqueta
class "etiqCambioIdioma:JLabel" as etiquetaCambioIdioma
class "botonCambioIdioma:JButton" as botonCambioIdioma

aplicacionTraductor .down.> ventanaTraductor
aplicacionTraductor .down.> traductor
JFrame <\|-- ventanaTraductor
JPanel <\|-- panelTraductor
ActionListener <\|-- panelTraductor
ventanaTraductor .up.> traductor
panelTraductor --> traductor
ventanaTraductor .right.> panelTraductor
ventanaTraductor -right-o panelTraductor
panelTraductor --> boton
boton ..> panelTraductor
panelTraductor --> campo
panelTraductor --> etiqueta
panelTraductor --o boton
panelTraductor --o campo
panelTraductor <.. campo
panelTraductor --o etiqueta
panelTraductor --> etiquetaCambioIdioma
panelTraductor --> botonCambioIdioma
panelTraductor --o etiquetaCambioIdioma
panelTraductor --o botonCambioIdioma
botonCambioIdioma ..> panelTraductor
JFrame -[hidden] traductor
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/5-distintaGestionEventosDistintosEventos/0-index.adoc ===== -->

### Distinta gestión de eventos para distintos eventos

[cols="30,70", options="header"]
|===

a|
*Responsabilidad de las Clases:*
a|
*Diagrama de Clases:*

a|
* el panel hereda de *JPanel* y gestiona los eventos del campo de texto, de los botones y cuando el cursor sobrepasa cualquier control implementando los auditores *ActionListener* y *MouseListener*;

* el resto se mantiene igual;

^.^a|
include::diagramaClases.adoc[]

|===

[cols="50,50"]
|===

a|
[source, java]
....
package pooa;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PanelTraductor extends JPanel implements
		ActionListener, MouseListener {

  private Traductor traductor;
  private JTextField entrada;
  private JButton invertir;
  private JLabel traduccion;
  private JLabel sentidoTraduccion;
  private Color colorAnterior;

package pooa;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PanelTraductor extends JPanel implements
		ActionListener, MouseListener {

  private Traductor traductor;
  private JTextField entrada;
  private JButton invertir;
  private JLabel traduccion;
  private JLabel sentidoTraduccion;
  private Color colorAnterior;
....

a|
[source, java]
....
  public PanelTraductor(Traductor traductor) {
    this.traductor = traductor;
    entrada = new JTextField(20);
    entrada.addActionListener(this);
    entrada.addMouseListener(this);
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);
    traducir.addMouseListener(this);
    traduccion = new JLabel("Pulsa el boton para traducir");
    traduccion.addMouseListener(this);
    invertir = new JButton("Invierte sentido traducción");
    invertir.addActionListener(this);
    invertir.addMouseListener(this);
    sentidoTraduccion = new JLabel();
    this.muestraSentidoTraduccion();
    sentidoTraduccion.addMouseListener(this);

    this.add(entrada);
    this.add(traducir);
    this.add(traduccion);
    this.add(invertir);
    this.add(sentidoTraduccion);
  }
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == invertir) {
      traductor.invierteIdioma();
      this.muestraSentidoTraduccion();
    } else {
      traduccion.setText(
        traductor.traducePalabra(
          entrada.getText()));
    }
  }
  private void muestraSentidoTraduccion() {
    sentidoTraduccion.setText(
      Traductor.getCadenaIdioma(traductor.getIdiomaOrigen()) +
      " - " +
      Traductor.getCadenaIdioma(traductor.getIdiomaDestino()));
  }
  public void mouseExited(MouseEvent e) {
    Component component = e.getComponent();
    component.setForeground(colorAnterior);
  }
  public void mouseEntered(MouseEvent e) {
    Component component = e.getComponent();
    colorAnterior = component.getForeground();
    component.setForeground(Color.BLUE);
  }
  public void mouseClicked(MouseEvent e) {
  }
  public void mouseReleased(MouseEvent e) {
  }
  public void mousePressed(MouseEvent e) {
  }
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/5-distintaGestionEventosDistintosEventos/diagramaClases.adoc ===== -->

[plantuml, Clases5, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}
class ": Aplicación Traductor" as aplicacionTraductor
together {
class JFrame
class ":Traductor" as traductor
}
class JPanel
class ActionListener <<interface>>
class MouseListener <<interface>>
together { 
class "Ventana: Ventana Traductor" as ventanaTraductor
class ": PanelTraductor" as panelTraductor
}
class "boton:JButton" as boton
class "campo:JTextField" as campo
class "etiqueta: JLabel" as etiqueta
class "etiqCambioIdioma:JLabel" as etiquetaCambioIdioma
class "botonCambioIdioma:JButton" as botonCambioIdioma

aplicacionTraductor .down.> ventanaTraductor
aplicacionTraductor .down.> traductor
JFrame <\|-- ventanaTraductor
JPanel <\|-- panelTraductor
ActionListener <\|-- panelTraductor
MouseListener <\|-- panelTraductor
ventanaTraductor .up.> traductor
panelTraductor --> traductor
ventanaTraductor .right.> panelTraductor
ventanaTraductor -right-o panelTraductor
panelTraductor --> boton
boton ..> panelTraductor
panelTraductor --> campo
panelTraductor --> etiqueta
panelTraductor --o boton
panelTraductor --o campo
panelTraductor <.. campo
panelTraductor --o etiqueta
panelTraductor --> etiquetaCambioIdioma
panelTraductor --> botonCambioIdioma
panelTraductor --o etiquetaCambioIdioma
panelTraductor --o botonCambioIdioma
botonCambioIdioma ..> panelTraductor
panelTraductor <.. etiqueta
panelTraductor <.. etiquetaCambioIdioma
JFrame -[hidden] traductor
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/6-reutilizacionGestionEventos/0-index.adoc ===== -->

### Reutilización de gestión de eventos

[cols="35,65", options="header"]
|===

a|
*Responsabilidad de las Clases:*
a|
*Diagrama de clases:*

a|
*  el panel hereda de *JPanel* y gestiona tanto los eventos del campo de texto como de los botones implementando el auditor *ActionListener* y delega la gestión de eventos del ratón a la clase *GestorColor* que implementa *MouseListener*;

* el resto se mantiene igual;
a|
include::diagramaClases.adoc[]

|===

[cols="50,50"]
|===

a|
[source, java]
....
package pooa;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class GestorColor implements MouseListener {

  private Color colorAnterior;

  public void mouseExited(MouseEvent e) {
    Component comp = e.getComponent();
    comp.setForeground(colorAnterior);
  }

  public void mouseEntered(MouseEvent e) {
    Component comp = e.getComponent();
    colorAnterior = comp.getForeground();
    comp.setForeground(Color.BLUE);
  }
  public void mouseClicked(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mousePressed(MouseEvent e) {
  }
}
....
a|
[source, java]
....
  public PanelTraductor(Traductor traductor) {
    this.traductor = traductor;

    GestorColor gestorColor = new GestorColor();
    entrada = new JTextField(20);
    entrada.addActionListener(this);
    entrada.addMouseListener(gestorColor);
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);
    traducir.addMouseListener(gestorColor);
    traduccion = new JLabel("Pulsa el boton para traducir");
    traduccion.addMouseListener(gestorColor);
    invertir = new JButton("Invierte sentido traducción");
    invertir.addActionListener(this);
    invertir.addMouseListener(gestorColor);
    sentidoTraduccion = new JLabel();
    this.muestraSentidoTraduccion();
    sentidoTraduccion.addMouseListener(gestorColor);
....
|===


[cols="50,50", options="header"]
|===

2+a|
[red]#*Ejemplo5:*# Traductor de Español a Inglés

a|
* _Estructura_: etiquetas y áreas de texto con scroll para el idioma origen y el idioma destino, botón para traducir, etiqueta para el sentido de la traducción y dos botones radio alternativos para conmutar el sentido de la traducción;

* _Funcionalidad_: el botón _Traducir_ presenta en el área derecha la traducción del texto del área izquierda según el sentido de la traducción vigente y los botones radio conmutan el sentido;

* el resto se mantiene igual sin color resaltado;

^.^a|
image::traductorEspañolIngles5.png[]

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/6-reutilizacionGestionEventos/diagramaClases.adoc ===== -->

[plantuml, Clases6, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
skinparam default {
    BorderColor #DarkGrey           
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey           
}
class ": Aplicación Traductor" as aplicacionTraductor
together { 
class "Ventana: Ventana Traductor" as ventanaTraductor
class ": PanelTraductor" as panelTraductor
class ": GestorEventosRollOver" as gestorEventos
}
class JFrame
class ":Traductor" as traductor
class JPanel
class ActionListener <<interface>>
class MouseListener <<interface>>
together { 
class "boton:JButton" as boton
class "campo:JTextField" as campo
class "etiqueta: JLabel" as etiqueta
class "etiqCambioIdioma:JLabel" as etiquetaCambioIdioma
class "botonCambioIdioma:JButton" as botonCambioIdioma
}

JFrame <\|-down- ventanaTraductor
aplicacionTraductor .down.> traductor
aplicacionTraductor .down.> ventanaTraductor
ventanaTraductor .right.> panelTraductor
ventanaTraductor -right-o panelTraductor
panelTraductor -up-> traductor
ventanaTraductor .up.> traductor
panelTraductor -up-\|> JPanel
panelTraductor -up-\|> ActionListener
panelTraductor -right-> gestorEventos
gestorEventos -up-\|> MouseListener
panelTraductor -[hidden]-boton
boton -[hidden]- campo
campo -[hidden]- etiqueta
etiqueta -[hidden]- etiquetaCambioIdioma
etiquetaCambioIdioma -[hidden]-botonCambioIdioma
panelTraductor -down-> boton
panelTraductor -down-o boton
boton .up.> panelTraductor
boton .up.> gestorEventos
panelTraductor -down-> campo
panelTraductor -down-o campo
campo .up.> panelTraductor
campo .up.> gestorEventos
panelTraductor -down-> etiqueta
panelTraductor -down-o etiqueta
etiqueta .up.> gestorEventos
panelTraductor -down-> etiquetaCambioIdioma
panelTraductor -down-o etiquetaCambioIdioma
etiquetaCambioIdioma .up.> gestorEventos
panelTraductor -down-> botonCambioIdioma
panelTraductor -down-o botonCambioIdioma
botonCambioIdioma .up.> panelTraductor
botonCambioIdioma .up.> gestorEventos

....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/7-jerarquizacionVistas4Niveles/0-index.adoc ===== -->

### Jerarquización de las vistas en 4 niveles

[cols="65,35", options="header"]
|===

2+a|
*Responsabilidad de las Clases:*

a|
* la *VentanaTraductor* hija de *JFrame* contiene al panel *PanelTraductor*;

* el *PanelTraductor* hija de *JPanel* contiene los controles (*JButton*, *JLabel* y *JRadioButton*) y subpaneles con scroll *JScrollPane*;

a|
* el subpanel con scroll *JScrollPane* contiene el área de texto *JTextArea*;

* el resto se mantiene igual;
|===


[cols="50,50"]
|===

a|
[source, java]
....
package pooa;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class PanelTraductor extends JPanel 
  		implements ActionListener, ItemListener {
  private Traductor traductor;
  private JLabel tituloOrigen;
  private JTextArea textoOrigen;
  private JLabel tituloDestino;
  private JTextArea textoDestino;
  private JRadioButton sentidoOriginal;
  private JRadioButton sentidoInvertido;
  private final int idiomaOrigenOriginal;
  private final int idiomaDestinoOriginal;

  public PanelTraductor(Traductor traductor) {
    this.traductor = traductor;
    idiomaOrigenOriginal = traductor.getIdiomaOrigen();
    idiomaDestinoOriginal = traductor.getIdiomaDestino();
    tituloOrigen = new JLabel();
    tituloDestino = new JLabel();
    this.muestraIdiomasEnTextos();
    textoOrigen = new JTextArea("Escriba aquí");
    JScrollPane scrollTextoOrigen = 
      new JScrollPane(textoOrigen);
    scrollTextoOrigen.setPreferredSize(
      new Dimension(140, 100));
....

a|
[source, java]
....
    textoDestino = new JTextArea();
    textoDestino.setEditable(false);
    JScrollPane scrollTextoDestino = 
      new JScrollPane(textoDestino);
    scrollTextoDestino.setPreferredSize(
      new Dimension(140, 100));
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);
    JLabel tituloSentido = new JLabel("Sentido traduccion");
    ButtonGroup grupoBotones = new ButtonGroup();
    sentidoOriginal = new JRadioButton(
        Traductor.getCadenaIdioma(traductor.getIdiomaOrigen()) + 
        " - " +
        Traductor.getCadenaIdioma(traductor.getIdiomaDestino()));
    grupoBotones.add(sentidoOriginal);
    sentidoOriginal.setSelected(true);
    sentidoOriginal.addItemListener(this);
    sentidoInvertido = new JRadioButton(
        Traductor.getCadenaIdioma(traductor.getIdiomaDestino()) +
        " - "+
        Traductor.getCadenaIdioma(traductor.getIdiomaOrigen()));
    grupoBotones.add(sentidoInvertido);
    sentidoInvertido.addItemListener(this);

    this.add(tituloOrigen);
    this.add(tituloDestino);
    this.add(scrollTextoOrigen);
    this.add(scrollTextoDestino);
    this.add(traducir);
    this.add(tituloSentido);
    this.add(sentidoOriginal);
    this.add(sentidoInvertido);
  }
  public void actionPerformed(ActionEvent e) {
    textoDestino.setText(traductor.traduceTexto(
        textoOrigen.getText()));
  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange() == ItemEvent.SELECTED) {
      if (sentidoOriginal.isSelected()) {
        traductor.setIdiomaOrigen(idiomaOrigenOriginal);
        traductor.setIdiomaDestino(idiomaDestinoOriginal);
        this.muestraIdiomasEnTextos();
      } else if (sentidoInvertido.isSelected()) {
        traductor.setIdiomaOrigen(idiomaDestinoOriginal);
        traductor.setIdiomaDestino(idiomaOrigenOriginal);
        this.muestraIdiomasEnTextos();
      }
    }
  }
  private void muestraIdiomasEnTextos() {
    tituloOrigen.setText("Texto en " +
      Traductor.getCadenaIdioma(traductor.getIdiomaOrigen()));
    tituloDestino.setText("Texto en " +
      Traductor.getCadenaIdioma(traductor.getIdiomaDestino()));
  }
}
....

|===


[cols="2", options="header"]
|===

2+a|
[blue]#*Ejemplo6:*# Traductor de Español a Inglés
a|
* Estructura: etiquetas y áreas de texto con scroll para el idioma origen y el idioma destino, botón para traducir, etiqueta para el sentido de la traducción y tres botones de radio alternativos para conmutar el sentido de la traducción el origen y destino independientemente;

* el resto se mantiene igual sin color resaltado

^.^a|
image:traductorEspañolIngles6.png[]

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/8-jerarquizacionVistas5NivelesReutilizacion/0-index.adoc ===== -->

### Jerarquización de las vistas en 5 niveles con reutilización

[cols="75,25", options="header"]
|===

2+a|
- *Responsabilidad de las Clases:*

a|
* la *VentanaTraductor* hija de *JFrame*

** el *PanelTraductor* hija de *JPanel* 

*** un *PanelTextos* hija de *JPanel* 

**** dos etiquetas para los título de áreas

**** dos *JScrollPane*

***** un *JTextArea* para el texto origen y destino

**** un *JButton* para traducir

*** dos paneles *PanelSeleccionIdiomas* hija de *JPanel*

**** tres *JRadioButton*

a|
- Tanto la _VentanaTraductor_ como los paneles _PanelTraductor_, _PanelTextos_ y _PanelSelecciónIdiomas_ están asociados al _Traductor_;

|===


[source, java]
....
package pooa;

import javax.swing.JPanel;

class PanelTraductor extends JPanel {

  private PanelTextos panelTextos;
    
  public PanelTraductor(Traductor traductor) {
    panelTextos = new PanelTextos(traductor);
    PanelSeleccionIdioma panelIdiomaOrigen =
      new PanelSeleccionIdioma(
        PanelSeleccionIdioma.IDIOMA_ORIGEN, traductor, this);
    PanelSeleccionIdioma panelIdiomaDestino = 
      new PanelSeleccionIdioma(
        PanelSeleccionIdioma.IDIOMA_DESTINO, traductor, this);
    this.add(panelTextos);
    this.add(panelIdiomaOrigen);
    this.add(panelIdiomaDestino);
  }

  public void muestraIdiomas() {
     panelTextos.muestraIdiomas();
  }
}
....

[cols="2"]
|===

a|
[source,java]
....
package pooa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class PanelTextos extends JPanel implements ActionListener {

  private Traductor traductor;
  private JLabel idiomaOrigen;
  private JLabel idiomaDestino;
  private JTextArea textoOrigen;
  private JTextArea textoDestino;
  public PanelTextos(Traductor traductor) {
    this.traductor = traductor;
    this.setBorder(
      BorderFactory.createTitledBorder(" Traduccion "));
    idiomaOrigen = new JLabel();
    idiomaDestino = new JLabel();
    this.muestraIdiomas();
    textoOrigen = new JTextArea("Escriba texto aqui", 4, 20);
    JScrollPane spAreaOrigen = new JScrollPane(textoOrigen);
    textoDestino = new JTextArea("Aquí la traduccion", 4, 20);
    JScrollPane spAreaDestino = new JScrollPane(textoDestino);
    textoDestino.setEditable(false);
    JButton traducir = new JButton("Traducir");
    traducir.addActionListener(this);

    this.add(idiomaOrigen);
    this.add(spAreaOrigen);
    this.add(idiomaDestino);
    this.add(spAreaDestino);
    this.add(traducir);
  }
  public void actionPerformed(ActionEvent e) {
    textoDestino.setText(
      traductor.traduceTexto(
        textoOrigen.getText()));
  }

  public void muestraIdiomas() {
    idiomaOrigen.setText(" Idioma " +
      Traductor.getCadenaIdioma(traductor.getIdiomaOrigen()));
    idiomaDestino.setText(" Idioma " +
      Traductor.getCadenaIdioma(traductor.getIdiomaDestino()));
  }
}
....

a|
[source, java]
....
package pooa;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class PanelSeleccionIdioma extends JPanel 
		implements ItemListener {

  public static final int IDIOMA_ORIGEN = 0;
  public static final int IDIOMA_DESTINO = 1;
  private Traductor traductor;
  private int tipoIdioma;
  private PanelTraductor panelTraductor;
  public PanelSeleccionIdioma(int tipoIdioma,
      Traductor traductor, PanelTraductor panelTraductor) {
    this.panelTraductor = panelTraductor;
    this.tipoIdioma = tipoIdioma;
    this.traductor = traductor;
    this.setBorder(
      BorderFactory.createTitledBorder(
        new String[]{" Idioma Origen ", " Idioma Destino "}
          [tipoIdioma]));
    JRadioButton[] idiomaSeleccionado =
      new JRadioButton[Traductor.NUM_IDIOMAS];
    ButtonGroup grupo = new ButtonGroup();
    for (int i = 0; i < idiomaSeleccionado.length; i++) {
      idiomaSeleccionado[i] = 
        new JRadioButton(Traductor.getCadenaIdioma(i));
      grupo.add(idiomaSeleccionado[i]);
      idiomaSeleccionado[i].addItemListener(this);
      this.add(idiomaSeleccionado[i]);
    }
    if (tipoIdioma == IDIOMA_ORIGEN) {
      idiomaSeleccionado[traductor.getIdiomaOrigen()]
        .setSelected(true);
    } else {
      idiomaSeleccionado[traductor.getIdiomaDestino()]
        .setSelected(true);
    }
  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange() == ItemEvent.SELECTED) {
      int numBoton = Traductor.getCodIdioma(
        ((JRadioButton) e.getSource()).getText());
      if (tipoIdioma == IDIOMA_ORIGEN) {
        traductor.setIdiomaOrigen(numBoton);
      } else if (tipoIdioma == IDIOMA_DESTINO) {
        traductor.setIdiomaDestino(numBoton);
      }
      panelTraductor.muestraIdiomas();
    }
  }

....

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/diagramaAsociacion.adoc ===== -->

[plantuml, Asociacion, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
class Objeto
class "Objeto atributo" as objetoAtributo
Objeto -right-> objetoAtributo
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/diagramaComposicion.adoc ===== -->

[plantuml, Composicion, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
class Contenedor
class Componente
Contenedor -left-o Componente
....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/diagramaDependencia.adoc ===== -->

[plantuml, Dependencia, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
class Objeto
class "Objeto usado como\n parametro local" as objetoParametroLocal
Objeto .right.> objetoParametroLocal
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/diagramaEventos.adoc ===== -->

[plantuml, Eventos, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
class Componente
class "Objeto con el código \nde gestión de eventos" as objetoEventos
Componente .left.* objetoEventos
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/1-programacionEventos(I)/8-arquitecturaGUI/diagramaHerencia.adoc ===== -->

[plantuml, Herencia, svg]
....
skinparam backgroundColor #222222
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

skinparam class {
    BorderThickness 3
    BorderColor #C0C0C0
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #C0C0C0
}
class "Clase Padre" as clasePadre
class "Clase Hija" as claseHija
clasePadre <\|-- claseHija
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/0-index.adoc ===== -->


include::1-introduccion/0-index.adoc[]
include::2-paneles.adoc[]
include::3-menus/0-index.adoc[]
include::4-ventanas.adoc[]
include::5-clasesInternas.adoc[]
include::6-clasesAnonimas.adoc[]
include::7-distribuidores.adoc[]






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/1-introduccion/0-index.adoc ===== -->

## Introducción

### Elementos gráficos avanzados

[cols="50,50"]
|===

a|
* _Paneles:_

image:paneles2.png[]

.2+^.^a|
* _Ventanas:_

image:ventanas.png[]

image:ventanas2.png[]

a|
* _Menús:_

image:menus.png[]

|===

[cols="40,60", options="header"]
|===

2+a|
[blue]#*Ejemplo:*#

a|
* la _AplicaciónTraductor_ tiene un _Traductor_ y una _VentanaTraductor_ que hereda de *JFrame*; mantiene las funcionalidades de la exposición anterior  junto con la posibilidad de gestionar diccionarios al abrir, añadir palabras y grabar desde distintos ficheros;

* la _VentanaTraductor_ contiene:

** un panel dividido con un _PanelTraductor_ y un _PanelListado_, derivadas ambas de *JPanel*, como elementos izquierdo y derecho respectivamente; el _PanelTraductor_ permite traducir palabras entre idiomas origen y destino configurables y el _PanelListado_ permite gestionar el diccionario y añadir palabras;

** una barra _BarraMenus_ derivada de *JMenuBar*; que permite salir de la aplicación, gestionar el diccionario a través de ficheros y configurar los idiomas origen y destino de la traducción;

a|
* el _PanelTraductor_ tiene un panel por pestañas, *JTabbedPane*, con un _PanelTextos_ y un _PanelSeleccionIdiomas_;

** el _PanelTextos_ permite traducir una secuencia de palabras en entre los idiomas origen y destino configurados; además contiene:

*** un _MenúContextual_ que hereda de *JPopupMenu*; este menú permite configurar los idiomas origen y destino de traducción;

*** una _BarraHerramientas_ que hereda de *JToolBar*; que también permite modificar los idiomas origen y destino de traducción;

* el _PanelListado_ muestra todas las palabras del diccionario permitiendo abrir un nuevo diccionario, añadirle palabras y grabar el diccionario actual; para lo cual contiene:

** un _Dialogo_ que hereda de *JDialog*; para añadir palabras al diccionario;

* Para mantener la coherencia de todos los elementos gráficos (que dependen de los idiomas origen y destino de traducción: _BarraMenus_, _BarraHerramientas_ y _PanelSeleccionIdiomas_) y reutilizar código (para la gestión del diccionario: _BarraMenus_ y _PanelListado_) se incorpora la clase _GestorConfiguración_  que centraliza estos aspectos; ésta contiene:

** un *JFileChooser* para seleccionar el fichero del diccionario a abrir o guardar;
|===


[cols="40,60", grid=none, frame=none]
|===

^.^a|[red]#*Ejemplo:*#

- diagramas de clases del proyecto  _AplicacionTraductor_ señalando en amarillo las clases de los paquetes *javax.swing* y *java.awt* 

^.^a|

include::diagramaAplicacionTraductor.adoc[]

|===



<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/1-introduccion/diagramaAplicacionTraductor.adoc ===== -->

[plantuml, AplicacionTraductor, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam rectangle {
    BorderThickness 3
    BorderColor #DarkGrey
    BorderColor<<amarillo >> #FFD700
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
    FontColor<<amarillo >> #FFD700
}
hide stereotype
rectangle AplicacionTraductor
rectangle VentanaTraductor
rectangle JFrame <<amarillo >>
rectangle Traductor

AplicacionTraductor *-- VentanaTraductor
AplicacionTraductor *-- Traductor
JFrame <\|-- VentanaTraductor

rectangle BarraMenus
rectangle JMenuBar <<amarillo >>
rectangle JSplitPane <<amarillo >>
rectangle GestorConfiguracion
VentanaTraductor *-- BarraMenus
VentanaTraductor *-- JSplitPane
VentanaTraductor *--- GestorConfiguracion
JMenuBar <\|-- BarraMenus
GestorConfiguracion <-up-- Traductor

rectangle JPanel <<amarillo >>
rectangle PanelListado
rectangle PanelTraductor
rectangle PanelTextos
rectangle PanelSeleccionIdioma
JSplitPane *-- PanelTraductor
JSplitPane *-- PanelListado
JPanel <\|-- PanelListado
JPanel <\|--  PanelTraductor
JPanel <\|-- PanelTextos
JPanel <\|-- PanelSeleccionIdioma
rectangle JPopupMenu <<amarillo >>
rectangle MenuContextual
JPopupMenu <\|-- MenuContextual
PanelTextos *-- MenuContextual
rectangle BarraHerramientas
rectangle JTabbedPane <<amarillo >>
rectangle JToolBar <<amarillo >>
rectangle DialogoAnyadir
rectangle JDialog <<amarillo >>
rectangle JFileChooser <<amarillo >>
PanelTraductor *-- BarraHerramientas
PanelTraductor *-- JTabbedPane
BarraHerramientas -[hidden] JTabbedPane
JTabbedPane *-- PanelTextos
JTabbedPane *-- PanelSeleccionIdioma
JToolBar <\|--   BarraHerramientas 
PanelListado --> GestorConfiguracion
PanelListado *-- DialogoAnyadir
JDialog <\|--  DialogoAnyadir
JSplitPane -[hidden]- JPanel
GestorConfiguracion <-up- DialogoAnyadir
GestorConfiguracion <-up- BarraHerramientas
GestorConfiguracion <-up- PanelSeleccionIdioma
GestorConfiguracion <-up- PanelTextos
GestorConfiguracion <-up- MenuContextual
GestorConfiguracion *-- JFileChooser
....




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/2-paneles.adoc ===== -->

## Paneles

[cols="2", options="header"]
|===

a|
 *Paneles divididos:*
a|
 *Paneles por pestañas:*
a|
[source, java]
....
class JSplitPane extends JPanel {
  public static int HORIZONTAL_SPLIT;
  public static int VERTICAL_SPLIT;
  public JSplitPane(int orientacion);
  public void setLeftComponent(JPanel panel);
  public void setRightComponent(JPanel panel); 
  public void setTopComponent(JPanel panel);
  public void setBottomComponent(JPanel panel);
  /* añade elementos al panel dividido */
  …
}
package pooa;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

class VentanaTraductor extends JFrame {

  public VentanaTraductor(Traductor traductor) {
    this.setTitle("Traductor");

    GestorConfiguracion gestorConfiguracion =
        new GestorConfiguracion(traductor);
    PanelTraductor panelTraductor = 
        new PanelTraductor(gestorConfiguracion);
    PanelListado panelListado = 
        new PanelListado(gestorConfiguracion);
    JSplitPane panelDividido = new JSplitPane();
    panelDividido.setLeftComponent(panelTraductor);
    panelDividido.setRightComponent(panelListado);
    this.setContentPane(panelDividido);
    
    gestorConfiguracion.actualizar();
    this.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
    this.setLocation(150, 150);
    this.pack();
    this.setResizable(false);
    this.setVisible(true);
    }
}
....

a|
[source, java]
....
class JTabbedPane extends JPanel {
  public JTabbedPane();
  public void addTab(String titulo, 
	Component componente);
  /* añade una pestaña al panel */
  public void setSelectedIndex(int tab); 
  /* selecciona el panel visible */
  …
}
package pooa;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class PanelTraductor extends JPanel {

  private PanelTextos panelTextos;
  private PanelSeleccionIdioma panelIdiomaOrigen;
  private PanelSeleccionIdioma panelIdiomaDestino;

  public PanelTraductor(
      GestorConfiguracion gestorConfiguracion) {
    gestorConfiguracion.setPanelTraductor(this);
    panelTextos = 
        new PanelTextos(gestorConfiguracion);
    panelIdiomaOrigen = new PanelSeleccionIdioma(
        GestorConfiguracion.IDIOMA_ORIGEN,
        gestorConfiguracion);
    panelIdiomaDestino = new PanelSeleccionIdioma(
        GestorConfiguracion.IDIOMA_DESTINO, 
        gestorConfiguracion);
    JPanel panelIdiomas = new JPanel();
    panelIdiomas.add(panelIdiomaOrigen);
    panelIdiomas.add(panelIdiomaDestino );

    JTabbedPane pestanyas = new JTabbedPane();
    pestanyas.addTab("Traducción", panelTextos);
    pestanyas.addTab("Configuración", panelIdiomas);
    pestanyas.setSelectedIndex(0);
    this.add(pestanyas);
  }
....
|===








<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/3-menus/0-index.adoc ===== -->

## Menús

[cols="40,60"]
|===

a| - *Barras de Menús:*
* una barra de menús (*JMenuBar*) está asociada a una ventana (*JFrame*) y contiene menús;

* un menú (*JMenu*) puede contener elementos de menú y, a su vez, submenús que son otros menús; este es el motivo por el que *JMenu* hereda de *JMenuItem*;

*  los elementos de un menú pueden ser, análogamente a los botones, normales (*JMenuItem*),
radio elementos (*JRadioButtonMenuItem*) o elementos con chequeo (*JCheckBoxMenuItem*) ;

^.^a|
include::diagramaMenus.adoc[]

|===

[cols="50,50"]
|===

a|
[source, java]
....
class JFrame … {
  public void setJMenuBar(JMenuBar barraMenus);
  /* asocia la barra de menús a la ventana */
  …
}
class JMenuBar … {
  public JMenuBar();
  public add(JMenu menu);
  /* añade un menú a la barra de menús */
  …
}
class JMenu extends JItemMenu … {
  public JMenu(String titulo);
  public void setMnemonic(int teclaRapida);
  public add(JMenuItem elementoMenu);
  /* añade un elemento al menú */
  public addSeparator();
  /* añade una línea de separación entre 
     los elementos del menú */
  …
}
class JMenuItem … {
  public JMenuItem(String titulo,
                   int teclaRapida);
  /* configura las teclas rápidas de menu con   
     valores KeyEvent.VK_<letra> */
  public void addActionListener(
      ActionListener auditor);
  public void addItemListener(
      ItemListener auditor);
  …
}
package pooa;

…

class VentanaTraductor extends JFrame {

  public VentanaTraductor(Traductor traductor) {
    this.setTitle("Traductor");
    GestorConfiguracion gestorConfiguracion =
        new GestorConfiguracion(traductor);
    BarraMenus barraMenus =
	  new BarraMenus(gestorConfiguracion);
    this.setJMenuBar(barraMenus);
  }
}  
package pooa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

class BarraMenus extends JMenuBar 
		implements ActionListener
    ItemListener {
  private JMenuItem abrir;
  private JMenuItem guardar;  
  private JMenuItem salir;
  private JMenu[] sentidos;
  private JRadioButtonMenuItem[][] idiomas;
  private GestorConfiguracion gestorConfiguracion;
....
a|
[source,java]
....
public BarraMenus(
        GestorConfiguracion gestorConfiguracion) {
    this.gestorConfiguracion = gestorConfiguracion;
    gestorConfiguracion.setBarraMenus(this);
    JMenu diccionario = new JMenu("Diccionario");
    diccionario.setMnemonic(KeyEvent.VK_D);
    this.add(diccionario);
    abrir = new JMenuItem("Abrir", KeyEvent.VK_R);
    abrir.addActionListener(this);
    diccionario.add(abrir);
    guardar = new JMenuItem("Guardar", KeyEvent.VK_G);
    guardar.addActionListener(this);
    diccionario.add(guardar);
    diccionario.addSeparator();
    salir = new JMenuItem("Salir", KeyEvent.VK_S);
    salir.addActionListener(this);
    diccionario.add(salir);
    JMenu configuracion = new JMenu("Configuración");
    configuracion.setMnemonic(KeyEvent.VK_C);
    sentidos = new JMenu[2];
    idiomas = new JRadioButtonMenuItem[2]
                [Traductor.NUM_IDIOMAS];
    for (int i = 0; i < 2; i++) {
      sentidos[i] = new JMenu(new String[]
                            {"Origen", "Destino"}[i]);
      configuracion.add(sentidos[i]);
      ButtonGroup grupo = new ButtonGroup();
      for (int j = 0; j < Traductor.NUM_IDIOMAS; j++) {
        idiomas[i][j] = new JRadioButtonMenuItem(
                     i + Traductor.getCadenaIdioma(j));
        grupo.add(idiomas[i][j]);
        idiomas[i][j].addItemListener(this);
        sentidos[i].add(idiomas[i][j]);
      }
    }
    this.add(configuracion);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == abrir) {
      gestorConfiguracion.abrir();
    } else if (e.getSource() == guardar) {
      gestorConfiguracion.guardar();
    } else {
      System.exit(0);
  }
  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange() == ItemEvent.SELECTED) {
      int sentido = 0;
      int idioma = 0;
      while (idiomas[sentido][idioma]!=e.getSource()) {
        idioma++;
        if (idioma == idiomas[sentido].length) {
          sentido++;
          idioma = 0;
        }
      }
      gestorConfiguracion.actualizar(sentido, idioma);
    }
  }
....

|===

[cols="50,50"]
|===

a|
- *Menús de Contexto:*

* los menús de contexto (*JPopupMenu*) están asociados a cualquier componente (*JComponent*) y contiene elementos de ménú;

^.^a|
include::diagramaMenus.adoc[]

|===


[cols="50,50"]
|===

a|
[source, java]
....
class JComponent … {
  public void setComponentPopupMenu(
      JPopupMenu menuContexto);
  /* asocia el menú de contexto al componente */
  …
}
class JPopupMenu … {
  public JPopupMenu();
  public void add(JMenuItem elementoMenu);
  /* añade un elemento al menú */
  …
}
package pooa;

…

class PanelTextos extends JPanel 
		implements ActionListener {

  …
  private MenuContextual menuContextual;

  public PanelTextos(
        GestorConfiguracion gestorConfiguracion) {
    this.traductor= gestorConfiguracion.getTraductor();
    menuContextual = 
        new MenuContextual(gestorConfiguracion);
    this.setComponentPopupMenu(menuContextual);    

package pooa;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

class MenuContextual extends JPopupMenu
		implements ItemListener {
....

a|
[source, java]
....
  private JMenu[] sentidos;
  private JRadioButtonMenuItem[][] idiomas;
  private GestorConfiguracion gestorConfiguracion;

  public MenuContextual(
      GestorConfiguracion gestorConfiguracion) {
    this.gestorConfiguracion = gestorConfiguracion;
    Traductor traductor = 
        gestorConfiguracion.getTraductor();
    sentidos = new JMenu[2];
    idiomas = new JRadioButtonMenuItem[2]
                          [Traductor.NUM_IDIOMAS];
    for (int i = 0; i < 2; i++) {
      sentidos[i] = new JMenu(new String[]
                           {"Origen", "Destino"}[i]);
      this.add(sentidos[i]);
      ButtonGroup grupo = new ButtonGroup();
      for (int j = 0; j<Traductor.NUM_IDIOMAS; j++) {
        idiomas[i][j] = new JRadioButtonMenuItem(
                   i + Traductor.getCadenaIdioma(j));
        grupo.add(idiomas[i][j]);
        idiomas[i][j].addItemListener(this);
        sentidos[i].add(idiomas[i][j]);
      }
    }
  }
  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange() == ItemEvent.SELECTED) {
      int sentido = 0;
      int idioma = 0;
      while(idiomas[sentido][idioma]!=e.getSource()) {
        idioma++;
        if (idioma == idiomas[sentido].length) {
          sentido++;
          idioma = 0;
        }
      }
      gestorConfiguracion.actualizar(sentido, idioma);
    }
  }
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/3-menus/diagramaMenus.adoc ===== -->

[plantuml, Menus, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam rectangle {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
}

rectangle JComponent
rectangle JMenuBar
rectangle AbstractBotton
rectangle JPopupMenu
rectangle JMenuItem
together {
rectangle JMenu
rectangle JCheckBoxMenuItem
rectangle JRadioButtonMenuItem
}
JComponent <\|-- JMenuBar
JComponent <\|-- AbstractBotton
JComponent <\|-- JPopupMenu
JComponent ..> JPopupMenu : componentPopupMenu
JPopupMenu ..>"*" JMenuItem : item
AbstractBotton <\|-- JMenuItem
JMenuBar ..> " * " JMenu :menu
JMenu ..> "*" JMenuItem : item
JMenuItem <\|-- JMenu
JMenuItem <\|-- JCheckBoxMenuItem
JMenuItem  <\|-- JRadioButtonMenuItem
JMenu -[hidden] JCheckBoxMenuItem
....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/4-ventanas.adoc ===== -->

## Ventanas

- *Barra de Herramientas:*

* las barras de herramientas (JToolBar) 

** son ventanas asociadas a un panel (JPanel) que pueden estar independientes o ancladas al borde del panel perdiendo la visualización del título;

** se puede añadir cualquier control (etiquetas, texto de entrada, botones, botones presionados, …)  y separadores;

[cols="50,50"]
|===

a|
[source, java]
....
class JPanel … {
  public add(JComponent componente);
  …
}
class JToolBar extends JComponent {
  public JToolBar();
  public void add(JComponent componente);
  public void addSeparator(); 
  …
}
class JToggleButton extend JButton {
  public void setIcon(ImageIcon icono);
  /* configura la imagen del botón */
  public void doClick();
  /* cambia la presencia del botón: 
     presionado o no presionado */
  …
}
class ImageIcon … {
  public ImageIcon(URL url, String toolTip);
  /* crea una imagen a partir de la URL de un 
     fichero formato GIF y el texto explicativo  
     cuando el ratón se posiciona sobre la imagen */
  …
}
class URL … {
  …
}
class Class … {
  public URL getResource(String ruta);
  …
}
class Object {
  public Class getClass();
  …
}
package pooa;
…
class PanelTraductor extends JPanel {
  …
 public PanelTraductor(
      GestorConfiguracion gestorConfiguracion) {
    …
    BarraHerramientas barraHerramientas = 
        new BarraHerramientas(gestorConfiguracion);
    this.add(barraHerramientas);
    …
  }
....

a|
[source, java]
....
package pooa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

class BarraHerramientas extends JToolBar 
		implements ActionListener {

  private JToggleButton[][] botones;
  private GestorConfiguracion gestorConfiguracion;

  public BarraHerramientas(
      GestorConfiguracion gestorConfiguracion) {
    super("Barra de Herramientas Anclable");
    this.gestorConfiguracion = gestorConfiguracion;
    gestorConfiguracion.setBarraHerramientas(this);
    botones = new JToggleButton[2]
                            [Traductor.NUM_IDIOMAS];
    for (int i = 0; i < botones.length; i++) {
      this.add(new JLabel(new String[]
            {"Idioma origen:", "Idioma destino"}[i]));
      for (int j = 0; j < botones[i].length; j++) {
	  String idioma = new String[]
          {"francia", "espanya", "inglaterra"}[j];
        botones[i][j] = new JToggleButton();
        URL url = this.getClass().getResource(
            "imagenes/" + idioma + ".GIF");
        ImageIcon imagen = new ImageIcon(url, idioma);
        botones[i][j].setIcon(imagen);
        botones[i][j].addActionListener(this);
        this.add(botones[i][j]);
      }
	this.addSeparator();
    }
  }
  public void actionPerformed(ActionEvent e) {
    int sentido = 0;
    int idioma = 0;
    while (botones[sentido][idioma] != e.getSource()) {
      idioma++;
      if (idioma == botones[sentido].length) {
        sentido++;
        idioma = 0;
      }
    }
    gestorConfiguracion.actualizar(sentido, idioma);
  }

....
|===


- *Diálogos:*

* los diálogos (*JDialog*) :

** son ventanas asociadas a otras ventanas y bloquean la interacción del usuario con la ventana asociada (modal) o si permiten la interacción (no modal) ;

** como ventanas que son, comparten el comportamiento de las ventanas (*JFrame*);

[cols="50,50"]
|===

a|
[source, java]
....
class JDialog …  {
  public JDialog(JFrame ventana,	String titulo);
  /* contruye el diálogo con un título y 
     asociada a una ventana */
  public void setContentPane(JPanel panel);
  public void pack();
  /* conforma su marco acorde al
     tamaño de su panel */
  public void setModal(boolean modo);
  public void setLocation(int x, int y);
  public void setVisible(boolean visible);
  …
}
package pooa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class PanelListado extends JPanel 
		implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == guardar) {
      gestorConfiguracion.guardar();
    } else if (e.getSource() == abrir) {
      gestorConfiguracion.abrir();
    } else {
      DialogoAnyadir dialogoAnyadir = 
          new DialogoAnyadir();
      if (dialogoAnyadir.valido()) {
        traductor.anyadir(
            dialogoAnyadir.nuevaPalabra());
        gestorConfiguracion.actualizar();
      } else {
        JOptionPane.showMessageDialog(this,
            "No se puede anyadir una nueva palabra", 
            "AVISO", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
package pooa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
....

a|
[source,java]
....
class DialogoAnyadir extends JDialog 
		implements ActionListener {

  private JTextField[] entradas;
  private JLabel[] idiomas;
  private JButton anyadir;
  private JButton cancelar;
  private boolean valido;
  public DialogoAnyadir() {
    super(AplicacionTraductor.getVentanaTraductor(),
        "Anyadir palabras al diccionario");
    this.entradas = new JTextField
                              [Traductor.NUM_IDIOMAS];
    this.idiomas = new JLabel[Traductor.NUM_IDIOMAS];
    for (int i = 0; i < Traductor.NUM_IDIOMAS; i++) {
      idiomas[i] = new JLabel(
          Traductor.getCadenaIdioma(i));
      entradas[i] = new JTextField();
    }
    anyadir = new JButton("Anyadir");
    anyadir.addActionListener(this);
    cancelar = new JButton("Cancelar");
    cancelar.addActionListener(this);
   
    JPanel panel = new JPanel();
    panel.add(anyadir);
    panel.add(cancelar);
    this.setContentPane(panel);
    this.setModal(true);
    this.setLocation(300, 300);
    this.pack();
    this.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == anyadir) {
      int valido = 0;
      for (int i=0; i < Traductor.NUM_IDIOMAS; i++) {
        if (!entradas[i].getText().equals("")) {
          valido++;
        }
      }
      this.valido = valido == Traductor.NUM_IDIOMAS;
    }
    this.setVisible(false);
  }
  public boolean valido() {
    return valido;
  }
	
  public String[] nuevaPalabra() {
    String[] nuevaPalabra = 
        new String[Traductor.NUM_IDIOMAS];
    for (int i = 0; i < Traductor.NUM_IDIOMAS; i++) {
      nuevaPalabra[i] = entradas[i].getText();
    }
    return nuevaPalabra;
  }
}
....
|===


- *Diálogos Predefinidos:*

* la biblioteca de Java incorpora diálogos de uso recurrente en las aplicaciónes:

** selector de color (*JColorChooser*), selector de ficheros (*JFileChooser*), … ;

** son diálogos con comportamiento específico;

[cols="50,50"]
|===

a|
[source, java]
....
class JFileChooser … {
  public JFileChooser();
  public int showSaveDialog(JFrame ventana);
  public int showOpenDialog(JFrame ventana);
  /* abren el diálogo asociado a una ventana y 
devuelven un código que determina la elección */
  public static int APPROVE_OPTION;
  public File getSelectedFile(); 
  …
}
package pooa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

class GestorConfiguracion {

  public static final int IDIOMA_ORIGEN = 0;
  public static final int IDIOMA_DESTINO = 1;
  private Traductor traductor;
  private BarraMenus barraMenus;
  private PanelTraductor panelTraductor;
  private BarraHerramientas barraHerramientas;
  private PanelListado panelListado;
  private boolean actualizado = false;
  public GestorConfiguracion(Traductor traductor) {
    this.traductor = traductor;
  }

  public Traductor getTraductor() {
    return traductor;
  }

  public void setBarraMenus(BarraMenus barraMenus) {
    this.barraMenus = barraMenus;
  }

  public void setPanelTraductor(
      PanelTraductor panelTraductor) {
    this.panelTraductor = panelTraductor;
  }

  public void setBarraHerramientas(
      BarraHerramientas barraHerramientas) {
    this.barraHerramientas = barraHerramientas;
  }
  public void setPanelListado(
      PanelListado panelListado) {
    this.panelListado = panelListado;
  }

  public void actualizar(int sentido, int idioma) {
    if (!actualizado) {
      actualizado = true;
      if (sentido == 
          GestorConfiguracion.IDIOMA_ORIGEN)
        traductor.setIdiomaOrigen(idioma);
      else 
        traductor.setIdiomaDestino(idioma);
      barraMenus.actualizar(sentido, idioma);
      panelTraductor.actualizar(sentido, idioma);
      barraHerramientas.actualizar(sentido, idioma);
      panelListado.actualizar();
      actualizado = false;
    }
  }
....

a|
[source,java]
....
  public void guardar() {
    ArrayList<String>[] palabras = 
        new ArrayList[Traductor.NUM_IDIOMAS];
    for (int i = 0; i < palabras.length; i++) 
      palabras[i] = traductor.getPalabras(i);
    JFileChooser selector = new JFileChooser();
    int seleccion = selector.showSaveDialog(
        AplicacionTraductor.getVentanaTraductor());
    if (seleccion == JFileChooser.APPROVE_OPTION) {
      try {
	  PrintWriter salida = 
          new PrintWriter(selector.getSelectedFile());
        for (int i = 0; i<Traductor.NUM_IDIOMAS; i++) {
          for (int j = 0; j<palabras[0].size(); j++) {
            salida.print(palabras[i].get(j) + "/")	
          }
          salida.println();
        }
        salida.close();
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(
            AplicacionTraductor.getVentanaTraductor(),
		"El fichero no se puede guardar", "AVISO",
            JOptionPane.ERROR_MESSAGE);
	}
    }
  }

  public void abrir() {
    JFileChooser selector = new JFileChooser();
    int seleccion = selector.showOpenDialog(
        AplicacionTraductor.getVentanaTraductor());
    if (seleccion == JFileChooser.APPROVE_OPTION) {
      try {
        BufferedReader entrada = new BufferedReader(
           new FileReader(selector.getSelectedFile()));
	  ArrayList<String>[] idiomas = 
           new ArrayList[Traductor.NUM_IDIOMAS];
        for (int i = 0; i<Traductor.NUM_IDIOMAS; i++) {
          idiomas[i] = new ArrayList<String>();
          String idioma = entrada.readLine();
          StringTokenizer analizador = 
              new StringTokenizer(idioma, "/");
          while (analizador.hasMoreElements())
            idiomas[i].add(analizador.nextToken());
        }
        traductor.set(idiomas);
        entrada.close();
        this.actualizar();
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(
            AplicacionTraductor.getVentanaTraductor(),
            "El fichero no se puede abrir", "AVISO",
            JOptionPane.ERROR_MESSAGE);
      }
    }
  }
....
|===

[cols="50,50"]
|===

a|
- *Ventanas sin Marco:*
* estas ventanas (*JWindow*) se utilizan en el arranque de la aplicación y son gestionadas automáticamente a través de la opción de la máquina virtual en las propiedades del proyecto:  _–splash:<fichero>.GIF_

^.^a|
image:ventanaSinMarco.png[]

|===








<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/5-clasesInternas.adoc ===== -->

## Clases Internas

[cols="50,50"]
|===

2+a|
- *Definición:* una clase interna es aquella cuya declaración se encuentra inmersa dentro de la declaración de otra clase; 

a|
- *Implicaciones (I):*

* puede estar declarada:

** con ámbito de miembro (fuera de cualquier método de la clase contenedora); puede ser privada, protegida, pública o de paquete y será accesible acorde al modificador de visibilidad;

** con ámbito local (dentro de un método de la clase contenedora); en tal caso, solo es accesible desde el cuerpo del método;

* la sintaxis para acceder a la clase interna es:

[source, java]
....
ClaseContenedora.ClaseInterna
....

a|
- *Implicaciones (II):*

* desde la clase interna se tiene acceso *directamente* a:

** los métodos de la clase contenedora; 

** a los atributos de la clase contenedora, incluso siendo con visibilidad privada;

** si la clase es local, además a los parámetros y declaraciones locales del método contenedor sólo si son _final_; 

** la sintaxis para acceder a la referencia del objeto contenedor es:

[source, java]
....
ClaseContenedora.this
....

2+a|
* por tanto, los objetos de las clase interna existen si existe un objeto de la clase contenedora al que están asociados; la sintaxis para la creación de objetos de la clase interna es:

[source, java]
....
<refClaseContenedora>.new ClaseInterna(…);
....

|===


[cols="50,50"]
|===

a|
- *Motivación:* 

* _agrupación lógica de clases_:  cuando una clase es útil únicamente a otra, es lógico embeberla dentro de ésta y guardarlas juntas; anidando estas “clases de ayuda”, se dispone de nuevos elementos de empaquetamiento;

* _incremento de la encapsulación_: considerando dos clase, A y B, donde B necesita acceder a los miembros de A que deberían ser declarados privados. Al anidar la clase B en la clase A, los miembros de la clase A son declarados privados y B puede acceder a ellos. Además, la propia clase B puede ser oculta a la totalidad del resto de la aplicación;

* _aumento de la legibilidad y mantenibilidad_: pequeñas clases anidadas en clases ubica el código más cerca de donde se usa;

[source, java]
....
class PanelTraductor extends JPanel {

  private class PanelTextos extends JPanel
      	implements ActionListener { … }

  private class PanelSeleccionIdioma extends JPanel
	      implements ItemListener { … }

  class BarraHerramientas extends JToolBar
      	implements ActionListener { … }
  …

....

a|
*  _donde las clases internas *PanelTextos* y *PanelSeleccionIdioma* son privadas porque sólo se accede a ellas desde la implantación de la clase PanelTraductor, mientras que la clase interna *BarraHerramientas* tiene visibilidad de paquete porque se requiere desde la clase *GestorConfiguración*;_

[source, java]
....
  private PanelTraductor.PanelTextos panelTextos;
  private PanelTraductor.PanelSeleccionIdioma 
      panelIdiomaOrigen;
  private PanelTraductor.PanelSeleccionIdioma 
      panelIdiomaDestino;

 public PanelTraductor(
       GestorConfiguracion gestorConfiguracion) {
   gestorConfiguracion.setPanelTraductor(this);
   panelTextos = 
       this.new PanelTextos(gestorConfiguracion);
   panelIdiomaOrigen = this.new PanelSeleccionIdioma(
       GestorConfiguracion.IDIOMA_ORIGEN, 
       gestorConfiguracion);
   panelIdiomaDestino = this.new PanelSeleccionIdioma(
       GestorConfiguracion.IDIOMA_DESTINO, 
       gestorConfiguracion);
   PanelTraductor.BarraHerramientas barraHerramientas =
       this.new BarraHerramientas(gestorConfiguracion);
   …
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/6-clasesAnonimas.adoc ===== -->

## Clases Anónimas

[cols="50,50"]
|===

a|
- *Motivación (I)*:

* evitar que una clase audite conjuntamente el mismo tipo de eventos a un grupo de sus controles que requiere la codificación de sentencias alternativas encadenadas que discriminen el control concreto que genera el evento;

[source, java]
....
class PanelTextos extends JPanel 
		implements ActionListener { 

    private JButton traducir;
    private JButton limpiar;

    public PanelTextos(
        GestorConfiguracion gestorConfiguracion) {
      …
      traducir.addActionListener(this);
	limpiar.addActionListener(this);
      …
    }
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == traducir) {
        textoDestino.setText(
            traductor.traduceTexto(
                textoOrigen.getText()));
      } else if (e.getSource() == limpiar) {
          textoOrigen.setText("");
          textoDestino.setText("");
	}
    }
  …
}

....

a|
- *Motivación (II):*

* evitar la proliferación de clases (y sus nombres) para cada uno de los controles responsabilizándose únicamente del manejo del tipo de eventos de un control concreto;

[source, java]
....
class PanelTextos extends JPanel { 

    private JButton traducir;
    private JButton limpiar;

    private class GestorTraducir 
        implements ActionListener {

      public void actionPerformed(ActionEvent e) {
        textoDestino.setText(
            traductor.traduceTexto(
                textoOrigen.getText()));
      }
    } 
    private class GestorLimpiar 
        implements ActionListener {

      public void actionPerformed(ActionEvent e) {
        textoOrigen.setText("");
        textoDestino.setText("");     
      }
    }
    
    public PanelTextos(
        GestorConfiguracion gestorConfiguracion) {
      …
      traducir.addActionListener(new GestorTraducir());
	limpiar.addActionListener(new GestorLimpiar());
      …
    }
    …
  }
....
|===

- *Definición*: son clases internas que carecen de nombre; 

- *Implicaciones (I)*:

* se declaran en la misma sentencia en la que se instancia un objeto de la clase anónima con la siguiente sintaxis:

[source, java]
....
new <Clase/Interfaz base> (<argumentos>) {
  <atributos>
  <métodos>
}
....

[cols="50,50"]
|===

a|
*  no admiten la declaración de constructores;

* los <_argumentos_> debe ser una lista vacía si implementa un interfaz o los correspondientes argumentos de alguno de los constructores si extiende una clase;

[source, java]
....
class PanelTextos extends JPanel { 

  private JButton traducir;
  private JButton limpiar;

  public PanelTextos(
      GestorConfiguracion gestorConfiguracion) {
    …
    traducir.addActionListener(new ActionListener () {
      public void actionPerformed(ActionEvent e) {
        textoDestino.setText(
            traductor.traduceTexto(
                textoOrigen.getText()));
      }
    });
    limpiar.addActionListener(new ActionListener () {
      public void actionPerformed(ActionEvent e) {
        textoOrigen.setText("");
        textoDestino.setText("");     
      }
    });
    …
  }
  …
}
....

a|
* _ otro ejemplo con parámetros final para permitir el acceso desde métodos de las clases internas anónimas;_

[source, java]
....
class BarraMenus extends JMenuBar
		implements ItemListener { 

  private JButton abrir;
  private JButton guardar;
  private JButton salir;

  public BarraMenus(
      final GestorConfiguracion gestorConfiguracion) {
    …
    abrir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        gestorConfiguracion.abrir();
      }
    });
  guardar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      gestorConfiguracion.guardar();
    }
  }); 
  …
  salir.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
  }); 
  …
}
....

|===




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x8-programacionEventos/2-programacionEventos(II)/7-distribuidores.adoc ===== -->

## Distribuidores


[cols="50,50", options="header"]
|===

a| *Definición:*
a| *Jerarquía:*

a|
* son clases cuya responsabilidad es la ubicación de los elementos gráficos de un panel;

* consecuentemente, están asociados bidireccionalmente a un panel;

* son objetos de clases que implementan la interfaz *java.awt*. *LayoutManager* o su subinterfaz *java.awt.LayoutManager2*;

[source, java]
....
class JPanel … {
  public void setLayout(
      LayoutManager distribuidor);
  …
}
....

a|
* *java.awt.FlowLayout* (distribuidor por defecto) al vuelo;

* *java.awt.GridLayout* orientado a la retícula de elementos;

* *java.awt.BorderLayout* orientado a los bordes (norte, este, …);

* *java.awt.GroupLayout*  orientado a grupos horizontales y verticales de elementos gráficos;
 
* *…*

|===


[cols="50,50"]
|===

2+a| *Ejemplo para distribuidor por grupos:*

a|
image:distribuidores.png[]

* del nivel superior al nivel inferior tenemos _horizontalmente_ un único grupo paralelo que contiene dos grupos:

** el primer grupo es secuencial y contiene dos grupos paralelos:

*** cada grupo paralelo tiene una etiqueta y un área de texto;

** el segundo grupo es secuencial y contiene los dos botones;

a|
image:distribuidores2.png[]

* del nivel superior al nivel inferior tenemos _verticalmente_ un único grupo secuencial formado por dos grupos:

** el primer grupo es paralelo y contiene dos grupos secuenciales:

*** cada grupo secuencial contiene una etiqueta y un área de texto;

** el segundo grupo es paralelo y contiene los dos botones;

|===

[cols="50,50"]
|===

a|
- *java.awt.GroupLayout:*

[source, java]
....
class GroupLayout implements LayoutManager2  {
  public GroupLayout(JPanel panel);
  public void setAutoCreateGaps(
      boolean espaciosElementos);
  public void setAutoCreateContainerGaps(
      boolean espaciosBorde);
  public void setHorizontalGroup(
      GroupLayout.Group grupo);
  public void setVerticalGroup(
      GroupLayout.Group grupo);
  public GroupLayout.SequentialGroup
      createSequentialGroup();
  public GroupLayout.ParallelGroup
      createParallelGroup(
          GroupLayout.Alignment alineacion);
…
....
.4+a|
[source, java]
....
package pooa;
 …
class PanelTextos extends JPanel 
		implements ActionListener {

  private Traductor traductor;
  private JButton traducir;
  private JButton limpiar;
  private JLabel idiomaOrigen;
  private JLabel idiomaDestino;
  private JTextArea textoOrigen;
  private JTextArea textoDestino;
  private MenuContextual menuContextual;

  public PanelTextos(
      GestorConfiguracion gestorConfiguracion) {
  idiomaOrigen = new JLabel();
  idiomaDestino = new JLabel();
  textoOrigen = new JTextArea("", 10, 30);
  JScrollPane spAreaOrigen = 
      new JScrollPane(textoOrigen);
  textoDestino = new JTextArea("", 10, 30);
  JScrollPane spAreaDestino = 
      new JScrollPane(textoDestino);
  textoDestino.setEditable(false);
  traducir = new JButton("Traducir");
  limpiar = new JButton("Limpiar");

  GroupLayout distribuidor = new GroupLayout(this);
  this.setLayout(distribuidor);
  distribuidor.setAutoCreateGaps(true);
  distribuidor.setAutoCreateContainerGaps(true);
  distribuidor.setHorizontalGroup(
    distribuidor.createParallelGroup(
        GroupLayout.Alignment.CENTER)
      .addGroup(
        distribuidor.createSequentialGroup()
          .addGroup(
             distribuidor.createParallelGroup()
               .addComponent(idiomaOrigen)
               .addComponent(spAreaOrigen))
          .addGroup(
             distribuidor.createParallelGroup()
               .addComponent(idiomaDestino)
               .addComponent(spAreaDestino)))
      .addGroup(
        distribuidor.createSequentialGroup()
          .addComponent(traducir)
          .addComponent(limpiar)));
  distribuidor.setVerticalGroup(
    distribuidor.createSequentialGroup()
      .addGroup(
        distribuidor.createParallelGroup()
          .addGroup(
            distribuidor.createSequentialGroup()
              .addComponent(idiomaOrigen)
              .addComponent(spAreaOrigen))
          .addGroup(
            distribuidor.createSequentialGroup()
              .addComponent(idiomaDestino)
              .addComponent(spAreaDestino)))
      .addGroup(
        distribuidor.createParallelGroup()
          .addComponent(traducir)
          .addComponent(limpiar)));
}
....

a|
*  además contiene cuatro clases internas:

[source, java]
....
 public abstract class Group {
    public GroupLayout.Group addGroup(
        GroupLayout.Group grupo);
    public GroupLayout.Group addComponent(
        Component componente);
    …
  }
....

a|
* estos métodos devuelven el propio distribuidor por grupos para encadenar mensajes de adición y evita que los componentes se añadan al panel directamente;

[source, java]
....
  public class ParallelGroup extends Group { … }
  public class SequentialGroup extends Group { … }
....

a|
- *java.awt.GroupLayout:*

[source, java]
....
  public enum Alignment {
    BASELINE, /* alineación a la misma altura */
    CENTER,   /* centrando entre los bordes */
    LEADING,  /* justificando a la izquierda */
    TRAILING, /* justificando a la derecha */
    …
  }
....

*  este enumerado permite la alineación de los grupos y componentes en los grupos paralelos;

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/0-index.adoc ===== -->

## 9-Programación Concurrente

include::1-paradigmaProgramacionConcurrente.adoc[]
include::2-arquitecturasSistemasConcurrentes.adoc[]
include::3-abstraccionProgramacionConcurrente.adoc[]
include::4-propiedadesCorrección.adoc[]
include::5-ejecucionProcesos/0-index.adoc[]
include::6-exclucionMutua.adoc[]
include::7-semaforos.adoc[]
include::8-sincronizaciónCondicional.adoc[]
include::9-sincronizacionBarrera.adoc[]
include::10-exclusionMutua2.adoc[]
include::11-exclucionMutuaGeneralizada.adoc[]
include::12-buzones.adoc[]





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/1-paradigmaProgramacionConcurrente.adoc ===== -->

## El paradigma de la programación concurrente

[cols="35,65", options="header"]
|===

2+a| *[blue]#Definición  de concurrencia:#*

a|
* En el ámbito de la programación, la *concurrencia* es el acaecimiento de varios sucesos al mismo tiempo.

* Estos sucesos pueden ser acciones que ejecuta un programa con un cierto fin o pueden ocurrir espontáneamente en su entorno.
a|
* Puesto que, en general, estos sucesos pueden durar un cierto intervalo de tiempo, la concurrencia es un concepto muy amplio, que engloba a los siguientes:

**  *_Paralelismo_*: si los sucesos se producen durante el mismo intervalo de tiempo.

** *_Solapamiento_*: si se producen en intervalos de tiempo superpuestos.

** *_Simultaneidad_*: si se producen en el mismo instante de tiempo (sólo si los sucesos son instantáneos).
|===

[cols="65,35", options="header"]
|===

a| *[blue]#Programación concurrente#*
a| *[blue]#Programa secuencial:#*

a|
* El paradigma de la *programación concurrente* es un conjunto de teorías, métodos y herramientas, cuyo objetivo es la construcción y verificación de programas formados por múltiples actividades que se ejecutan concurrentemente para llevar a cabo una cierta tarea.

* Se han desarrollado distintos lenguajes para representar actividades simultáneas y para coordinar su ejecución, tales como ADA, OCCAM, Concurrent-Pascal, o Java.

* Algunas áreas de aplicación típicas de la programación concurrente son los sistemas operativos, los sistemas de gestión de bases de datos y los sistemas en tiempo real, tales como los sistemas de control de procesos o los sistemas multimedia.

a|
* Un *_programa secuencial_* es un conjunto de declaraciones de datos e instrucciones (o acciones) ejecutables escrito en un lenguaje de programación.

* Estas instrucciones deben ejecutarse, una a continuación de otra, siguiendo una secuencia determinada por un algoritmo, para resolver un cierto problema.

|===

### Proceso 
[cols="33,33,33"]
|===

3+a|
- *[blue]#Proceso:#*

* Se denomina *proceso* a la ejecución de un programa secuencial en un sistema informático -se dice que es un hilo (*_thread_*) de control-.

a|
- *[blue]#Procesos concurrentes:#*

* Se dice que dos procesos son *_concurrentes_* si se ejecutan al mismo tiempo en un sistema. Más formalmente, si la primera instrucción de uno se ejecuta entre la primera y la última del otro (o viceversa).

a|
- *[blue]#Programa concurrente:#*

* Un *_programa concurrente_* es un conjunto de varios programas secuenciales, cuyos procesos pueden ejecutarse concurrentemente en un sistema para resolver un cierto problema.

a|
- *[blue]#Sistema concurrente:#*

* Un *_sistema concurrente_* es un sistema informático (hardware + software) en el que es posible ejecutar varios procesos concurrentemente.

|===

### Relaciones entre procesos
[cols="30,35,35"]
|===

3+a|
- *[blue]#Relaciones entre procesos:#*

* Las posibles relaciones entre procesos concurrentes pueden clasificarse en:

a|
** *_[blue]#Independencia.#_* No existe ninguna interacción entre los procesos. Este caso es posible, pero es poco interesante.

a|
** *_[blue]#Competencia#_*. Esta situación se produce cuando los procesos deben compartir recursos comunes del sistema (UCP, memoria, disco, impresora, ...), por lo que deben competir entre ellos para adquirirlos.

a|
** *_[blue]#Cooperación#_*. Esta relación se presenta cuando los procesos deben trabajar conjuntamente sobre distintas partes de un problema para resolverlo, para lo cual necesitan intercambiar información entre sí.

|===

### Interacciones entre procesos
[cols="35,65"]
|===

a|
- *[blue]#Interacciones entre procesos (I):#*

* Para poder cumplir las relaciones existentes entre procesos concurrentes, es necesario considerar dos clases de actividades:

** *Sincronización*

** **Comunicación**

a|
- *[blue]#Interacciones entre procesos (II):#*

* *_Sincronización_*. Es el intercambio entre los procesos de información acerca del control del flujo de ejecución de sus instrucciones. Sirve para coordinar el orden de ejecución de las instrucciones de los procesos, imponiendo restricciones para que no se ejecuten unas instrucciones antes que otras. Se pueden distinguir dos tipos de sincronización:

** *_Sincronización condicional._* Un proceso debe esperar a que se cumpla una cierta condición para poder continuar su ejecución, la cual será activada por otro proceso.

** *_Exclusión mutua._* Cuando varios procesos compiten por un recurso común de acceso exclusivo, deben coordinar sus ejecuciones para evitar el acceso concurrente a dicho recurso.

|===

[cols="50,50"]
|===

a|
- *[blue]#Interacciones entre procesos (III):#*

* *_Comunicación._* Es el intercambio entre los procesos de información acerca de sus datos. Cuando varios procesos deben cooperar para resolver un problema, habitualmente unos necesitan disponer de datos obtenidos por otros. En este caso, es obvia la necesidad de sincronizar los procesos, pues o bien los que necesitan los datos no pueden continuar progresando en su ejecución mientras no se disponga de ellos (sincronización condicional), o bien se debe evitar que unos procesos modifiquen los datos mientras otros estén leyéndolos, con el fin de mantener su integridad (exclusión mutua).

a|
- *[blue]#Interacciones entre procesos (IV):#*

image:iteraccionProcesos.png[]

|===

### Modelos de concurrencia
[cols="25,40,35"]
|===

a|
- *[blue]#Modelos de concurrencia (I):#*

* Se han desarrollado dos modelos diferenciados para llevar a cabo la sincronización y comunicación de procesos concurrentes:

** El modelo de *Variables Compartidas*

** El modelo de *Paso de Mensajes*

a|
- *[blue]#Modelos de concurrencia (II):#*

* El modelo de Variables Compartidas. Los procesos leen o escriben en variables de acceso común para sincronizarse y comunicarse. Es decir, un proceso escribe en una variable, la cual es leída por otro proceso. Debido a la complejidad que entraña la aplicación directa de este método, tal y como se ha demostrado en ciertos problemas clásicos (por ejemplo, la exclusión mutua), se han desarrollado distintas herramientas de mayor nivel, como las siguientes:

** *_Semáforos_*

** *_Regiones críticas_*

** *_Regiones críticas condicionales_*

** *_Monitores_*

a|
- *[blue]#Modelos de concurrencia (III):#*

* El modelo de *_Paso de Mensajes_*. Los procesos se sincronizan y comunican mediante el intercambio de mensajes. Es decir, un proceso envía un mensaje que es recibido por otro proceso. Las herramientas más importantes de este modelo son:

** *_Envío asíncrono_*

** *_Envío síncrono o cita simple_*

** *_Invocación remota o cita extendida_*

|===

### Estados de proceso
[cols="2"]
|===

a|
- *[blue]#Estados de un proceso (I):#*

* Básicamente, un proceso puede estar en tres estados distintos:

** *_Preparado._* El proceso está dispuesto para ejecutar instrucciones, a falta únicamente de un procesador físico libre. Este estado se deriva del hecho de que en un sistema normalmente hay menos procesadores físicos que procesos en ejecución.

** *_Ejecución._* El proceso está ejecutando instrucciones en un determinado procesador.

** *_Bloqueado._* El proceso debe esperar la ocurrencia de un suceso antes de poder hacer uso de un procesador (por ejemplo, la terminación de una operación de entrada/salida).

a|
- *[blue]#Estados de un proceso (II):#*

image:estadosProceso.png[]

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/10-exclusionMutua2.adoc ===== -->

## Exclución mutua (II)

[cols="50,50"]
|===

a|
- En este apartado se considera cómo resolver el problema de la exclusión mutua en el acceso a un recurso compartido por parte de N procesos mediante la utilización de un único semáforo asociado al recurso.

- Cuando un proceso desea acceder al recurso, debe esperar mediante una operación WAIT a que ningún otro proceso esté accediendo al mismo.

a|
- Cuando un proceso termina de acceder al recurso lo indica mediante una operación SIGNAL.

- Puesto que sólo el primer proceso que acceda el recurso no debe bloquearse, el valor inicial del semáforo debe ser igual a 1.

- Si se desea garantizar ausencia de inanición de los procesos en el acceso al recurso, deberá usarse un semáforo justo.

|===

[cols="50,50"]
|===

a|
[source, java]
....
import java.util.concurrent.Semaphore;

class Entero {

  private int i;
  private Semaphore s;

  public Entero(int i) {
    this.i = i;
    s = new Semaphore(1);
  }

  public void incrementar() throws InterruptedException {
    s.acquire();
    i = i + 1;
    s.release();
  }

  public int get() throws InterruptedException {
    s.acquire();
    int aux = i;
    s.release();
    return aux;
  }
}
....

a|
[source,java]
....
class Proceso extends Thread {

  private Entero entero;

  public Proceso(Entero entero) {
    this.entero = entero;
  }

  public void run() {
    try {
      for (int i  = 0; i < 5000; i++) {
        entero.incrementar();
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}
class Aplicacion {

  public static void main(String[] args) {
    Entero entero = new Entero(0);
    Proceso[] procesos = new Proceso[10];
    for (int i = 0; i < procesos.length; i++) {
      procesos[i] = new Proceso(entero);
    }
    for (int i = 0; i < procesos.length; i++) {
      procesos[i].start();
    }
    try {
      for (int i = 0; i < procesos.length; i++) {
        procesos[i].join();
      }
      System.out.println("Entero = " + entero.get());
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}
....
|===


* siempre produce un resultado final de 50000 en el entero compartido.

[cols="50,50"]
|===

2+a|
*[blue]#Ejemplo:#*

a|
* El siguiente ejemplo muestra el acceso de un conjunto de procesos visitantes a un mueso de aforo ilimitado.

a|
* Cada vez que un visitante entra o sale del mueso, debe escribir por pantalla el número de visitantes en su interior.

a|
[source, java]
....
class Aplicacion {

  public static void main(String[] args) {
  final int NUM_VISITANTES = 10;
  Museo museo = new Museo();
  Visitante[] visitantes = new Visitante[NUM_VISITANTES];
  for (int i = 0; i < visitantes.length; i++) {
    visitantes[i] = new Visitante(museo);
  }
  for (int i = 0; i < visitantes.length; i++) {
    visitantes[i].start();
  }
  }
}
class Visitante extends Thread {

  private Museo museo;

  public Visitante(Museo museo) {
  this.museo = museo;
  }

  public void run() {
  Pantalla pantalla = Pantalla.getPantalla();
    try {
      for (int i  = 0; i < 10; i++) {
      museo.entrar();
      pantalla.escribir("Viendo el museo");
      for (int j = 0; j < (int) 10000 * Math.random(); j++) ;
      museo.salir();
      pantalla.escribir("Otras cosas");
      for (int j = 0; j < (int) 10000 * Math.random(); j++) ;
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}
import java.util.concurrent.Semaphore;
....

a|
[source,java]
....
class Museo {

  private int ocupacion;
  private Semaphore exclusion;
  Pantalla pantalla = Pantalla.getPantalla();

  public Museo() {
    ocupacion = 0;
    exclusion = new Semaphore(1);
  }

  public void entrar() throws InterruptedException {
    exclusion.acquire();
    ocupacion = ocupacion + 1;
    pantalla.escribir("Entra un visitante. Hay " + ocupacion);
    exclusion.release();
  }

  public void salir() throws InterruptedException {
    exclusion.acquire();
    ocupacion = ocupacion - 1;
    pantalla.escribir("Sale un visitante. Hay " + ocupacion);
    exclusion.release();
  }
}
import java.util.concurrent.Semaphore;

class Pantalla {

  private Semaphore exclusion;

  private static Pantalla pantalla = new Pantalla();
  public static Pantalla getPantalla() {
    return pantalla;
  }

  private Pantalla() {
    exclusion = new Semaphore(1);
  }

  public void escribir(String texto) throws InterruptedException {
    exclusion.acquire();
    System.out.println(texto);
    exclusion.release();
  }
}
....

|===








<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/11-exclucionMutuaGeneralizada.adoc ===== -->

## Exclusión mutua generalizada

[cols="40,60"]
|===

a|
*[blue]#Definición del problema:#*
a| 
*Solución:*
 
a|
* Se entiende por *_exclusión mutua generalizada_* cuando el número de procesos que pueden acceder simultáneamente a un recurso compartido es K > 1.

a|
* En esta situación, el problema se resuelve asignando inicialmente al contador del semáforo el valor K.

* De esta forma, sólo los K primeros procesos que traten de acceder a su sección crítica entrarán en ella, mientras que el resto se bloquearán hasta que termine alguno de ellos.

|===

[cols="50,50", options="header"]
|===

2+a|
*[blue]#Ejemplo:#*

2+a|
* El siguiente ejemplo muestra el acceso a un museo con aforo limitado por un conjunto de procesos visitantes

a|
[source, java]
....
class Aplicacion {

  public static void main(String[] args) {
    final int NUM_VISITANTES = 10;
    final int AFORO = 4;
    Museo museo = new Museo(AFORO);
    Visitante[] visitantes = new Visitante[NUM_VISITANTES];
    for (int i = 0; i < visitantes.length; i++) {
      visitantes[i] = new Visitante(museo);
    }
    for (int i = 0; i < visitantes.length; i++) {
      visitantes[i].start();
    }
  }
}
class Visitante extends Thread {

  private Museo museo;

  public Visitante(Museo museo) {
    this.museo = museo;
  }

  public void run() {
    Pantalla pantalla = Pantalla.getPantalla();
    try {
      for (int i  = 0; i < 10; i++) {
        museo.entrar();
        pantalla.escribir("Viendo el museo");
        for (int j = 0; j < (int) 10000 * Math.random(); j++) ;
        museo.salir();
        pantalla.escribir("Otras cosas");
        for (int j = 0; j < (int) 10000 * Math.random(); j++) ;
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}
import java.util.concurrent.Semaphore;
....

a|
[source,java]
....
class Museo {

  private int ocupacion;
  private Semaphore exclusion;
  private Semaphore aforo;
  Pantalla pantalla = Pantalla.getPantalla();

  public Museo(int capacidad) {
    ocupacion = 0;
    exclusion = new Semaphore(1);
    aforo = new Semaphore(capacidad);
  }

  public void entrar() throws InterruptedException {
    aforo.acquire();    // INTERCAMBIAR ESTAS OPERACIONES
    exclusion.acquire();    // PRODUCE INTERBLOQUEO
    ocupacion = ocupacion + 1;
    pantalla.escribir("Entra un visitante. Hay " + ocupacion);
    exclusion.release();
  }

  public void salir() throws InterruptedException {
    exclusion.acquire();
    ocupacion = ocupacion - 1;
    pantalla.escribir("Sale un visitante. Hay " + ocupacion);
    exclusion.release();
    aforo.release();
  }
}

....
|===
















<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/12-buzones.adoc ===== -->

## Buzones

### Definición del problema 

[cols="40,60"]
|===

a|
- *[blue]#Definición del problema (I):#*

* El *_problema de los productores y los consumidores_* es una clase de problemas que aparece habitualmente en la programación concurrente, y que resuelve el problema de la comunicación asíncrona entre procesos.

* El problema está formado por dos tipos de procesos llamados productores y consumidores. Los procesos productores generan datos que son depositados en un buzón, y que pueden ser recogidos posteriormente por los consumidores.

image:buzones.png[]

a|
- *[blue]#Definición del problema (II):#*

* Las restricciones impuestas son:

** Cada productor genera un único dato cada vez y lo deposita en el buzón.

** Un consumidor sólo puede recibir un dato cuando éste haya sido generado por un productor. 

** Los datos se consumen en el mismo orden en el que se producen.

** Todos los datos producidos son consumidos eventualmente. Es decir, en algún instante posterior son extraídos por un consumidor

- Solución:

* Si analizamos los requisitos del problema, vemos que es necesario sincronizar los procesos productores con los consumidores, de forma que estos últimos se bloqueen cuando no haya datos disponibles.

* Además, este problema requiere la comunicación entre estos procesos, ya que un dato generado por un productor debe ser usado por un consumidor.
 
* Mientras que la sincronización entre los procesos se puede conseguir mediante semáforos, la comunicación suele conseguirse en los sistemas de memoria compartida mediante una zona común de memoria a la que puedan acceder tanto los procesos productores como los consumidores. Para referirnos a ella usaremos la palabra *_buffer_*.

|===

### Buffer infinito

[cols="50,50"]
|===

2+a|
- *_[blue]#Buffer infinito (I):#_*

a|
* En principio, se puede suponer que el buffer es de tamaño infinito, por lo que los productores pueden generar un número ilimitado de datos antes de que sean consumidos.

* En esta situación, el problema se limita a implantar una sincronización condicional, que asegure que los consumidores esperen a que se produzcan los datos.

a|
* Para ello, basta un semáforo cuyo contador indique el número de datos en el buffer en cada instante, de manera que los consumidores se bloqueen cuando no haya datos en el buffer (sincronización condicional). Una primera aproximación a la solución del problema se presenta a continuación.

|===

[cols="50,50"]
|===

a|
[source, java]
....
abstract class Productor<Dato> extends Thread {

  private Buzon<Dato> buzon;

  public Productor(Buzon<Dato> buzon) {
    this.buzon = buzon;
  }

  public void run() {
    try {
      while (true) {
        Dato dato = this.producir();
        buzon.enviar(dato);
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  protected abstract Dato producir();
}
abstract class Consumidor<Dato> extends Thread {

  private Buzon<Dato> buzon;

  public Consumidor(Buzon<Dato> buzon) {
    this.buzon = buzon;
  }

  public void run() {
    try {
      while (true) {
        Dato dato = buzon.recibir();
        this.consumir(dato);
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  protected abstract void consumir(Dato dato);
}
....

a|
[source,java]
....
class Buzon<Dato> {

  private Buffer<Dato> buffer;
  private Semaphore numDatos;

  public Buzon() {
    buffer = new Buffer<Dato>();
    numDatos = new Semaphore(0);
  }

  public void enviar(Dato dato) {
    buffer.meter(dato);
    numDatos.release();
  }

  public Dato recibir() throws InterruptedException {
    numDatos.acquire();
    Dato dato = buffer.sacar();
    return dato;
  }
}
....
|===


[cols="60,40"]
|===

2+a|
- *_[blue]#Buffer infinito (II):#_*

a|
* Si bien esta solución bloquea a los procesos consumidores cuando no hay datos en el buffer, no previene el solapamiento de las operaciones de meter y sacar un dato en el buffer, lo que podría traducirse en que dos productores pusieran sus datos en la misma posición del buffer, o que dos consumidores extrajeran el mismo dato del buffer.

a|
* Por tanto, se debe asegurar el acceso exclusivo al buffer mediante un semáforo adicional de exclusión mutua, tal y como se hace en la siguiente aproximación.

|===

[cols="50,50"]
|===

a|
[source, java]
....
class Buzon<Dato> {

  private Buffer<Dato> buffer;
  private Semaphore numDatos;
  private Semaphore exclusion;

  public Buzon() {
    buffer = new Buffer<Dato>();
    numDatos = new Semaphore(0);
    exclusion = new Semaphore(1);
  }
....

a|
[source,java]
....
  public void enviar(Dato dato) throws InterruptedException {
    exclusion.acquire();
    buffer.meter(dato);
    exclusion.release();
    numDatos.release();
  }

  public Dato recibir() throws InterruptedException {
    numDatos.acquire();       // INTERCAMBIAR ESTAS OPERACIONES 
    exclusion.acquire();      // PRODUCE INTERBLOQUEO
    Dato dato = buffer.sacar();
    exclusion.release();
    return dato;
  }
}
....
|===


### Buffer finito


[cols="50,50"]
|===

2+a|
- *_[blue]#Buffer finito:#_*

a|
* En la práctica, cualquier problema de comunicación entre procesos concurrentes requiere usar un buffer de tamaño limitado. Esto significa que el buffer admite un número máximo de datos sin consumir.

* En esta situación, el productor no puede meter un dato en el buffer cuando esté lleno, y debe bloquearse hasta que un consumidor tome un dato y produzca un hueco en el buffer.

* Esto se puede conseguir con un semáforo que indique el número de huecos disponibles en el buffer en cada momento, tal como se muestra en la siguiente aproximación a la solución del problema.

* Si los semáforos son del tipo conjunto bloqueado, puede producirse la inanición de algunos procesos, tanto productores como consumidores, análogamente a lo que sucedía en el problema de la exclusión mutua.

* Si los semáforos son del tipo cola bloqueada, todos los procesos son atendidos eventualmente.

a|
[source, java]
....
class Buzon<Dato> {

  private Buffer<Dato> buffer;
  private Semaphore numDatos;
  private Semaphore numHuecos; 
  private Semaphore exclusion;

  public Buzon(int capacidad) {
    buffer = new Buffer<Dato>(capacidad);
    numDatos = new Semaphore(0);
    numHuecos = new Semaphore(capacidad); 
    exclusion = new Semaphore(1);
  }

  public void enviar(Dato dato) throws InterruptedException {
    numHuecos.acquire();      // INTERCAMBIAR ESTAS OPERACIONES 
    exclusion.acquire();      // PRODUCE INTERBLOQUEO
    buffer.meter(dato);
    exclusion.release();
    numDatos.release();
  }
  public Dato recibir() throws InterruptedException {
    numDatos.acquire();       // INTERCAMBIAR ESTAS OPERACIONES
    exclusion.acquire();      // PRODUCE INTERBLOQUEO
    Dato dato = buffer.sacar();
    exclusion.release();
    numHuecos.release(); 
    return dato;
  }
}
....
|===

### Buffer circular

[cols="50,50"]
|===

2+a|
- *_[blue]#Buffer circular:#_*

a|
* Una técnica ampliamente usada para implantar un buffer finito es mediante un array circular.

* Un array circular consiste en un array de tamaño limitado, más un índice que indique cuál es la posición donde debe colocarse el siguiente dato en el array, y otro índice que indique de qué posición debe extraerse el siguiente dato del array.

* Opcionalmente, se puede añadir una variable que contabilice el número de datos presentes en el buffer en cada momento.

* A continuación se presenta esta estructura de datos y sus operaciones asociadas.

a|
[source, java]
....
class Buffer<Dato> {

  private final int CAPACIDAD;
  private Dato[] datos;
  private int ocupacion;
  private int sigMeter;
  private int sigSacar;

  public Buffer(int capacidad) {
    CAPACIDAD = capacidad;
    datos = (Dato[]) new Object[CAPACIDAD];
    ocupacion = 0; sigMeter = 0; sigSacar = 0;
  }

  public void meter(Dato dato) {
    datos[sigMeter] = dato;
    ocupacion = ocupacion + 1;
    sigMeter = (sigMeter + 1) % CAPACIDAD;
  }

  public Dato sacar() {
    Dato dato = datos[sigSacar];
    ocupacion = ocupacion - 1;
    sigSacar = (sigSacar + 1) % CAPACIDAD;
    return dato;
  }
}
....

|===











<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/2-arquitecturasSistemasConcurrentes.adoc ===== -->

## Arquitecturas de sistemas concurrentes

### Arquitecturas físicas
[cols="50,50"]
|===

a|
- *[blue]#Arquitecturas físicas (I):#*

* Atendiendo al número de procesadores físicos, podemos distinguir dos grandes clases de arquitecturas hardware de sistemas concurrentes:

** *_Sistemas uniprocesador._* Básicamente están formados por una única UCP, una memoria, y un sistema de E/S, conectados mediante varios buses.

image:arquitecturasFisicas.png[]

a|
- *[blue]#Arquitecturas físicas (II):#*

* *_Sistemas multiprocesador._* Podemos distinguir dos tipos de sistemas multiprocesadores:

** *_Sistemas fuertemente acoplados._* Formados por varias UCPs, una o más memorias y un sistema de entrada/salida comunes para todas las UCPs, unidos mediante varios buses. Además, algunas UCPs pueden tener memorias locales de acceso particular.

image:arquitecturasFisicas.png[]

a|
- *[blue]#Arquitecturas físicas (III):#*

* *_Sistemas débilmente acoplados._* También llamados sistemas distribuidos. Formados por un conjunto de nodos, que pueden estar dispersos geográficamente. Cada nodo puede ser un sistema uni o multiprocesador. Los nodos no comparten memoria común, sino que están unidos por redes de comunicación. Dependiendo de las distancias entre nodos, se habla de:

** *_Sistemas multicomputador._* De 1 dm a 10 m.

** *_Redes de área local._* De 1 m. a 10 Km.

** *_Redes de área extensa._* De 1 Km. en adelante.

a|
- *[blue]#Arquitecturas físicas (IV):#*

image:arquitecturasFisicas4.png[]

2+a|
- *[blue]#Arquitecturas físicas (V):#*

image:arquitecturasFisicas5.png[]

|===

### Multiprocesamiento y Multiprogramación

[cols="50,50"]
|===

a|
- *[blue]#Multiprocesamiento Y Multiprogramación (I):#*

* Un programa concurrente puede ejecutarse de forma que cada proceso se ejecute en su propio procesador (*_multiprocesamiento_*) o que los procesos compartan uno o más procesadores (*_multiprogramación_*).

** *_Multiprocesamiento._* En un sistema multiprocesador, es posible que cada proceso de un programa concurrente se ejecute en un procesador físico distinto.

*** Este primer enfoque se denomina *_multiprocesamiento_* si los procesadores comparten memoria común (sistemas multiprocesadores fuertemente acoplados), o como *_procesamiento distribuido_* si los procesadores están conectados por una red de comunicaciones (sistemas distribuidos).

a|
- *[blue]#Multiprocesamiento Y Multiprogramación (II):#*

* En el multiprocesamiento, se dice que existe *_paralelismo real_* en la ejecución de los procesos, lo que permite un aumento de la velocidad de ejecución del programa.

image:multiprocesamientoMultiprogramacion.png[]

a|
- *[blue]#Multiprocesamiento Y Multiprogramación (III):#*

* *_Multiprogramación._* Sin embargo, el concepto de programación concurrente admite la ejecución simultánea de más de un proceso en un único procesador físico.

** Este segundo enfoque se conoce como *_multiprogramación_* y consiste en multiplexar la ejecución de los procesos sobre los procesadores mediante la *_intercalación_* de la ejecución de sus instrucciones.

** Esto se suele conseguir mediante la técnica conocida como *_compartición de tiempo_*, en la que se asigna una *_cuota de tiempo_* a cada proceso para su ejecución en un procesador. 

a|
- *[blue]#Multiprocesamiento Y Multiprogramación (IV):#*

* En la multiprogramación, se habla de *_paralelismo simulado_* o de *_pseudoparalelismo._* Excepto en lo que se refiere a su velocidad de ejecución, la sensación que proporciona el sistema es similar a la que se obtendría con paralelismo real.

image:multiprocesamientoMultiprogramacion2.png[]

a|
- *[blue]#Multiprocesamiento Y Multiprogramación (V):#*

* También son posibles enfoques híbridos, por ejemplo, los procesadores de un sistema distribuido pueden multiprogramarse.

* Como sabemos, con el multiprocesamiento es posible aumentar la velocidad de ejecución de un programa concurrente, mediante las asignación de diferentes procesadores físicos a distintos procesos.

* Sin embargo, multiprogramar varios procesos concurrentes no aumenta la velocidad de ejecución del programa. Incluso, puede disminuir, debido a que la intercalación de sus ejecuciones en el procesador implica un cierto coste adicional.

a|
- *[blue]#Multiprocesamiento Y Multiprogramación (VI):#*

* Las principales razones para usar la multiprogramación de procesos concurrentes son:

** *_Aprovechar la posibilidad de ejecutar procesos concurrentes_* cuando el dominio del problema no está totalmente ordenado. En ciertas aplicaciones, el orden de ejecución de ciertas operaciones del programa no está fijada de antemano, sino que puede depender de sucesos externos cuyo orden se desconoce y, por tanto, debe determinarse en tiempo de ejecución

** *_Dar un servicio interactivo a varios usuarios simultáneamente_*, por ejemplo, los sistemas operativos multiusuario.

2+a|
- *[blue]#Multiprocesamiento Y Multiprogramación (VII):#*

* *_Mejorar la utilización del procesador._* Cuando un proceso está bloqueado, esperando un cierto suceso (por ejemplo, en una operación de E/S), es posible asignar el procesador a otro proceso. Aunque esto pueda ralentizar la ejecución de cada proceso individual, se aumenta la utilización del procesador y, por tanto, la velocidad de ejecución del programa global.

image:multiprocesamientoMultiprogramacion3.png[]

|===

### Gestión de procesos concurrentes
[cols="33,33,33"]
|===

a|
- *[blue]#Gestión de procesos concurrentes (I):#*

* Las dos actividades principales que son necesarias para organizar la ejecución de un programa concurrente son la *_planificación_* y el *_despacho_*:

** *_Planificación (scheduling)_*. Consiste en determinar la asignación, en cada instante, de los procesos existentes a los procesadores físicos disponibles.

*** En general, se debe planificar, es decir, decidir a qué proceso debe asignarse el procesador, cuando se cumpla alguna de las siguientes condiciones:

**** El proceso que tiene el control de la UCP termina.

**** El proceso se bloquea por alguna razón.

**** Cuando finaliza su cuota de tiempo.

**** Se produce un error en su ejecución.

a|
- *[blue]#Gestión de procesos concurrentes (II):#*

* Cuando la UCP queda disponible, el algoritmo de planificación determina a qué proceso preparado se le asigna, usando diferentes técnicas: el que más tiempo lleve esperando, por prioridades, aleatorio, etc.

* Hay dos conceptos importantes acerca de la planificación muy relacionados con la programación concurrente:

** *_Justicia:_* Un planificador es justo si a todo proceso preparado se le asigna en algún momento un procesador para ejecutarse.

** El comportamiento funcional (datos/resultados) de un programa concurrente no debe depender del algoritmo de planificación empleado.

a|
- *[blue]#Gestión de procesos concurrentes (III):#*

* *_Despacho (dispatching)._* Consiste en entregar el control de la UCP al proceso elegido por el planificador para su ejecución.

** Cuando un proceso abandona una UCP, se almacena una copia de los valores de todos los registros de la UCP, para que puedan restaurarse cuando el proceso sea despachado de nuevo, como consecuencia de haber sido seleccionado por el planificador.

** Esto es necesario para conseguir que el proceso reanude su ejecución exactamente en las mismas condiciones que cuando la detuvo, sin sufrir ninguna interferencia por parte de los procesos que hayan visitado la UCP en ese período.

** Esto equivale a suponer que cada proceso dispone de su propio juego virtual de registros de la UCP.

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/3-abstraccionProgramacionConcurrente.adoc ===== -->

## Abstracción de la programación concurrente

[cols="40,60"]
|===

a|
- *[blue]#Definición:#*

[quote, Ben-Ari, 1990]
“La *abstracción de la programación concurrente* es el estudio de las secuencias de ejecución intercalada de las instrucciones atómicas de los procesos secuenciales“.

a|
* Para alcanzar esta abstracción se ignorarán detalles tales como:

** El número de procesadores físicos disponibles,

** Las velocidades de ejecución de los procesos,

** Y los posibles solapamientos en las ejecuciones de las instrucciones indivisibles de cada proceso.

|===

### Inctrucciones atómicas 

[cols="50,50"]
|===

a|
- *[blue]#Inctrucciones atómicas (I):#*

* Una *instrucción (o acción) atómica* de un proceso es aquélla cuya ejecución es indivisible en un cierto sistema.

* En consecuencia, ningún otro proceso puede observar los efectos de una instrucción atómica ni puede interferir en sus resultados durante su ejecución.

* Sin embargo, no se puede hacer esta suposición sobre lo que ocurre entre la ejecución de dos acciones atómicas sucesivas.

* Para aclarar el concepto de instrucción atómica, supongamos la siguiente instrucción de un cierto proceso, que incrementa en una unidad el valor de una variable entera x:
  
[source]
....
	x = x + 1;
....

a|
- *[blue]#Inctrucciones atómicas (II):#*

* Esta instrucción, en general, puede no ser atómica, ya que el código resultante, escrito en un cierto lenguaje ensamblador, podría ser el siguiente:

[source]
....
	a1:	LOAD R, X	(* Cargar X en el registro R *)
	a2:	ADD R, #1	(* Sumar 1 a R *)
	a3:	STORE R, X	(* Almacenar R en X *)
....

* Si estas instrucciones son indivisibles en un cierto procesador, debido a que existen mecanismos (hardware o software) que garanticen su ejecución sin interrupción, entonces podremos asegurar que son atómicas.

a|
- *[blue]#Inctrucciones atómicas (III):#*

* Podemos distinguir dos clases de instrucciones atómicas:

** *_De grano fino._* Una instrucción atómica de grano fino es aquélla que se implanta directamente por el hardware en el que se ejecuta el programa concurrente. Se corresponden con las instrucciones máquina de la UCP.

** *_De grano grueso._* Una instrucción atómica de grano grueso es una secuencia de instrucciones atómicas de grano fino, cuya ejecución es indivisible. Esto se consigue mediante herramientas software que permitan sincronizar la ejecución de los procesos. Estas herramientas pueden ser proporcionadas por un lenguaje de programación o pueden estar implantadas en un sistema operativo subyacente.

a|
- *[blue]#Inctrucciones atómicas (IV):#*

* *_1ª abstracción:_* 
[quote, Ben-Ari, 1990]
“En la programación concurrente se considera que cada proceso se ejecuta en su propio procesador. Esto permite tener en cuenta únicamente las interacciones entre los procesos derivadas de sus relaciones de competencia y cooperación.”

* *_2º abstracción:_* 
[quote, Ben-Ari, 1990]
“Una abstracción superior es ignorar las velocidades relativas de cada proceso, lo que posibilita eliminar la variable tiempo y considerar sólo las secuencias de instrucciones atómicas que se ejecutan.”

|===

### Intercalación

[cols="33,33,33"]
|===

a|
- *Intercalación (I):*

* *_3º abstracción:_* 
[quote, Ben-Ari, 1990]
“Se considera que las secuencias de ejecución de las instrucciones atómicas de todos los procesos se intercalan en una única secuencia.”


* Esta abstracción considera que la ejecución de dos instrucciones atómicas sólo puede intercalarse, pero no solaparse.

* Esta restricción se basa en la suposición de que el resultado de la ejecución simultánea de dos instrucciones atómicas debe ser cualquiera de los dos posibles resultados obtenidos al ejecutar las instrucciones secuencialmente.

a|
- *Intercalación (II):*

* Esta suposición es totalmente adecuada en el caso de multiprogramación, puesto que la ejecución de las instrucciones atómicas siempre debe intercalarse por la competencia por un único procesador.

* En multiproceso, dos instrucciones atómicas pueden ejecutarse, en principio, simultáneamente.

* Sin embargo, si las instrucciones compiten por un cierto recurso de acceso exclusivo, por ejemplo, tratan de escribir simultáneamente en una misma posición de memoria, el hardware o software subyacente debe resolver el problema fijando un cierto orden arbitrario (porque, por definición, son atómicas).

a|
- *Intercalación (IV):*

* Si las instrucciones son independientes, su resultado será el mismo cualquiera que sea el orden en que se ejecuten, por lo que también podemos suponer un cierto orden arbitrario. 

* Más aún, la abstracción de la programación concurrente no impone una intercalación fija de las instrucciones atómicas de los procesos, sino que hay que considerar *todas las posibles secuencias de ejecución intercalada de sus instrucciones atómicas.*

* Esto es un problema de gran complejidad porque el número de posibles intercalaciones crece exponencialmente al aumentar el número de procesos y el número de sus instrucciones atómicas. 

|===

### Indeterminismo

[cols="50,50"]
|===

a|
- *[blue]#Indeterminismo (I):#*

* Una cualidad intrínseca de la programación concurrente se denomina *_indeterminismo_*, es decir, la imposibilidad de reproducir exactamente la ejecución de un programa concurrente que parte del mismo estado inicial de su entorno.

* Como consecuencia, dos ejecuciones del mismo programa con los mismos datos pueden producir distintos resultados, incluso en el mismo sistema.

* Esto es debido a que, aun cuando el estado inicial sea el mismo, la secuencia de ejecución de sus instrucciones atómicas puede ser diferente, lo que provoca que el programa pase por distintos estados intermedios.
 
* Esto no sucede en el caso de un programa secuencial, cuyo comportamiento es completamente determinista.

a|
- *[blue]#Indeterminismo (II):#*

* Consideremos el siguiente programa concurrente, escrito en un lenguaje de programación abstracto.

[source]
....
int x = 0;
PROCESS P1 : x = x + 1;
PROCESS P2 : x = x + 1;
....

* Si las instrucciones de incremento no son atómicas, sino que se descomponen en las siguientes instrucciones atómicas:

[source]
....
PROCESS P1 : x = x + 1; -> a11) LOAD R1, X
                           a12) ADD R1, #1
                           a13) STORE R1, X

PROCESS P2 : x = x + 1; -> a21) LOAD R2, X
                           a22) ADD R2, #1
                           a23) STORE R2, X
....

a|
- *[blue]#Indeterminismo (III):#*

* Entonces hay que considerar 20 posibles secuencias de ejecución intercalada de las instrucciones atómicas de los procesos, de las cuales sólo las 2 siguientes producen un resultado final igual a 2 en la variable x:

[source]
....
a11 -> a12 -> a13 -> a21 -> a22 -> a23    x = 2

a21 -> a22 -> a23 -> a11 -> a12 -> a13    x = 2
....

* mientras que el resto de secuencias de ejecución producen un resultado final igual a 1 en la variable x:

[source]
....
a11 -> a21 -> a12 -> a13 -> a22 -> a23    x = 1

a11 -> a21 -> a22 -> a12 -> a13 -> a23    x = 1
...
....

a|
- *[blue]#Indeterminismo (IV):#*

* El ejemplo anterior ilustra una propiedad importante, que el indeterminismo, aumenta cuando disminuye el grano de las acciones atómicas de cada proceso.

* Esto es debido a que el número de posibles intercalaciones crece exponencialmente con el número de acciones atómicas de cada proceso, y con ellas, el número de posibles estados intermedios.

* Un objetivo primordial de la programación concurrente es tratar de reducir este indeterminismo, sincronizando los procesos para restringir el número de posibles secuencias de instrucciones de un programa concurrente sólo a aquéllas deseables.

* Si en el ejemplo anterior sincronizamos los procesos para garantizar que hay exclusión mutua en el acceso a la variable x, entonces el resultado final siempre será 2.

|===








<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/4-propiedadesCorrección.adoc ===== -->

## Propiedades de corrección

[cols="60,40"]
|===

a|
- La corrección de un programa concurrente se define en términos de las propiedades de sus secuencias de ejecución.

- Una propiedad de un programa concurrente es un atributo que debe satisfacerse para todas sus posibles secuencias de ejecución.

- Un programa correcto debe cumplir dos clases de propiedades en toda posible ejecución del mismo:

a|
* *_Propiedades de seguridad (safety)._*

* *_Propiedades de vitalidad (liveness)._*

* *_Propiedades de justicia (fairness):_*

|===

### Propiedades de seguridad
[cols="60,40"]
|===

a|
- *[blue]#Propiedades de seguridad (I):#*

* Deben ser ciertas en todo instante de la ejecución del programa.

* Aseguran que nada malo ocurrirá nunca durante una ejecución. 

* Algunos ejemplos de propiedades de esta clase son:

** *_Exclusión mutua._* Establece que nunca puedan intercalarse ciertas secuencias de instrucciones de un grupo de procesos. Es decir, una secuencia debe terminarse de ejecutar antes de que ninguna otra comience. Esta propiedad sirve para garantizar el acceso exclusivo a recursos compartidos por los procesos.


a|
- *[blue]#Propiedades de seguridad (II):#*

* *_Ausencia de interbloqueo pasivo (deadlock)._* Un interbloqueo pasivo es un estado en el que un conjunto de procesos se bloquean esperando un suceso que sólo puede producir otro proceso del propio conjunto. Puesto que todos esperan, ninguno puede producir el suceso que desbloquearía a otro y, por tanto, todos continúan esperando indefinidamente.

|===

[cols="40,60"]
|===

a|
- *[blue]#Propiedades de vitalidad:#*

* Deben ser eventualmente ciertas, es decir, deben cumplirse en algún instante de la ejecución del programa.

* Aseguran que algo bueno ocurrirá eventualmente durante su ejecución.

* Algunos ejemplos de propiedades de esta clase son:

a|
** *_Ausencia de interbloqueo activo (livelock)._* Un interbloqueo activo se produce cuando ciertos procesos no se bloquean, pero ejecutan instrucciones inútiles sin obtener ningún progreso.

** *_Ausencia de inanición (starvation)._* Si un proceso hace una petición para obtener un recurso, debe garantizarse que sea atendida eventualmente. Lo que no puede ocurrir es que a un proceso no se le atienda nunca, mientras otros procesos obtienen ese recurso repetidamente.

|===

[cols="35,65"]
|===

a|
- *[blue]#Propiedades de justicia:#*

- Cuando varios procesos compiten por recursos comunes, es deseable poder especificar cómo debe resolverse esta competencia.

- Algunos ejemplos de propiedades de esta clase son:

a|
* *_Ausencia de inanición._* Si un proceso hace una petición, debe garantizarse que sea atendida eventualmente.

* *_Espera lineal._* Si un proceso hace una petición, debe garantizarse que se le conceda antes de que se le conceda a otro proceso más de una vez.

* *_Espera FIFO._* Si un proceso hace una petición, debe concedérsela antes de a cualquier otro proceso que la haga posteriormente.

|===






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/5-ejecucionProcesos/0-index.adoc ===== -->

## Ejecución de procesos

[cols="50,50"]
|===

a|
- *[blue]#Hilos (I):#*

* En Java, los procesos concurrentes se modelan mediante el concepto de “hilo” (*_thread_*).

* La máquina virtual de Java permite que una aplicación ejecute varios hilos concurrentemente.

* Cuando comienza la ejecución de la máquina virtual, normalmente hay un único hilo que invoca al método _main_() de la clase principal.

* La máquina virtual continúa ejecutando los hilos de la aplicación hasta que se cumpla alguna de las siguientes condiciones:

** se invoca el método _exit_() de la clase _Runtime_,

** todos los hilos de la aplicación terminan su ejecución

a|
- *[blue]#Hilos (II):#*

* En Java, hay dos maneras para crear y ejecutar un nuevo hilo. 

* La primera consiste en seguir los siguientes pasos:

** crear una clase que herede de la clase _Thread_,

** redefinir el método _run_() de la clase _Thread_ en la subclase,

** crear un objeto de esa subclase,

** e invocar el método _start_() de la clase _Thread_ sobre el objeto de la subclase.


- *Clase Thread:*

[source, java]
....
public Thread()
public Thread(Runnable target) 
public void run() 
public void start() 
public static void sleep(long millis) throws InterruptedException 
public final void join() throws InterruptedException
....

|===

[cols="35,35,30", options="header"]
|===

3+a|
*[blue]#Ejemplo:#*

a|
[source, java]
....

class Proceso extends Thread {

  private int id;

  public Proceso(int id) {
  this.id = id;
  }

  public void run() {
  for (int i  = 0; i < 50; i++) {
      System.out.print(id);
  }
  }
}
....

a|
[source, java]
....
class Aplicacion {

  public static void main(String[] args) {
  Proceso p1 = new Proceso(1);
  Proceso p2 = new Proceso(2);
  p1.start();
  p2.start();
  }
}
....

^.^a|
include::diagramaEjecucionProcesos.adoc[]


|===


* en una ejecución puede producir este resultado:

[source]
....
1111111111111111111121222222222222212221212121212111111111111111111112121212222222222222222222222222
....

* en otra ejecución puede producir este otro resultado:

[source]
....
1112222222222222222122222222222222222221222222222222222111111111111111111111111111111111111111111111
....

[cols="70,30"]
|===

a|
- *[blue]#Hilos (III):#*

* La segunda manera de ejecutar un hilo consiste en seguir los siguientes pasos:

** crear una clase que implemente el interfaz _Runnable_,

** redefinir el método _run_() del interfaz _Runnable_ en la subclase,

** crear un objeto de esa subclase,

** crear un objeto de la clase _Thread_ pasando como argumento el objeto anterior,

** e invocar el método _start_() de la clase _Thread_ sobre el objeto de la clase _Thread_.

a|
* Esta segunda manera permite ejecutar hilos de clases que hereden de otra clase que no sea la clase _Thread_, cosa que no sería posible usando la primera manera, ya que Java no permite la herencia múltiple.

|===

[cols="50,50"]
|===

2+a|
* *[blue]#Ejemplo:#*

a|
[source, java]
....
class Impresor {

  private int id;

  public Impresor(int id) {
  this.id = id;
  }

  public void imprimir() {
  System.out.print(id);
  }
}
....

a|
[source, java]
....
class Proceso extends Impresor implements Runnable {

  public Proceso(int id) {
  super(id);
  }

  public void run() {
  for (int i  = 0; i < 50; i++) {
    this.imprimir();
  }
  }
}
....

a|
[source, java]
....
class Aplicacion {

  public static void main(String[] args) {
  Proceso p1 = new Proceso(1);
  Proceso p2 = new Proceso(2);
  Thread h1 = new Thread(p1);
  Thread h2 = new Thread(p2);
  h1.start();
  h2.start();
  }
}
....

^.^a|
include::diagramaEjecucionProcesos2.adoc[]

|===

* en una ejecución puede producir este resultado:

[source]
....
1212122112121212121111111111111121222222222222222221222222222221222222222222111111111111111111111111
....

* en otra ejecución puede producir este otro resultado:

[source]
....
1111111111111111111111111111111111111111111111111122222222222222222222222222222222222222222222222222
....

[cols="50,50"]
|===

a|
- *[blue]#Hilos (IV):#*

*  Para esperar a que un hilo termine su ejecución se debe invocar el método _join_() de la clase _Thread_. En la primera versión quedaría:

a|
[source, java]
....
class Aplicacion {

  public static void main(String[] args) {
  Proceso p1 = new Proceso(1);
  Proceso p2 = new Proceso(2);
  p1.start();
  p2.start();
  try {
    p1.join();
    p2.join();
  } catch (InterruptedException ex) { ex.printStackTrace(); ...}
  System.out.println("\nFin del programa");
  }
}
....

|===

[source]
....
1111111111111111112121111111111111111111212121212122222222221212121111222222222222222222222222222222
Fin del programa
....

[cols="25,75"]
|===

a|
- *[blue]#Hilos (IV):#*

* En la segunda versión quedaría:

a|
[source, java]
....
class Aplicacion {

  public static void main(String[] args) {
  Proceso p1 = new Proceso(1);
  Proceso p2 = new Proceso(2);
  Thread h1 = new Thread(p1);
  Thread h2 = new Thread(p2);
  h1.start();
  h2.start();
  try {
    h1.join();
    h2.join();
  } catch (InterruptedException ex) { ex.printStackTrace(); ...}
    System.out.println("\nFin del programa");
  }
}
....
|===

[source]
....
1111111111111111111212121212121212121222222222222222222212222222222222222222111111111111111111111222
Fin del programa
....


[cols="50,50"]
|===

2+a| *[red]#Ejemplo:#*

^.^a|
image:ejecucionProcesos.png[]

^.^a|
include::diagramaEjecucionProcesos3.adoc[]

a|
[source, java]
....
class Aplicacion {

  private static Ventana ventana;
  public static Ventana getVentana() {
  return ventana;
  }

  public Aplicacion() {
  ventana = new Ventana();
  }

  public static void main(String[] args) {
  new Aplicacion();
  }
}
....

[source, java]
....
import java.awt.Dimension;
import javax.swing.JFrame;

class Ventana extends JFrame {

  public Ventana() {
  PanelContenido panelContenido = new PanelContenido();
  this.setContentPane(panelContenido);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("Ordenador");
  this.setLocation(150, 150);
  this.setPreferredSize(new Dimension(500, 150));
  this.pack();
  this.setResizable(true);
  this.setVisible(true);
  }
}
....

[source, java]
....
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelContenido extends JPanel implements ActionListener {

  private JButton iniciar;
  private PanelProceso panelBurbuja;
  private PanelProceso panelSeleccion;

  public PanelContenido() {
    iniciar = new JButton("Iniciar");
    iniciar.addActionListener(this);
    panelBurbuja = new PanelProceso();
    panelBurbuja.setBorder(
      BorderFactory.createTitledBorder(" Burbuja "));
    panelSeleccion = new PanelProceso();
    panelSeleccion.setBorder(
      BorderFactory.createTitledBorder(" Selección "));

  GroupLayout distribuidor = new GroupLayout(this);
    this.setLayout(distribuidor);
    distribuidor.setAutoCreateGaps(true);
    distribuidor.setAutoCreateContainerGaps(true);
    distribuidor.setHorizontalGroup(
        distribuidor.createParallelGroup(
            GroupLayout.Alignment.CENTER)
          .addGroup(distribuidor.createSequentialGroup()
            .addComponent(panelBurbuja)
            .addComponent(panelSeleccion))
          .addComponent(iniciar));
    distribuidor.setVerticalGroup(
        distribuidor.createSequentialGroup()
          .addGroup(distribuidor.createParallelGroup(
              GroupLayout.Alignment.CENTER)
            .addComponent(panelBurbuja)
            .addComponent(panelSeleccion))
          .addComponent(iniciar));
}

  public void actionPerformed(ActionEvent ev) {
    iniciar.setEnabled(false);
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (10.0 * Math.random());
    }
    final Ordenador burbuja = new Burbuja(array, panelBurbuja);
    final Ordenador seleccion = new Seleccion(array, panelSeleccion);
    burbuja.start();
    seleccion.start();
    new Thread() {
      public void run() {
        try {
          burbuja.join();
          seleccion.join();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
          System.exit(-1);
        }
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            iniciar.setEnabled(true);
          }
        });
      }
    }.start();
  }
}
....

a|
[source, java]
....
abstract class Ordenador extends Thread {

  protected int[] array;
  protected PanelProceso panel;

  protected Ordenador(int[] array, PanelProceso panel) {
    this.array = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      this.array[i] = array[i];
    }
    this.panel = panel;
  }

  protected abstract void ordenar();

  public void run() {
    this.ordenar();
  }

  public void esperar() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) { ex.printStackTrace(); }
  }
}
....

[source, java]
....
class Burbuja extends Ordenador {

  protected Burbuja(int[] array, PanelProceso panel) {
    super(array, panel);
  }

  protected void ordenar() {
    panel.escribir(array);
    this.esperar();
    for (int i = 1; i < array.length; i++) {
      for (int k = array.length - 1; k >= i; k--) {
        if (array[k] < array[k - 1]) {
          int aux = array[k];
          array[k] = array[k - 1];
          array[k - 1] = aux;
          panel.escribir(array);
          this.esperar();
        }
      }
    }
  }
}

....

[source, java]
....
class Seleccion extends Ordenador {

  protected Seleccion(int[] array, PanelProceso panel) {
    super(array, panel);
  }

  protected void ordenar() {
    panel.escribir(array);
    this.esperar();
    for (int i = 0; i < array.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      }
      if (i != min) {
        int aux = array[i];
        array[i] = array[min];
        array[min] = aux;
        panel.escribir(array);
        this.esperar();
      }
    }
  }
}
....

[source, java]
....
class PanelProceso extends JPanel {

  private JLabel label;

  public PanelProceso() {
    label = new JLabel("");
    this.add(label);
  }

  public void escribir(int[] array) {
    String cadena = "";
    for (int i = 0; i < array.length; i++) {
      cadena = cadena + array[i] + " ";
    }
    final String aux = cadena;
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        label.setText(aux);
      }
    });
  }
}
....

|===







<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/5-ejecucionProcesos/diagramaEjecucionProcesos.adoc ===== -->

[plantuml, ejecucionProcesos, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
}

skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

class Thread {
+ run(): void
}

class Proceso {
+ run(): void
}

Thread <\|-- Proceso
....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/5-ejecucionProcesos/diagramaEjecucionProcesos2.adoc ===== -->

[plantuml, ejecucionProcesos2, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
}
skinparam interface {
    BorderThickness 3
    BorderColor #DarkGrey
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
}

skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}

interface Runnable {
+ run(): void
}
class Impresor {
+ imprimir(): void
}

class Thread {
+ run(): void
}

class Proceso {
+ run(): void
}

Runnable <\|.. Thread
Runnable <\|.. Proceso
Thread ..> Proceso :<<use>>
Impresor <\|--  Proceso 
Thread -[hidden] Proceso

....


<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/5-ejecucionProcesos/diagramaEjecucionProcesos3.adoc ===== -->

[plantuml,  diagramaEjecucionProcesos3, svg]
....
skinparam backgroundColor #222222
skinparam handwritten true
skinparam shadowing false
skinparam padding 1
skinparam arrow {
    Thickness 2
    Color #DarkGrey
    FontSize 20
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
skinparam class {
    BorderThickness 3
    BorderColor #DarkGrey
    BorderColor<<yellow>> #FFD700
    BackgroundColor #222222
    FontSize 20
    FontName courier
    FontStyle bold
    FontColor #DarkGrey 
    FontColor<<yellow>> #FFD700
}
skinparam classAttribute {
    FontSize 15
    FontName courier
    FontStyle normal
    FontColor #DarkGrey
}
hide stereotype

class Aplicacion
class Ventana
class JFrame <<yellow>>
class "Panel Contenido" as panelContenido
class Burbuja
class Seleccion
class Thread <<yellow>>
class Ordenador {
- array: int"[]"
+ ordenar()
}
class " Panel Proceso" as panelProceso {
+ escribir(array: int"[]")
}

class JPanel <<yellow>>

JFrame <\|--Ventana 
Aplicacion *--> Ventana
Ventana ..> panelContenido
JPanel <\|-- panelContenido
JPanel <\|-- panelProceso
panelContenido *--> panelProceso 
panelContenido ..> Burbuja
panelContenido ..> Seleccion
Ordenador <\|-- Burbuja
Ordenador <\|-- Seleccion
Ordenador *--> panelProceso
Thread <\|-- Ordenador
....






<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/6-exclucionMutua.adoc ===== -->

## Exclución mutua (I)

[cols="60,40"]
|===

a|
- En Java, al igual que en otros lenguajes, la exclusión mutua sobre los objetos de un programa concurrente se consigue mediante los *_monitores_* (Hoare, 1974).

- Un monitor es un módulo de un programa concurrente que encapsula la representación de recursos abstractos, tales como variables compartidas o dispositivos de entrada y salida.

- Una vez encapsulado el recurso dentro de un monitor, el único medio para acceder al recurso es invocar una de las operaciones que el monitor proporciona que, por definición, se realizan bajo el requisito de *_exclusión mutua_* sobre ese recurso.

a|
- Es decir, si mientras un proceso está ejecutando una operación del monitor, otro proceso trata de ejecutar cualquier operación del mismo monitor, entonces el segundo proceso se bloquea hasta que el primero termine de ejecutar su operación sobre el recurso que representa ese monitor.

- Java proporciona la sentencia *_synchronized_* para indicar que ciertas secuencias de instrucciones se deben ejecutar bajo exclusión mutua sobre un determinado objeto.

|===

[cols="50,50"]
|===

2+a|
*[blue]#Sintaxis (I):#*

a|
[source, java]
....
synchronized(<referencia>) {
    <sentencia1>
    …
    <sentenciaN>
}
....

a|
* lo que indica que cualquier secuencia de sentencias que se encuentre en interior de un bloque sincronizado de *un mismo objeto* debe ejecutarse bajo el requisito de exclusión mutua.

|===

[cols="50,50"]
|===

2+a| *[blue]#Ejemplo:#*

a|
[source, java]
....
class Entero {

  private int i;

  public Entero(int i) {
    this.i = i;
  }

  public void incrementar() {
    i = i + 1;
  }

  public int get() {
    return i;
  }
}

class Proceso extends Thread {

  private Entero entero;

  public Proceso(Entero entero) {
    this.entero = entero;
  }

  public void run() {
    for (int i  = 0; i < 5000; i++) {
      entero.incrementar();
    }
  }
}
....
a|
[source,java]
....
class Aplicacion {

  public static void main(String[] args) {
    Entero entero = new Entero(0);
    Proceso[] procesos = new Proceso[10];
    for (int i = 0; i < procesos.length; i++) {
      procesos[i] = new Proceso(entero);
    }
    for (int i = 0; i < procesos.length; i++) {
      procesos[i].start();
    }
    try {
      for (int i = 0; i < procesos.length; i++) {
        procesos[i].join();
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    System.out.println("Entero = " + entero.get());
  }
}
....

|===

* produce un resultado final impredecible en el entero compartido.

- Si sincronizamos el acceso al entero compartido con un bloque sincronizado, entonces el resultado final será siempre 50000. 

[cols="50,50"]
|===

a|
[source, java]
....
class Proceso extends Thread {

  private Entero entero;

  public Proceso(Entero entero) {
    this.entero = entero;
  }

  public void run() {
    for (int i = 0; i < 5000; i++) {
      synchronized(entero) {
        entero.incrementar();
      }
    }
  }
}
....

a|
- Java también permite emplear el modificador *_synchronized_* para indicar que ciertos métodos de una clase se deben ejecutar bajo exclusión mutua sobre cada objeto de esa clase, lo que proporciona una mayor claridad conceptual de lo que representa un monitor.

|===

[cols="35,65"]
|===

2+a|
- *[blue]#Sintaxis (II):#*

a|
[source, java]
....
class <clase> {
    …
    <acceso> synchronized <metodo>(<args>) {
       …
    }
    …
}
....

a|
* lo que indica que todas las invocaciones de todos los métodos sincronizados sobre un *_mismo objeto_* de la clase deben ejecutarse bajo el requisito de exclusión mutua.

|===

[cols="50,50"]
|===

a|
*[blue]#Ejemplo:#*

[source, java]
....
class Entero {

  private int i;

  public Entero(int i) {
    this.i = i;
  }

  public synchronized void incrementar() {
    i = i + 1;
  }

  public synchronized int get() {
    return i;
  }
}

class Proceso extends Thread {

  private Entero entero;

  public Proceso(Entero entero) {
    this.entero = entero;
  }

  public void run() {
    for (int i  = 0; i < 5000; i++) {
      entero.incrementar();
    }
  }
}
....

a|
[source,java]
....
class Aplicacion {

  public static void main(String[] args) {
    Entero entero = new Entero(0);
    Proceso[] procesos = new Proceso[10];
    for (int i = 0; i < procesos.length; i++) {
      procesos[i] = new Proceso(entero);
    }
    for (int i = 0; i < procesos.length; i++) {
      procesos[i].start();
    }
    try {
      for (int i = 0; i < procesos.length; i++) {
        procesos[i].join();
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    System.out.println("Entero = " + entero.get());
  }
}
....
|===

*  siempre produce un resultado final de 50000 en el entero compartido.




<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/7-semaforos.adoc ===== -->

## Semáforos

[cols="50,50"]
|===

2+a|
*[blue]#Definición:#*

a|
[quote,Dijkstra, 1968]
Los semáforos son una de las primeras y más importantes herramientas de sincronización entre procesos.

* Son herramientas de bajo nivel que permiten resolver de manera sencilla y eficiente los problemas más elementales de sincronización de la programación concurrente, como son la sincronización condicional y la exclusión mutua.

a|
* Conceptualmente, un semáforo puede entenderse como un tipo abstracto de datos, definido por:

** Una estructura de datos formada por un contador (entero no negativo) y una lista de procesos bloqueados asociada al semáforo, los cuales esperan que se cumpla una cierta condición en su contador.

** Un conjunto de operaciones que se pueden efectuar sobre el semáforo.

|===

[cols="65,35"]
|===

a|
*[blue]#Operaciones:#*
a|
*[blue]#Atomicidad:#*

a|
* Conceptualmente, las operaciones básicas que se pueden realizar sobre los semáforos son:

** *INITIAL(s, valor).* Almacena un valor inicial en el contador c del semáforo s.

** *WAIT(s).* Si el valor del contador es mayor que cero, decrementa el contador en una unidad y el proceso continúa su ejecución. Si el valor del contador es cero, el proceso suspende su ejecución, pasa al estado de bloqueado, y se añade a la lista de procesos bloqueados asociada al semáforo.

** *SIGNAL(s).* Si hay procesos bloqueados en la lista asociada al semáforo, uno de ellos abandona la lista, pasando al estado de preparado. Si no hay procesos bloqueados en el semáforo, se incrementa en una unidad su contador. El proceso que invoca a SIGNAL nunca se bloquea, siempre prosigue su ejecución.

a|
* Una característica esencial de estas operaciones es que, por definición, deben ser atómicas, por lo que nunca pueden intercalarse las ejecuciones de dos operaciones sobre el mismo semáforo.

* Por ejemplo, suponiendo que el valor de un semáforo fuera 1, si dos procesos hacen simultáneamente un WAIT sobre él, uno de ellos siempre resultará bloqueado.

|===

### Tipos de semáforos

[cols="40,60"]
|===

a|
- *[blue]#Tipos de semáforos (I):#*

* Dependiendo de los valores que pueda tomar su contador, los semáforos se pueden clasificar en:

** *_Semáforos binarios._* Los únicos valores que puede tomar son 0 y 1.

** *_Semáforos generales._* Puede tomar cualquier valor entero no negativo.

a|
- *[blue]#Tipos de semáforos (II):#*

* También se pueden clasificar los semáforos de acuerdo a la política de gestión de la lista de procesos bloqueados asociada a ellos. Así, tenemos:

** *_Semáforos de conjunto bloqueado._* La lista de procesos bloqueados en el semáforo se gestiona como un conjunto desordenado. Cuando se realiza una operación SIGNAL sobre un semáforo en el que hay procesos bloqueados, se libera uno de ellos de manera no determinista.

** *_Semáforos de cola bloqueada._* Se establece una disciplina de cola (FIFO) entre los procesos bloqueados en el semáforo. Cuando se hace un SIGNAL sobre un semáforo en el que hay procesos bloqueados, se libera el primero que realizó su correspondiente WAIT.

|=== 

[cols="50,50"]
|===

a|
- *[blue]#Tipos de semáforos (III):#*

* Análogamente a lo que sucede con la política de planificación de los procesos, la política de gestión de las colas asociadas a los semáforos tiene una gran influencia en el cumplimiento de las propiedades de corrección de los programas, en especial, las propiedades de justicia.

 * Por esta razón, a los anteriores tipos de semáforos se les conoce habitualmente como semáforos *_injustos_* y semáforos *_justos_*, respectivamente.

** Clase Semaphore:

***  En Java, los semáforos se representan como objetos de la clase Semaphore del paquete _java.util.concurrent._

a|
[source, java]
....
public Semaphore(int permits)							// Injusto
public Semaphore(int permits, boolean fair)				// Especifica la justicia
public void acquire() throws InterruptedException		// WAIT 
public void release()									// SIGNAL
....

***  Los semáforos en Java son generales y su justicia depende del constructor que se utilice.
|===















<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/8-sincronizaciónCondicional.adoc ===== -->

## Sincronización condicional

[cols="35,65"]
|===

a|
- *[blue]#Definición del problema:#* 

* Se debe cumplir el siguiente diagrama de precedencia:

image:sincronizacionCondicional.png[] 

* Este diagrama especifica que el proceso P1 no puede comenzar a ejecutar B hasta que el proceso P2 no haya terminado de ejecutar C

a|
- *[blue]#Solución:#*

* Este problema se resuelve con un semáforo binario asociado al punto de sincronización.

* Antes de comenzar B, el proceso P1 debe esperar mediante una operación WAIT a que el proceso P2 termine C. Esta circunstancia es notificada por el proceso P2 mediante una operación SIGNAL.

* Puesto que P1 debe bloquearse en su WAIT si llega al punto de sincronización antes que P2, el valor inicial del semáforo debe ser 0. P1 reanudará su ejecución cuando P2 efectúe su SIGNAL.

* Si P2 llega antes, hará la operación SIGNAL y el valor del semáforo pasará a valer 1, con lo que P1 no se bloqueará al realizar su WAIT.

|===

[cols="50,50"]
|===

a|
[source, java]
....
import java.util.concurrent.Semaphore;

class Aplicacion {

  public static void main(String[] args) {
	Semaphore s = new Semaphore(0);
	Proceso1 p1 = new Proceso1(s);
	Proceso2 p2 = new Proceso2(s);
	p1.start();
	p2.start();
  }
}

import java.util.concurrent.Semaphore;

class Proceso1 extends Thread {

  private Semaphore s;

  public Proceso1(Semaphore s) {
	this.s = s;
  }

  public void run() {
	try {
	  for (int i  = 0; i < 50; i++) {     // Bloque A
		 System.out.print('A');
	  }

		s.acquire();                            // SINCRONIZACION

		for (int i  = 0; i < 50; i++) {         // Bloque B
			System.out.print('B');
		}
	} catch (InterruptedException ex) {
		ex.printStackTrace();
	}
  }
}
....

a|
[source,java]
....

import java.util.concurrent.Semaphore;

class Proceso2 extends Thread {

  private Semaphore s;

  public Proceso2(Semaphore s) {
	this.s = s;
  }

  public void run() {
	for (int i  = 0; i < 50; i++) {      // Bloque C
	  System.out.print('C');
	}

	s.release();                        // SINCRONIZACION

	for (int i  = 0; i < 50; i++) {      // Bloque D
		System.out.print('D');
	}
  }
}
....

|===





<!-- ===== File: 0-itinerario-master/src/docs/asciidoc/x-bak/x9-programacionConcurrente/9-sincronizacionBarrera.adoc ===== -->

## Sincronización de barrera

[cols="60,40"]
|===

a|
- *[blue]#Definición del problema:#*

* Se debe cumplir el siguiente diagrama de precedencia:

image::sincronizacionBarrera.png[]

* Este diagrama especifica que el proceso P1 no puede comenzar a ejecutar B hasta que el proceso P2 no haya terminado de ejecutar C.

* Además, P2 no puede comenzar a ejecutar D hasta que el proceso P1 no haya terminado de ejecutar A.

a|
- *[blue]#Solución:#*

* Este problema se resuelve con dos semáforos binarios, inicializados a valor 0, de forma que ambos procesos, tras ejecutar su primer bloque de instrucciones y antes de ejecutar el segundo, primero ejecutan una operación SIGNAL sobre un semáforo y luego ejecutan una operación WAIT sobre el otro semáforo.

|===

[cols="50,50"]
|===

a|
[source, java]
....
import java.util.concurrent.Semaphore;

class Aplicacion {

  public static void main(String[] args) {
    Semaphore s1 = new Semaphore(0);
  Semaphore s2 = new Semaphore(0);
  Proceso1 p1 = new Proceso1(s1, s2);
  Proceso2 p2 = new Proceso2(s1, s2);
  p1.start();
  p2.start();
  }
}

import java.util.concurrent.Semaphore;

class Proceso1 extends Thread {

  private Semaphore s1;
  private Semaphore s2;

  public Proceso1(Semaphore s1, Semaphore s2) {
  this.s1 = s1;
  this.s2 = s2;
  }

  public void run() {
  try {
    for (int i  = 0; i < 50; i++)        // Bloque A
      System.out.print('A');

    s2.release();                      // SINCRONIZACION
    s1.acquire();

    for (int i  = 0; i < 50; i++)       // Bloque B
    System.out.print('B');
    } catch (InterruptedException ex) {
    ex.printStackTrace();
    }
  }
}
....

a|
[source,java]
....
import java.util.concurrent.Semaphore;

class Proceso2 extends Thread {

  private Semaphore s1;
  private Semaphore s2;

  public Proceso2(Semaphore s1, Semaphore s2) {
  this.s1 = s1;
  this.s2 = s2;
  }

  public void run() {
  try {
    for (int i  = 0; i < 50; i++)           // Bloque C
    System.out.print('C');

    s1.release();                           // SINCRONIZACION
    s2.acquire();

    for (int i  = 0; i < 50; i++)           // Bloque D
      System.out.print('D');
  } catch (InterruptedException ex) {
    ex.printStackTrace();
  }
  }
}

....

|===


