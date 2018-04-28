package com.example.lucas.studenthackquiz;

public class QuestionLibrary {

    private String questions [] = {
            "What is the closest planet to the Sun?",
            "What is the name of the 2nd biggest planet in our solar system? ",
            "What is the hottest planet in our solar system?",
            "How many moons go around Neptune?",
            "Who developed the first telescope?",
            "Who was the Apollo 11 mission leader?",
            "How many planets with rings are there in our solar system?",
            "Which was the first planet to be explored by a space probe? ",
            "How many planets are in the Solar System?",
            "How many stars are there in Andromeda Galaxy?",
            "Which NASA space flight was the last manned mission to the moon? ",
            "What percent of the solar system’s mass does Sun holds? ",
            "How many stars are in the Milky Way? ",
            "How much time does sun rays take to reach earth?",
            "Which Planet spins backwards relative to the others?",
            "How much larger the Sun is than Earth?",
            "Do aliens exist? ",
            "What is the fifth planet from the sun?",
            "Which is the fastest rotating planet in our solar system?",
            "How may moons does the planet Mars have?",
            "Io, Europa, Ganymede and Callisto are all moons of which planet in our solar system?",
            "In our solar system, which is the sixth planet from the sun?",
            "How many satellites orbit the Earth?",
            "Which of the following models accurately describes the view of the solar system first developed by the Greeks?",
            "Which of the following interstellar objects was first located by Carl Jansky using radio astronomy?",
            "_____ is the closest planet to earth. ",
            "_____ has the highest winds",
            "_____ has tallest peak",
            "_____ has relatively calm weather patterns",
            "Whats the shape of earth?"
    };

    private String choices [] [] = {
            {"Mercury", "Earth", "Venus"},
            {"Jupiter", "Saturn", "Uranus"},
            {"Mercury", "Venus", "Mars"},
            {"None", "3", "8"},
            {"Hans Lippershey", "Galileo Galilei", "Edwin Hubble"},
            {"Buzz Aldrin", "Bob Seger", "Neil Armstrong"},
            {"Four", "One", "Three"},
            {"Mars", "Venus", "Mercury"},
            {"8", "Just Earth", "9"},
            {"1 billion", "1 trillion", "1 million"},
            {"Apollo 17", "Apollo 13", "Apollo 15"},
            {"99.8%", "75%", "45%"},
            {"Around 3?", "More than 200 billion", "More than 100 billion"},
            {"8 seconds", "8 minutes", "8 hours"},
            {"Urnanus", "Earth", "Venus"},
            {"100000 times", "300000 times", "200000 times"},
            {"Yes", "Government is hiding them", "No"},
            {"Jupiter", "Uranus", "Saturn"},
            {"Jupiter", "Neptune", "Mercury"},
            {"3", "none", "2"},
            {"Jupiter", "Saturn", "Mercury"},
            {"Jupiter", "Uranus", "Saturn"},
            {"160000", "1000", "500000"},
            {"Planets rotate around the sun", "Planets are stationary", "Planets rotate around the earth"},
            {"A distant galaxy", "A black hole", "A supernova"},
            {"Mars", "Venus", "Mercury"},
            {"Neptune", "Jupiter", "Uranus"},
            {"Earth", "Saturn", "Mars"},
            {"Uranus", "Venus", "Jupiter"},
            {"Flat", "Spherical", "Oblate spheroid"}
    };

    private String answers [] = {
            "Mercury",
            "Saturn",
            "Venus",
            "8",
            "Hans Lippershey",
            "Neil Armstrong",
            "Four",
            "Venus",
            "8",
            "1 trillion",
            "Apollo 17",
            "99.8%",
            "More than 100 billion",
            "8 minutes",
            "Venus",
            "300000 times",
            "No",
            "Jupiter",
            "Jupiter",
            "2",
            "Jupiter",
            "Saturn",
            "500000",
            "Planets rotate around the earth",
            "A black hole",
            "Venus",
            "Neptune",
            "Mars",
            "Uranus",
            "Oblate spheroid"
    };

    public String getQuestion(int a){
        String currentQuestion = questions[a];
        return currentQuestion;
    }

    public String getChoice1(int a){
        String choice1 = choices[a][0];
        return choice1;
    }

    public String getChoice2(int a){
        String choice2 = choices[a][1];
        return choice2;
    }

    public String getChoice3(int a){
        String choice3 = choices[a][2];
        return choice3;
    }

    public String getAnswer(int a){
        String currentAnswer = answers[a];
        return currentAnswer;
    }
}
