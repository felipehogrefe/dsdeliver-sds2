import './styles.css'
import {ReactComponent as IntagramLogo} from './instagram.svg'
import {ReactComponent as YoutubeLogo} from './youtube.svg'
import {ReactComponent as LinkedinLogo} from './linkedin.svg'

function Footer(){
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="https://www.youtube.com/c/DevSuperior" target="_new">
                    <YoutubeLogo />
                </a>
                <a href="https://www.linkedin.com/school/devsuperior" target="_new">
                    <LinkedinLogo />
                </a>
                <a href="https://www.instagram.com/devsuperior.ig" target="_new">
                    <IntagramLogo />
                </a>
            </div>
        </footer>
    )
}
export default Footer;