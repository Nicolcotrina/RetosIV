<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <link rel="icon" type="image/png" href="favicon.ico">
    <meta http-equiv="X-UA-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Formulario</title>
    <link rel="icon" href="img/logo.jfif">
    <link rel="stylesheet" href="CSS/Estilosformucirculo.css">
    <link rel="icon" href="img/imagen1.jpg">
    <!-- CSS only -->
</head>
<body>
<form action="servlet" method="post" class="form">
    <div class="d-flex flex-column justify-content-center w-100 h-100">
<!-- Este es el titulo -->
    <h2 class="form_title"><strong>REGISTRA TU RESPUESTA</h2></strong>
    <h3></h3>
    
    <!--Inputs nombre, usuario y contraseña personalizable con css -->
    <div class="form_container">
        <div class="form_group">
            <input type="text" name="base" id="name" class="form_input" placeholder="" >
            <label for="name" class="form_label"> Agregue la base del triangulo</label>
            <span class="form_line"></span>
    </div>
    <div class="form_group">
        <input type="surname"  name="altura" id="surname" class="form_input" placeholder="" >
        <label for="name" class="form_label" >Agregue la altura del triangulo</label>
        <span class="form_line"></span>
</div>
    
<button type="submit" name="control" value="areatri">Calcular</button>
<form action="servlet" method="post" class="form">
    <div class="d-flex flex-column justify-content-center w-100 h-100">
<!-- Este es el titulo -->
    <h2 class="form_title"><strong>REGISTRA TU RESPUESTA</h2></strong>
    <h3></h3>
    
    <!--Inputs nombre, usuario y contraseña personalizable con css -->
    <div class="form_container">
        <div class="form_group">
            <input type="text" name="longitud1" id="name" class="form_input" placeholder="" >
            <label for="name" class="form_label"> Agregue la longitud del triangulo</label>
            <span class="form_line"></span>
    </div>
</div>
    
<button type="submit" name="control" value="perimtri">Calcular</button>
<a href="servlet?control=index" src="index">
    <button>Regresar</button>




</form>
</body>
</html>