function showLogs(type) {
    const userLogsTable = document.getElementById('userLogs');
    const employeeLogsTable = document.getElementById('employeeLogs');

    if (type === 'user') {
        userLogsTable.classList.remove('hidden');
        userLogsTable.classList.add('active');
        employeeLogsTable.classList.add('hidden');
        employeeLogsTable.classList.remove('active');
    } else if (type === 'employee') {
        userLogsTable.classList.add('hidden');
        userLogsTable.classList.remove('active');
        employeeLogsTable.classList.remove('hidden');
        employeeLogsTable.classList.add('active');
    }
}



