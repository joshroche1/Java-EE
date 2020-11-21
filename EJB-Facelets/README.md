# EJB-Facelets
Java Server Facelets and Enterprise Java Beans

# Deploying
git clone https://github.com/joshroche1/EJB-Facelets.git

mvn package

sudo cp target/ejb-facelets-0.1.war /opt/tomee/webapps/

# Project Structure
pom.xml

-/src/main/

----------/java/mypackage/MyClass.java       

----------/webapp/

------------------index.xhtml

------------------myclass.xhtml

-----------------/resources/css/style.css

-----------------/WEB-INF/web.xml

-----------------/templates/template-main.xhtml
