export {
    createSongSection
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
    clearElementChildren
} from "../domHelper.js"
import{
    createSongCommentForm
} from "./songCommentForm.js"


const createSongSection = (element, songs) => {
    clearElementChildren(element);
    element.append(createHeader());
    element.append(createNavBar());
    const ul = document.createElement('ul');
    ul.innerHTML = `
        <p>${songs.title}</p>
        <a href="${songs.link}">Click here for Youtube Link</a>
        <p>${songs.duration}</p>
        <p>${songs.comments}</p>  
    `
    element.append(ul);
    createSongCommentForm(element, songs.id);
    element.append(createFooter());
}
