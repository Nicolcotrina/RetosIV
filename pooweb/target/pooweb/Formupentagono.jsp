<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <link rel="icon" type="image/png" href="favicon.ico">
    <title>Formulario</title>
    <link rel="icon" href="img/logo.jfif">
    <link rel="stylesheet" href="CSS/Estilosformucirculo.css">
    <link rel="icon" href="img/imagen1.jpg">
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
            <input type="text" name="perimetro" id="name" class="form_input" placeholder="" >
            <label for="name" class="form_label"> Agregue el perimetro del pentagono</label>
            <span class="form_line"></span>
    </div>
    <div class="form_group">
        <input type="surname"  name="apotema" id="surname" class="form_input" placeholder="" >
        <label for="name" class="form_label" >Agregue el apotema del pentagono</label>
        <span class="form_line"></span>
</div>
  
<button type="submit" name="control" value="areapen">Calcular</button>
<form action="servlet" method="post" class="form">
    <div class="d-flex flex-column justify-content-center w-100 h-100">
<!-- Este es el titulo -->
    <h2 class="form_title"><strong>REGISTRA TU RESPUESTA</h2></strong>
    <h3></h3>
    
    <!--Inputs nombre, usuario y contraseña personalizable con css -->
    <div class="form_container">
        <div class="form_group">
            <input type="text" name="longitud" id="name" class="form_input" placeholder="" >
            <label for="name" class="form_label"> Agregue la longitud del pentagono</label>
            <span class="form_line"></span>
    </div>
</div>
  
<button type="submit" name="control" value="perimpen">Calcular</button>
<a href="servlet?control=index" src="index">
    <button>Regresar</button>





</form>
</body>
</html>