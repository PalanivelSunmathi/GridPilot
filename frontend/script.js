document.addEventListener("DOMContentLoaded", function () {

    updateDashboard();

});


function updateDashboard() {

    // Simulated power grid data
    const voltage = (225 + Math.random() * 10).toFixed(0);
    const current = (8 + Math.random() * 5).toFixed(1);

    const power = ((voltage * current) / 1000).toFixed(2);

    const devices = Math.floor(15 + Math.random() * 6);

    // Update dashboard values
    document.getElementById("voltageValue").textContent = voltage;

    document.getElementById("currentValue").textContent = current;

    document.getElementById("powerValue").textContent = power;

    document.getElementById("deviceValue").textContent = devices;

}


/* ================= REFRESH DASHBOARD ================= */

function refreshDashboard() {

    updateDashboard();

    alert("Dashboard data refreshed successfully!");

}