SELECT e.id AS employee_id,
       e.name AS employee_name,
       d.name AS department_name,
       p.name AS project_name,
       COUNT(dep.id) AS total_dependents
FROM employees e
LEFT JOIN departments d ON e.department_id = d.id
LEFT JOIN projects p ON e.project_id = p.id
LEFT JOIN dependents dep ON dep.employee_id = e.id
GROUP BY e.id, e.name, d.name, p.name
ORDER BY e.id;
