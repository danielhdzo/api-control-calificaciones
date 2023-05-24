# Manual de Instalación del Back-End del api-control-calificaciones

## Requisitos previos

- Sistema operativo compatible (por ejemplo, Windows, Linux, macOS).
- Java Development Kit v11 (JDK 11) instalado en el equipo.
- Herramienta de gestión de dependencias Maven instalada (opcional pero recomendada).

## Pasos de instalación

### 1. Configurar el entorno

- Verifica que tienes instalado el JDK 11 en tu sistema. Puedes comprobarlo ejecutando el comando `java -version` en la línea de comandos.
- Si no tienes instalado el JDK, descárgalo e instálalo siguiendo las instrucciones del proveedor.

### 2. Descargar el código fuente

- Descarga el código fuente del back-end del api-control-calificaciones desde el repositorio:

`git clone https://github.com/danielhdzo/api-control-calificaciones.git`

- También puedes obtener una copia del archivo comprimido (por ejemplo, en formato ZIP) del código fuente desde el repositorio de GitHub.

### 3. Importar el proyecto

- Si estás utilizando una IDE (Integrated Development Environment) como STS, Eclipse o IntelliJ IDEA, importa el proyecto en la IDE utilizando la opción de importación de proyectos existentes.
- Si no estás utilizando una IDE, puedes omitir este paso y utilizar la línea de comandos para compilar y ejecutar el proyecto.

### 4. Configurar la base de datos

- El archivo **pom.xml** contiene la información de conexión requerida, (URL, nombre de la base de datos, el nombre de usuario y la contraseña). 
- El aplicativo utiliza una base de datos **PostgreSQL**; asegúrate de tener una instancia de base de datos compatible instalada y configurada, también son compatibles las bases de datos en la nube (AWS, Azure, Google Cloud, etc., etc.).
- Verifica que los datos de conexión de tu base de datos correspondan en cada perfil (Desarrollo, UAT, Producción, etc.) del archivo **pom.xml**.
- En el directorio `/api-control-calificaciones/src/main/resources` encontrarás los scripts `data.sql` y `schema.sql` que se utilizan para crear las tablas de la base de datos y cargar datos de ejemplo. 
- **Ejecuta el script** `schema.sql` para crear la estructura de la base de datos. 
- **Ejecuta el script** `data.sql` para cargar datos de ejemplo en la base de datos.
- Deberás ejecutar estos scripts en cada base de datos que tengas configurada en cada perfil.

### 5. Compilar el proyecto

- Abre una terminal o línea de comandos en la ubicación del proyecto.
- Ejecuta el siguiente comando para compilar el proyecto utilizando el perfil de **Desarrollo**:

`mvn clean install -P dev`

- Ejecuta el siguiente comando para compilar el proyecto utilizando el perfil de "**Producción**":` 

`mvn clean install -P prod`

> **Nota**: Recuerda revisar y configurar los datos de conexión en cada perfil dentro del archivo **pom.xml**. El archivo actualmente tiene el perfil  de **Desarrollo** por default y este apunta a una base de datos ubicada en **localhost**, el perfil de **Producción** apunta a una base de datos ubicada en la nube.

### 6. Ejecutar el back-end

- Si estás utilizando una IDE, puedes ejecutar la aplicación directamente desde la IDE, si no lo especificas en el IDE, se ejecutara con  el perfil "**dev**" por default.
- Si estás utilizando la línea de comandos, navega hasta la ubicación del archivo JAR (o WAR) generado en el paso 5
- Ejecuta el siguiente comando para iniciar la aplicación utilizando el perfil "**dev**":

`mvn spring-boot:run -P dev`

- Ejecuta el siguiente comando para iniciar la aplicación utilizando el perfil "**prod**":

`mvn spring-boot:run -P prod`

### 7. Verificar la instalación

- Una vez que el back-end esté en funcionamiento, puedes realizar pruebas accediendo a los endpoints utilizando una herramienta de documentación del API ubicada en la rutas:

**Desarrollo:**
`http://localhost:8080/controlcalif/swagger-ui.html`

**Produccion:**
`https://api-control-calificaciones-prod.up.railway.app/controlcalif/swagger-ui.html`

- Tambien puede utilizar la herramienta como Postman o un navegador web para probar los endpoints.
- Consulta la documentación con el Administrador del proyecto para obtener detalles sobre los endpoints disponibles y cómo utilizarlos.

**¡Felicidades!** Has instalado correctamente el back-end del api-control-calificaciones. Ahora estará listo para funcionar y atender las solicitudes del front-end o de cualquier cliente que se comunique con él.

> **Nota**: Estos pasos pueden variar ligeramente dependiendo de tu entorno y configuración específicos. Consulta la documentación proporcionada con el código fuente o busca asistencia adicional si encuentras problemas durante la instalación o configuración del sistema.
