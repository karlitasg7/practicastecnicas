function getStudentAverage(students) {
    let generalAverage = 0;
    let response = {
        classAverage: 0.00,
        students: []
    };

    students.forEach(student => {

        let localAverage = student.grades.reduce((sum, num) => {
            return sum + num;
        }, 0);

        if (student.grades.length > 0) {
            localAverage = parseFloat((localAverage / student.grades.length).toFixed(2));
        }

        generalAverage += localAverage;

        response.students.push(
            {
                name: student.name,
                average: localAverage
            }
        );

    });

    if (students.length > 0) {
        generalAverage = parseFloat((generalAverage / students.length).toFixed(2));
    }

    response.classAverage = generalAverage;

    return response;

}

console.log(getStudentAverage([
        {
            name: "Pedro",
            grades: [90, 87, 88, 90],
        },
        {
            name: "Jose",
            grades: [99, 71, 88, 96],
        },
        {
            name: "Maria",
            grades: [92, 81, 80, 96],
        },
    ])
);
/*
Expected Output: {
    classAverage: 88.17,
        students: [
        {
            name: "Pedro",
            average: 88.75
        },
        {
            name: "Jose",
            average: 88.5
        },
        {
            name: "Maria",
            average: 87.25
        }
    ]
}

 */
