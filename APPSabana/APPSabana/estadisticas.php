<?PHP
	include_once("connection.php");

	if(isset($_POST['select']) && $_POST['select'] == "facultadAsistencias"){
		$dato1 = $_POST['dato1'];	
		$query = "SELECT idfacultad, facultad, asistencia,COUNT(Asistencia) as conteo FROM Reporte p
        INNER JOIN Clase cl ON cl.idclase = p.clase_idclase
        INNER JOIN Curso cr ON cr.idcurso = cl.curso_idcurso
        INNER JOIN Facultad fc ON fc.idfacultad = cr.facultad_idfacultad
        WHERE fc.idFacultad = '$dato1'
        GROUP BY Asistencia;";
	}



	$result = mysqli_query($conn, $query);

	while($row = mysqli_fetch_assoc($result)){
		$data[] = $row;
	}

	echo json_encode($data);
?>