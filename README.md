# T02.1-DisTipos
Proyecto para trabajar el diseño de tipos

Se quieren implementar los siguientes tipos para tres aplicaciones distintas para la gestión de cursos on line, para la gestión de una biblioteca, y la gestión de estadísticas sobre partidos de fútbol de una liga de futbol:

### CursoOnLine

Cada **curso** tiene un identificador único que es una cadena alfanumérica única que lo distingue de otros cursos en la plataforma y está formado por tres letras seguidas de 5 dígitos (por ejemplo, COU00001). Otros datos del curso son su *título*, que es una descripción breve y descriptiva del contenido del curso (por ejemplo, "Aprende a programar en Python"); la *organización* que lo oferta (por ejemplo, "Coursera"); las *fechas de inicio y finalización* (por ejemplo, 14 de Febrero de 2023 y 14 de Mayo de 2023, respectivamente);  la *duración* en horas del curso (por ejemplo, 60 horas); el tipo de *certificación* que otorga el curso, que puede ser "CURSO", "ESPECIALIZACIÓN" o "CERTIFICACIÓN PROFESIONAL"; la *valoración* promedio, otorgada por los estudiantes han completado el curso, por ejemplo, 4.8; el *nivel de dificultad* del curso, que puede tomar los valores Principiante, Intermedio o Avanzado; el *número de estudiantes* que se han matriculado en el curso, por ejemplo, 1200; y un indicador booleano para indicar si el curso es *gratuito*. La aplicación necesita conocer la *media de horas* semanales que hay que dedicarle al curso, que se calcula a partir de la duración en semanas del curso y el número de horas del mismo; y el *estado* del curso, que puede tomar los valores EN_CURSO, FINALIZADO y PROXIMO, que se calculará dependiendo de la fecha actual y las fechas de inicio y finalización del curso.
Una vez creado el curso en el sistema, solamente las fechas de inicio y fin, el número de horas y la gratuidad del curso pueden ser cambiados.

Además, para este tipo se debe controlar la integridad de los datos comprobando que las propiedades cumplen las siguientes restricciones: el *id* del curso debe estar formado por 3 letras y 5 dígitos; la *fecha de finalización* del curso debe ser posterior a la *fecha de inicio*; el curso debe tener una *duración* de, al menos, 1 hora; la *valoración* del curso debe estar entre 0 y 5; y, finalmente, el número de estudiantes no puede ser negativo.

Se entenderá que dos objetos de tipo CursoOnLine son iguales si tienen el mismo id. Los CursosOnLine, de manera natural, se ordenan por el título y, en caso de coincidencia, por el id.


### Libro

Cada libro posee un código llamado ISBN, formado por una serie de dígitos y otros caracteres (por ejemplo, "978-0385536516"), que lo identifica de manera inequívoca. Otros datos del libro que necesitamos manejar son el título (por ejemplo, "Dexter: El oscuro pasajero"), el nombre del autor ("Jeff Lindsay"), el número de páginas (por ejemplo, 288) , la fecha de adquisición (12 de febrero de 2005) y el precio que costó en euros (19,90). Además, el sistema almacena una estimación del número de copias vendidas del libro (por ejemplo, 2.500.000). La aplicación necesita conocer para cada libro si se trata o no de un best-seller (un libro se considera un best-seller si ha vendido más de 500.000 copias). Cada libro tiene asignado un tipo de préstamo, que puede ser diario, semanal o mensual. Una vez creado un libro en el sistema, sólo el número de copias vendidas y el tipo de préstamo pueden ser cambiados.
Además de los métodos de consulta y modificación de las propiedades, se desea disponer de un método que devuelva el número de días que puede ser prestado el libro, en función del tipo de préstamo (diario: 1 día; semanal: 7 días; mensual: 30 días).


Para este tipo se deben comprobar las siguientes restricciones sobre sus propiedades: El código *ISBN* debe contener 10 ó 13 dígitos, sin tener en cuenta otros caracteres como el guión; el *número de páginas* debe ser siempre mayor que cero; el *precio* debe ser una cantidad mayor o igual que cero; la estimación del número de copias vendidas del libro, siempre un número mayor que cero.


Dos libros son iguales si tienen el mismo título e ISBN. Los libros se ordenan, de manera natural, por el título, y en caso de coincidencia por el isbn.


### PartidoFutbol

El tipo **PartidoFutbol** representa un encuentro de fútbol entre dos equipos, detallando información relevante sobre el mismo. Cada partido se caracteriza por su *fecha*, que indica la fecha en la que se celebró el encuentro; l *equipo local* y el *equipo visitante*, que contienen los nombres de los equipos que juegan como local y visitante, respectivamente, y el resultado del partido, del que se almacenan los *goles del equipo local* y los *goles del visitante*, ambos de tipo entero. Basándose en estos valores, se determina el **resultado de la quiniela**, que puede tomar los valores: UNO, EQUIS o DOS. El resultado de la quiniela será UNO si el equipo local marcó más goles que el visitante; EQUIS, si ambos equipos marcaron el mismo número de goles; y DOS, si el equipo visitante tiene más goles que el local. La representación en forma de cadena que muestra la fecha del partido, los nombres de los equipos, el marcador y el resultado de la quiniela en formato reducido (1, X o 2), siguiendo el ejemplo: "24-09-16 -> Sporting Gijón vs Barcelona: 0-5 (2)". Una vez creado un objeto de esta clase, todas sus propiedades son consultables, pero no modificables, asegurando la integridad de la información del partido. 

Las propiedades de este tipo deben cumplir las siguientes restricciones: el nombre de los equipos no puede ser la cadena vacía; y los goles de ambos equipos no pueden tener un valor negativo.

Además, dos partidos son iguales si lo son todas sus propiedades básicas. Los partidos de futbol se ordenar de manera natural por fecha, si coinciden, por nombre del equipo local, y si coinciden, por nombre del equipo visitante, y por los goles.
