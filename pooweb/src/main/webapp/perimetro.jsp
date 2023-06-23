<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/Estilosperimetro.css">
    <title>Figuras Geometricas</title>
</head>
<body>
    
   <center> <h1>EL PERIMETRO ES:<br><%= request.getAttribute("perimetro")%></h1></center>
   <a href="servlet?control=index" src="index">
    <button>Regresar</button>
</a>
</body>
</html>