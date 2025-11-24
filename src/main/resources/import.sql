INSERT INTO users (username, password, enabled, email) VALUES ('admin', '$2a$12$HiVZzilA7cp05vflCtRrOOdC.tno3RPARhLDKJm5xn5ie2xF9qeEa',true, 'admin@gmail.com');
INSERT INTO roles (rol, user_id) VALUES ('ADMIN', 1);

INSERT INTO users (username, password, enabled, email) VALUES ('user', '$2a$12$hKua71N0EtJxvOrrwBgm2u/GiOCBM5XKJPdGkCsHKB7LFtQezbRxi',true, 'user@gmail.com');
INSERT INTO roles (rol, user_id) VALUES ('ESTUDIANTE', 2);

INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Saludos 1','Aprender a saludar correctamente es fundamental para establecer una interacción respetuosa y cercana, además de fomentar el reconocimiento cultural de la comunidad sorda en el Perú.','Objetivos del curso:'|| CHR(10) ||'-Familiarizar a los usuarios con los saludos básicos en LSP.'|| CHR(10) ||'-Desarrollar habilidades para reconocer y reproducir los gestos de los saludos en LSP.'|| CHR(10) ||'-Promover la sensibilización y el respeto hacia la cultura sorda.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Saludos 1','Aprender a saludar correctamente es esencial para construir interacciones respetuosas y amables, además de promover la comprensión cultural y la inclusión dentro de la comunidad sorda estadounidense.','Objetivos del curso:' || CHR(10) || '-Familiarizar a los usuarios con los saludos básicos en ASL.' || CHR(10) || '-Desarrollar la habilidad de reconocer y realizar los saludos en ASL con precisión.' || CHR(10) || '-Fomentar el respeto y la conciencia hacia la cultura sorda y sus formas de comunicación.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Estados y emociones 1','Reconocer y expresar emociones en lengua de señas es esencial para una comunicación empática y auténtica. Este curso busca fortalecer la comprensión emocional y la expresión de sentimientos en diferentes contextos cotidianos.','Objetivos del curso:' || CHR(10) || '-Enseñar las señas correspondientes a los estados emocionales más comunes.' || CHR(10) || '-Fomentar la empatía y la inteligencia emocional en la comunicación con personas sordas.' || CHR(10) || '-Desarrollar la capacidad de identificar y expresar emociones de manera efectiva.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Estados y emociones 1','Expresar las emociones en ASL permite una comunicación más auténtica y empática. Este curso enseña cómo identificar y representar diferentes estados emocionales en diversas situaciones cotidianas.','Objetivos del curso:' || CHR(10) || '-Enseñar los signos más comunes de emociones y sentimientos en ASL.' || CHR(10) || '-Fomentar la empatía y el reconocimiento emocional a través del lenguaje de señas.' || CHR(10) || '-Fortalecer la expresión emocional y la comunicación interpersonal.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Identidad personal 1','Presentarse y hablar de uno mismo en LSP es clave para la comunicación interpersonal. Este curso permite a los estudiantes aprender a compartir información básica sobre su identidad.','Objetivos del curso:' || CHR(10) || '-Aprender las señas relacionadas con la identidad personal y la presentación.' || CHR(10) || '-Mejorar la habilidad para entablar conversaciones iniciales en LSP.' || CHR(10) || '-Promover la confianza al expresarse sobre uno mismo ante otras personas.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Identidad personal 1','Presentarse y hablar de uno mismo es una parte esencial de cualquier conversación. En este curso, los usuarios aprenderán a compartir información personal como el nombre, la edad y el lugar de origen en ASL.','Objetivos del curso:' || CHR(10) || '-Aprender signos relacionados con la identidad personal y las presentaciones.' || CHR(10) || '-Desarrollar confianza para iniciar conversaciones en ASL.' || CHR(10) || '-Mejorar la fluidez al hablar sobre uno mismo utilizando señas.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Lugares y rutinas 1','Conocer los lugares más comunes y las actividades diarias en LSP ayuda a desenvolverse en entornos cotidianos y a comprender conversaciones relacionadas con la vida diaria.','Objetivos del curso:' || CHR(10) || '-Enseñar vocabulario en señas sobre lugares y acciones cotidianas.' || CHR(10) || '-Desarrollar la comprensión y expresión de rutinas diarias en LSP.' || CHR(10) || '-Fomentar la aplicación del aprendizaje en situaciones reales de la vida diaria.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Lugares y rutinas 1','Conocer los signos de lugares comunes y actividades cotidianas en ASL facilita la comunicación en situaciones diarias y mejora la comprensión del entorno.','Objetivos del curso:' || CHR(10) || '-Enseñar vocabulario sobre lugares y acciones comunes en la vida diaria.' || CHR(10) || '-Desarrollar la capacidad de describir rutinas y actividades en ASL.' || CHR(10) || '-Promover la práctica del ASL en contextos reales y cotidianos.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Preguntas y negaciones 1','Formular preguntas y expresar negaciones correctamente en LSP es esencial para mantener conversaciones naturales. Este curso enseña las estructuras básicas para realizar consultas y responder con claridad.','Objetivos del curso:' || CHR(10) || '-Aprender las señas y estructuras gramaticales de preguntas y negaciones en LSP.' || CHR(10) || '-Desarrollar la capacidad para mantener diálogos interactivos en diferentes contextos.' || CHR(10) || '-Mejorar la comprensión del lenguaje no verbal asociado a la interrogación y negación.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Preguntas y negaciones 1','Formular preguntas y expresar negaciones correctamente en ASL es fundamental para mantener conversaciones naturales y efectivas. Este curso enseña las estructuras básicas de preguntas y negaciones en la lengua de señas americana.','Objetivos del curso:' || CHR(10) || '-Aprender los signos y expresiones faciales usados para hacer preguntas y negar en ASL.' || CHR(10) || '-Mejorar la fluidez conversacional mediante ejercicios interactivos.' || CHR(10) || '-Comprender mejor la gramática y las señales no manuales propias del ASL.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Saludos 2','Este curso profundiza en las formas de saludo y despedida utilizadas en distintos contextos formales e informales. Los estudiantes aprenderán a adaptar su comunicación en lengua de señas según la situación y el interlocutor, fortaleciendo su fluidez y comprensión cultural.','Objetivos del curso:' || CHR(10) || '-Dominar saludos y despedidas en contextos formales e informales.' || CHR(10) || '-Aprender variaciones culturales en las formas de saludo dentro de la comunidad sorda.' || CHR(10) || '-Mejorar la expresión facial y corporal para transmitir respeto y cordialidad.','LSP');

INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Saludos 2','Este curso profundiza en las formas de saludo y despedida utilizadas en diferentes contextos de la vida cotidiana en la comunidad sorda estadounidense. Se busca mejorar la fluidez comunicativa y la comprensión cultural en ASL.','Objetivos del curso:' || CHR(10) || '-Dominar saludos y despedidas en contextos formales e informales en ASL.' || CHR(10) || '-Conocer las variaciones culturales en las expresiones de saludo dentro de la comunidad sorda americana.' || CHR(10) || '-Mejorar la expresión corporal y facial para lograr una comunicación más natural.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Estados y emociones 2','En esta segunda parte, los estudiantes aprenderán a expresar emociones más complejas y combinadas, así como a interpretar las sutilezas emocionales en las conversaciones. El enfoque está en desarrollar empatía y precisión expresiva.','Objetivos del curso:' || CHR(10) || '-Aprender señas relacionadas con emociones complejas y sentimientos mixtos.' || CHR(10) || '-Desarrollar la capacidad de interpretar matices emocionales en las señas de otras personas.' || CHR(10) || '-Utilizar expresiones faciales avanzadas para transmitir emociones con mayor claridad.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Estados y emociones 2','Este curso amplía el vocabulario emocional en ASL, enseñando a expresar sentimientos complejos y sutiles. Los estudiantes fortalecerán su capacidad de reconocer e interpretar emociones en diferentes contextos comunicativos.','Objetivos del curso:' || CHR(10) || '-Aprender signos para emociones avanzadas y combinadas.' || CHR(10) || '-Perfeccionar la lectura de expresiones faciales y corporales en ASL.' || CHR(10) || '-Desarrollar empatía y precisión en la expresión de sentimientos.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Identidad personal 2','Este curso amplía las habilidades comunicativas relacionadas con la identidad, incorporando descripciones personales, gustos, experiencias y aspiraciones. Los estudiantes aprenderán a sostener conversaciones más detalladas sobre sí mismos y los demás.','Objetivos del curso:' || CHR(10) || '-Aprender señas para describir características físicas, gustos y preferencias personales.' || CHR(10) || '-Desarrollar la capacidad de mantener conversaciones sobre experiencias y rutinas personales.' || CHR(10) || '-Fomentar la autoconfianza en la comunicación extendida sobre identidad y personalidad.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Identidad personal 2','En esta segunda parte, los estudiantes aprenderán a compartir más información sobre su vida personal en ASL, incluyendo experiencias, pasatiempos y descripciones detalladas.','Objetivos del curso:' || CHR(10) || '-Ampliar el vocabulario relacionado con características personales y gustos.' || CHR(10) || '-Desarrollar la habilidad de mantener conversaciones fluidas sobre experiencias y preferencias.' || CHR(10) || '-Fortalecer la confianza al hablar sobre uno mismo utilizando ASL.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Lugares y rutinas 2','En esta segunda parte, se abordarán lugares más específicos y rutinas complejas, incluyendo actividades laborales, educativas y de ocio. Los estudiantes mejorarán su fluidez al narrar y describir su día a día.','Objetivos del curso:' || CHR(10) || '-Aprender vocabulario avanzado sobre lugares, actividades y transporte.' || CHR(10) || '-Describir rutinas detalladas y narrar secuencias de acciones diarias.' || CHR(10) || '-Integrar señas temporales y espaciales para una comunicación más natural.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Lugares y rutinas 2','El curso profundiza en la descripción de actividades cotidianas más complejas y contextos específicos en ASL, como el trabajo, la escuela y el ocio.','Objetivos del curso:' || CHR(10) || '-Ampliar el vocabulario sobre lugares, acciones y medios de transporte.' || CHR(10) || '-Mejorar la capacidad para describir secuencias de actividades diarias.' || CHR(10) || '-Usar referencias espaciales y temporales para expresar rutinas con mayor precisión.','ASL');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Preguntas y negaciones 2','El curso profundiza en la formulación de preguntas complejas y respuestas negativas elaboradas. Los estudiantes practicarán estructuras interrogativas y negaciones utilizadas en conversaciones más fluidas y contextos variados.','Objetivos del curso:' || CHR(10) || '-Aprender a formular preguntas compuestas y de seguimiento.' || CHR(10) || '-Usar correctamente expresiones faciales y corporales para reforzar la intención interrogativa o negativa.' || CHR(10) || '-Mejorar la coherencia y naturalidad en diálogos que incluyan interrogaciones y negaciones múltiples.','LSP');
INSERT INTO cursos (nombre, descripcion, objetivos, tipolengua) VALUES ('Preguntas y negaciones 2','Este curso enseña a formular preguntas más complejas y respuestas elaboradas en ASL. Se enfoca en mejorar la naturalidad conversacional y la correcta interpretación de la intención comunicativa.','Objetivos del curso:' || CHR(10) || '-Aprender estructuras interrogativas y negativas avanzadas.' || CHR(10) || '-Utilizar con precisión las expresiones faciales asociadas a preguntas y negaciones.' || CHR(10) || '-Mejorar la fluidez y claridad al mantener conversaciones más complejas en ASL.','ASL');

INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Hola', 'Buenos dias', 'Buenas tardes', 'Buenas noches', 1);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Chau', 'Por favor', 'Gracias', 'De nada', 11);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Bien', 'Mal', 'Mas o menos', 'Como estas', 3);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Feliz', 'Triste', 'Molesto', 'Cansado', 13);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Yo', 'Tu', 'Nombre', 'Edad', 5);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Amigo', 'Familia', 'Papá', 'Profesor', 15);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Casa', 'Estudiar', 'Donde', 'Comer', 7);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Dormir', 'Aprender', 'Escuela', 'Baño', 17);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('No', 'Cual', 'Si', 'Tal vez', 9);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Que', 'Quien', 'Cuando', 'Por que', 19);

INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Hello', 'Good morning', 'Good afternoon', 'Good night', 2);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Bye', 'Please', 'Thank you', 'You are welcome', 12);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Fine', 'Bad', 'So so', 'How are you', 4);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Happy', 'Sad', 'Annoying', 'Tired', 14);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Me', 'You', 'Name', 'Age', 6);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Friend', 'Family', 'Dad', 'Teacher', 16);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Home', 'Study', 'Where', 'Eat', 8);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('Sleep', 'Learn', 'School', 'Bathroom', 18);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('No ', 'Which', 'Yes', 'Maybe', 10);
INSERT INTO palabras (palabra1, palabra2, palabra3, palabra4, cursos_id) VALUES ('What', 'Who', 'When', 'Why', 20);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Hola', 'Buenos dias', 'Buenas noches', 'Hola', 'Gracias', 'Hola', 1);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Buenos dias', 'Buenas tardes', 'Buenos dias', 'Chau', 'De nada', 'Buenos dias', 1);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Buenas tardes', 'Hola', 'Buenas tardes', 'Chau', 'Por favor', 'Buenas tardes', 1);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Buenas noches', 'Buenas noches', 'De nada', 'Gracias', 'Por favor', 'Buenas noches', 1);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Chau', 'Por favor', 'Gracias', 'Chau', 'Buenas tardes', 'Chau', 11);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Por favor', 'Gracias', 'Por favor', 'De nada', 'Hola', 'Por favor', 11);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Gracias', 'Chau', 'Buenas noches', 'Gracias', 'Hola', 'Gracias', 11);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('De nada', 'Buenas tardes', 'De nada', 'Hola', 'Por favor', 'De nada', 11);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Bien', 'Bien', 'Mal', 'Triste', 'Como estas', 'Bien', 3);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Mal', 'Cansado', 'Mal', 'Feliz', 'Como estas', 'Mal', 3);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Mas o menos', 'Mas o menos', 'Feliz', 'Triste', 'Bien', 'Mas o menos', 3);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Como estas', 'Bien', 'Cansado', 'Como estas', 'Molesto', 'Como estas', 3);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Feliz', 'Cansado', 'Como estas', 'Feliz', 'Mal', 'Feliz', 13);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Triste', 'Triste', 'Bien', 'Molesto', 'Feliz', 'Triste', 13);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Molesto', 'Cansado', 'Molesto', 'Feliz', 'Bien', 'Molesto', 13);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Cansado', 'Cansado', 'Como estas', 'Mas o menos', 'Bien', 'Cansado', 13);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Yo', 'Tu', 'Edad', 'Yo', 'Nombre', 'Yo', 5);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Tu', 'Yo', 'Tu', 'Nombre', 'Profesor', 'Tu', 5);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Nombre', 'Amigo', 'Nombre', 'Familia', 'Papá', 'Nombre', 5);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Edad', 'Profesor', 'Papá', 'Familia', 'Edad', 'Edad', 5);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Amigo', 'Amigo', 'Familia', 'Papá', 'Profesor', 'Amigo', 15);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Familia', 'Papá', 'Familia', 'Yo', 'Nombre', 'Familia', 15);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Papá', 'Profesor', 'Amigo', 'Papá', 'Tu', 'Papá', 15);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Profesor', 'Familia', 'Papá', 'Profesor', 'Edad', 'Profesor', 15);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Casa', 'Casa', 'Donde', 'Estudiar', 'Comer', 'Casa', 7);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Estudiar', 'Aprender', 'Dormir', 'Estudiar', 'Escuela', 'Estudiar', 7);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Donde', 'Donde', 'Casa', 'Comer', 'Baño', 'Donde', 7);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Comer', 'Dormir', 'Aprender', 'Comer', 'Estudiar', 'Comer', 7);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Dormir', 'Aprender', 'Dormir', 'Escuela', 'Casa', 'Dormir', 17);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Aprender', 'Comer', 'Baño', 'Aprender', 'Escuela', 'Aprender', 17);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Escuela', 'Dormir', 'Baño', 'Aprender', 'Escuela', 'Escuela', 17);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Baño', 'Baño', 'Casa', 'Comer', 'Estudiar', 'Baño', 17);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('No', 'Si', 'No', 'Cual', 'Tal vez', 'No', 9);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Cual', 'Cual', 'Si', 'No', 'Por que', 'Cual', 9);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Si', 'Tal vez', 'Por que', 'No', 'Si', 'Si', 9);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Tal vez', 'Cual', 'Tal vez', 'Por que', 'Si', 'Tal vez', 9);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Que', 'Quien', 'Que', 'Cuando', 'Por que', 'Que', 19);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Quien', 'Por que', 'Quien', 'Cual', 'No', 'Quien', 19);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Cuando', 'Cuando', 'Tal vez', 'Por que', 'Cual', 'Cuando', 19);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Por que', 'Por que', 'Que', 'No', 'Quien', 'Por que', 19);



INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Hello', 'Good morning', 'Hello', 'Good night', 'Bye', 'Hello', 2);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Good morning', 'Good morning', 'Good afternoon', 'Hello', 'Bye', 'Good morning', 2);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Good afternoon', 'Good night', 'Good afternoon', 'Hello', 'Please', 'Good afternoon', 2);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Good night', 'Thank you', 'Good night', 'Good morning', 'Hello', 'Good night', 2);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Bye', 'Bye', 'Good morning', 'Thank you', 'Hello', 'Bye', 12);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Please', 'Please', 'Hello', 'You are welcome', 'Good afternoon', 'Please', 12);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Thank you', 'Bye', 'Thank you', 'Please', 'Hello', 'Thank you', 12);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('You are welcome', 'You are welcome', 'Please', 'Thank you', 'Good night', 'You are welcome', 12);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Fine', 'Fine', 'So so', 'Bad', 'How are you', 'Fine', 4);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Bad', 'Bad', 'Fine', 'So so', 'Tired', 'Bad', 4);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('So so', 'So so', 'Fine', 'Sad', 'How are you', 'So so', 4);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('How are you', 'Happy', 'How are you', 'Sad', 'Tired', 'How are you', 4);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Happy', 'Happy', 'Sad', 'Annoying', 'Tired', 'Happy', 14);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Sad', 'Sad', 'Annoying', 'Fine', 'So so', 'Sad', 14);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Annoying', 'Tired', 'Annoying', 'Sad', 'Happy', 'Annoying', 14);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Tired', 'Tired', 'Annoying', 'Sad', 'Happy', 'Tired', 14);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Me', 'You', 'Name', 'Age', 'Me', 'Me', 6);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('You', 'You', 'Name', 'Friend', 'Family', 'You', 6);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Name', 'Name', 'Age', 'Dad', 'Teacher', 'Name', 6);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Age', 'Me', 'Age', 'Friend', 'Family', 'Age', 6);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Friend', 'Friend', 'Family', 'Dad', 'Teacher', 'Friend', 16);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Family', 'Family', 'Friend', 'Dad', 'Teacher', 'Family', 16);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Dad', 'Teacher', 'Family', 'Dad', 'Friend', 'Dad', 16);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Teacher', 'Teacher', 'Friend', 'Dad', 'Family', 'Teacher', 16);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('House', 'House', 'Where', 'Study', 'Eat', 'House', 8);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Study', 'Learn', 'Sleep', 'Study', 'School', 'Study', 8);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Where', 'Where', 'House', 'Eat', 'Bathroom', 'Where', 8);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Eat', 'Sleep', 'Learn', 'Eat', 'Study', 'Eat', 8);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Sleep', 'Learn', 'Sleep', 'School', 'House', 'Sleep', 18);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Learn', 'Eat', 'Bathroom', 'Learn', 'School', 'Learn', 18);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('School', 'Sleep', 'Bathroom', 'Learn', 'School', 'School', 18);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Bathroom', 'Bathroom', 'House', 'Eat', 'Study', 'Bathroom', 18);

INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('No ', 'Yes', 'No ', 'Which', 'Maybe', 'No ', 10);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Which', 'Which', 'Yes', 'No ', 'Why', 'Which', 10);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Yes', 'Maybe', 'Why', 'No ', 'Yes', 'Yes', 10);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Maybe', 'Which', 'Maybe', 'Why', 'Yes', 'Maybe', 10);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('What', 'Who', 'What', 'When', 'Why', 'What', 20);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Who', 'Why', 'Who', 'Which', 'No ', 'Who', 20);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('When', 'When', 'Maybe', 'Why', 'Which', 'When', 20);
INSERT INTO pregunta (pregunta, respuesta1, respuesta2, respuesta3, respuesta4, respuestaverdad, cursos_id) VALUES ('Why', 'Why', 'What', 'No ', 'Who', 'Why', 20);

INSERT INTO alfabeto (letra, tipolengua) VALUES ('A', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('B', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('C', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('D', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('E', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('F', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('G', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('H', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('I', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('J', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('K', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('L', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('M', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('N', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('O', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('P', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('Q', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('R', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('S', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('T', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('U', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('V', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('W', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('X', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('Y', 'LSP');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('Z', 'LSP');

INSERT INTO alfabeto (letra, tipolengua) VALUES ('A', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('B', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('C', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('D', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('E', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('F', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('G', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('H', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('I', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('J', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('K', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('L', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('M', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('N', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('O', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('P', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('Q', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('R', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('S', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('T', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('U', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('V', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('W', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('X', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('Y', 'ASL');
INSERT INTO alfabeto (letra, tipolengua) VALUES ('Z', 'ASL');

INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 1, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 2, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 3, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 4, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 5, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 6, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 7, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 8, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 9, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 10, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 11, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 12, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 13, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 14, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 15, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 16, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 17, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 18, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 19, 1);
INSERT INTO valoraciones (valoracion, comentario, cursos_id, user_id) VALUES (5, 'Muy bueno', 20, 1);









