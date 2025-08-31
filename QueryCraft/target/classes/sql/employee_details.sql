SELECT e.id, e.name, e.gender, e.address, e.dob, e.doj, e.designation,
       d.name AS department_name, d.location AS department_location,
       p.name AS project_name, p.location AS project_location
FROM employees e
LEFT JOIN departments d ON e.department_id = d.id
LEFT JOIN projects p ON e.project_id = p.id;