# POO-MOVILES-PRACTICA3
Desarrollo de una aplicación móvil nativa Android, que permita realizar peticiones Http usando la librería Volley o Retrofit para obtener información de alguna Api restful que requiera parámetros en el Header para su funcionamiento. 

Para el desarrollo de esta aplicación se utilizó Volley para relaizar las peticiones Http

Se utilizó la Api Rest Publica publicada en PlaceHolder que contiene una lista con 100 posts, la cual le pertenecen a 10 usuarios diferentes, siendo cada uno propietario de 10 posts
![https://jsonplaceholder.typicode.com/posts](https://jsonplaceholder.typicode.com/posts)


CAPTURAS DE FUNCIONAMIENTO DE LA APLICACIÓN:

Al Abrir la aplicación Nos muestra la siguiente pantalla (Activity):

![alt text](https://github.com/CarlosSebastianCarvajal/POO-MOVILES-PRACTICA3/blob/main/capturas/Screenshot_1639512244.png)

En esta Activity tenemos una caja de texto para ingresar id de usuario o id de post para el caso de filtrar la informacion y tambien tenomos la opción en caso de querer fitrar por usuario o por posts

En el caso de solo presionar el boton Enviar se muestran todos los registros:
![alt text](https://github.com/CarlosSebastianCarvajal/POO-MOVILES-PRACTICA3/blob/main/capturas/Captura1.PNG)

En el caso de escribir un ID en la caja de texto y selecionar una opción los registros se filtran.
Si se escoge la opción de Id de Usuario nos muestra solo los posts perteneciente a ese usuario:
![alt text](https://github.com/CarlosSebastianCarvajal/POO-MOVILES-PRACTICA3/blob/main/capturas/Captura3.PNG)

Si se escoge la opción de Id de Posts nos muestra unicamente el posts que contiene ese ID:
![alt text](https://github.com/CarlosSebastianCarvajal/POO-MOVILES-PRACTICA3/blob/main/capturas/Captura2.PNG)
