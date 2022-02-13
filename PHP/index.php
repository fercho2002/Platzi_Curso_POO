<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");
require_once("uberPool.php");

$uberX = new UberX("MOB123", new Account("fercho torres", "1002425"),"BMW","deportivo");
$uberX->printDataCar();
echo "<br>";
$uberPool = new UberPool("MOB456", new Account("andres saavedra", "12524100"),"Mercedez Benz","deportivo");
$uberPool->printDataCar();
?>