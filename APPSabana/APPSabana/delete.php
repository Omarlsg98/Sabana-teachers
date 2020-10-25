<?PHP
    include_once("connection.php");
    if( isset($_POST['txtAsistencia']) && isset($_POST['dato2'])) {
        $Asistencia = $_POST['dato1'];
        $Clase_idClase = $_POST['dato2'];

        $query = "SELECT idReporte as ID FROM voto WHERE asistencia = '$Asistencia' AND clase_idclase = '$Clase_idClase' ORDER BY idReporte Desc LIMIT 1;";

        $result = mysqli_query($conn, $query);
        $row = mysqli_fetch_assoc($result);

        $query = "DELETE FROM Voto WHERE idReporte = $row['ID']";
        $result = mysqli_query($conn, $query);
        if($result > 0){
            if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){
                echo "success1";
                exit;
            }
            echo "Insert Successfully";
        } else{
            echo "Insert Failed <br/>";
        }
    }
?>