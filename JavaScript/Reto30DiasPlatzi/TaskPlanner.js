/*
En este desafío, debes implementar la lógica de un planificador de tareas que permita agregar, eliminar y marcar como completadas las tareas,
así como también mostrar un registro de las mismas.
Para ello, debes construir la lógica de la función closure llamada createTaskPlanner para que devuelva los siguientes métodos:

- addTask(task): recibe un objeto que contiene la tarea y la agrega al array de tareas.
La tarea debe estar conformada por las siguientes propiedades: id, name, priority, tags y completed, donde el estado completed se agrega automáticamente como falso al momento de agregar una tarea.
- removeTask(value): recibe el id o nombre de la tarea y la elimina del array de tareas.
- getTasks(): Devuelve el array de tareas.
- getPendingTasks(): Devuelve solo las tareas pendientes.
- getCompletedTasks(): Devuelve solo las tareas completadas.
- markTaskAsCompleted(value): Recibe el id o nombre de la tarea y la marca como completada.
- getSortedTasksByPriority(): Devuelve una copia de las tareas ordenadas según su prioridad (3: poco urgente, 2: urgente, 1: muy urgente), sin modificar la lista de tareas original.
- filterTasksByTag(tag): Filtra las tareas por una etiqueta específica.
- updateTask(taskId, updates): Buscar la tarea correspondiente con el id especificado y actualizar sus propiedades con las especificadas en el objeto updates.

 */
function createTaskPlanner() {

    let taskList = [];

    return {
        addTask(task) {
            task.completed = false;
            taskList.push(task);
        },

        removeTask(value) {

            for (let i = 0; i < taskList.length; i++) {
                if (
                    taskList[i].id === value ||
                    taskList[i].name === value
                ) {
                    taskList.splice(i, 1);
                }
            }

        },

        getTasks() {
            return taskList;
        },

        getPendingTasks() {
            return taskList.filter(task => !task.completed);
        },

        getCompletedTasks() {
            return taskList.filter(task => task.completed);
        },

        markTaskAsCompleted(value) {
            for (let i = 0; i < taskList.length; i++) {
                if (
                    taskList[i].id === value ||
                    taskList[i].name === value
                ) {
                    taskList[i].completed = true;
                }
            }
        },

        getSortedTasksByPriority() {
            return [...taskList]
                .sort((a, b) => a.priority - b.priority);
        },

        filterTasksByTag(tag) {
            return taskList
                .filter(task => task.tags.includes(tag));
        },

        updateTask(taskId, updates) {
            for (let i = 0; i < taskList.length; i++) {
                if (taskList[i].id === taskId) {
                    taskList[i] = {
                        ...taskList[i],
                        ...updates
                    };
                }
            }
        },

    };

}

const planner = createTaskPlanner();

planner.addTask({
    id: 1,
    name: "Comprar leche",
    priority: 1,
    tags: ["shopping", "home"]
});


planner.addTask({
    id: 2,
    name: "Llamar a Juan",
    priority: 3,
    tags: ["personal"]
});

planner.addTask({
    id: 3,
    name: "New Task",
    priority: 3,
    tags: ["personal"]
});

planner.markTaskAsCompleted("Llamar a Juan")

console.log("***** all task *****")
console.log(planner.getTasks());

planner.removeTask(3);

console.log("***** pending tasks *****")
console.log(planner.getPendingTasks());

console.log("***** completed tasks *****")
console.log(planner.getCompletedTasks());

console.log("***** filter by tags *****")
console.log(planner.filterTasksByTag("home"));

planner.updateTask(1, {
    id: 1,
    name: "Comprar leche2",
    priority: 1,
    tags: ["shopping", "home"]
});

console.log("***** all tasks after update *****")
console.log(planner.getTasks());

console.log("***** tasks sorter by priority *****")
console.log(planner.getSortedTasksByPriority());

/*
planner.getCompletedTasks()
[{
    id: 2,
    name: "Llamar a Juan",
    completed: true,
    priority: 3,
    tags: ["personal"]
}]
 */
