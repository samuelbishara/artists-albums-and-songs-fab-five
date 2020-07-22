export{
    createNavBar
}

const createNavBar = () => {
    const navBar = document.createElement("nav");
    navBar.classList.add('nav')
    navBar.innerHTML = `
    <nav>
    <ul>
    <li>
        <a id="home-nav" href="artists.html">Artists</a>
    </li>
    </ul>
</nav>
`
return navBar;
}