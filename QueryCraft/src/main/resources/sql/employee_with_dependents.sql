SELECT e.id AS employee_id, e.name AS employee_name, e.designation, e.gender,
       d.name AS department_name,
       dep.id AS dependent_id, dep.name AS dependent_name, dep.relationship, dep.gender AS dependent_gender
FROM employees e
LEFT JOIN departments d ON e.department_id = d.id
LEFT JOIN dependents dep ON dep.employee_id = e.id
ORDER BY e.id;
