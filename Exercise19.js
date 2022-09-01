/*

Requirement: Given an object array of movies with title, director and views, show all the movies indicating which one it's watching and which one not

Test Cases:
    myMovies(movies); // should return:
                      // you already see: movie1 of director
                      // you need to see: movie2 of director, movie3 of director

Steps:
    - create a function that receives an array as a parameter
    - create two array variables
    - make a for cycle and valid if the movie was viewed
    - if its add two array viewed if not add to not viewed array

*/

function myMovies(movies) {

    let viewed = [];
    let notViewed = [];

    for (movie of movies) {
        if (movie['viewed']) {
            viewed.push(`You already see: ${movie["title"]} of ${movie["director"]}`);
        } else {
            notViewed.push(`You need to see: ${movie["title"]} of ${movie["director"]}`);
        }
    }

    console.log(viewed);
    console.log(notViewed);

}

const movies = [
    {
        title: "movie1",
        director: "director1",
        viewed: true
    },
    {
        title: "movie2",
        director: "director2",
        viewed: false
    },
    {
        title: "movie3",
        director: "director3",
        viewed: false
    }
];

myMovies(movies);
