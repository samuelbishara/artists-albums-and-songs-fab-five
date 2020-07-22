export{
    createMainSection
}
import {
    createHeader
} from "./header.js"
import{
    createNavBar
} from "./navBar.js"
import {
    createFooter
} from "./footer.js"
import {
    createArtistSection
} from "./artistSection.js"
import {
    clearElementChildren
} from "../domHelper.js"
import{
    createArtistForm
} from "./artistForm.js"
import{
    deleteArtist
} from "./singleArtistFetcher.js"


const createMainSection = (element, artists) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    let string = '';
    const mainSection = document.createElement("main");
    mainSection.classList.add('artist');
    const ul = document.createElement('ul');
    ul.classList.add('grid-container')
    
    mainSection.append(ul);
    

    for (let i = 0; i < artists.length; i++) {
        const li = document.createElement('li')
        li.classList.add('grid-item');
        li.innerHTML = `
                <img class="artist-img" src="${artists[i].image}">
                <a>${artists[i].name}</a>
                <button type="submit" class="delete">x</button>
        `
       li.addEventListener('click', (event) => {
            event.preventDefault();
            createArtistSection(element, artists[i]);
        });

        li.querySelector(".delete").addEventListener('click', (event) => {
            event.preventDefault();
            deleteArtist(artists[i].id);
            createMainSection(element, artists);
        })

        ul.append(li)
    }
    element.append(mainSection);
    createArtistForm(element);
    element.append(createFooter());
}