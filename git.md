Markdown y Git

1.  ¿Qué es Markdown?
Markdown es una forma sencilla de escribir texto con formato usando símbolos simples.  
Se utiliza mucho en GitHub para documentar proyectos porque permite crear títulos, listas y organizar la información sin programas complicados.

2.  ¿Qué es un repositorio?
Un repositorio es el lugar donde se guarda un proyecto junto con todo su historial de cambios.  
No es solo una carpeta normal, ya que permite ver versiones anteriores y trabajar en equipo.

3. Áreas principales de Git
Git funciona en tres etapas:

- Working Directory: donde se hacen los cambios en los archivos.
- Staging Area: donde se preparan los cambios antes de guardarlos.
- Repository: donde se almacenan los cambios confirmados mediante commits.

4.¿Cómo guarda Git la información?
Internamente Git organiza los datos en:

- Blob: contenido de un archivo.
- Tree: estructura de carpetas.
- Commit: registro de cambios realizados.
- Tag: marca que señala un punto importante del proyecto.

 ¿Qué es un commit?
Es el registro que guarda oficialmente los cambios realizados.  
Incluye información como el autor, la fecha y un mensaje descriptivo.

 Diferencia entre git pull y git fetch
- git fetch trae los cambios del repositorio remoto sin aplicarlos.
- git pull trae los cambios y los combina automáticamente.

 ¿Qué es un branch?
Un branch es una rama alternativa del proyecto.  
Permite desarrollar nuevas funciones sin afectar la versión principal.

 ¿Cómo se hace un merge?
Se utiliza el comando git merge para unir los cambios de una rama con otra.  
Si existen diferencias en la misma línea de código, pueden aparecer conflictos que deben resolverse manualmente.

¿Qué hace git add?
Agrega los archivos modificados al área de preparación (staging) para incluirlos en el próximo commit.

 ¿Qué es .gitignore?
Es un archivo donde se especifican los elementos que no deben ser rastreados por Git.

 ¿Para qué sirve --amend?
Permite modificar el último commit realizado.

 ¿Qué es git stash?
Sirve para guardar cambios de forma temporal sin hacer commit.

 ¿Cómo deshacer cambios?
Se pueden usar comandos como:
- git reset
- git revert
- git checkout

 ¿Qué significan origin y upstream?
Origin es el repositorio remoto principal.  
Upstream se usa cuando se trabaja con una copia (fork) de otro repositorio.
 ¿Cómo ver el historial?
- git log muestra los commits.
- git diff muestra las diferencias entre versiones.
- git show muestra detalles de un commit específico.