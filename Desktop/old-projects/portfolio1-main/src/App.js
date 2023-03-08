
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Navbar from './components/Navbar';
import Header from './components/Header';
import Particles from 'react-particles-js';
import AboutMe from './components/AboutMe';
import Portfolio from './components/Portfolio';
import Services from './components/Services';
import Testimonials from './components/Testimonials';
import Contacts from './components/Contacts';
import Footer from './components/Footer';



function App() {
  return (
  <>
  <Particles
  className='particles-canvas'
   params={{
     particles: {
       number: {
         value: 30,
         density: {
           enable: true,
           value_area: 900
          }
     }
    }
   }}
  />
  <Navbar/>
  <Header/>
  <AboutMe/>
  <Portfolio/>
  <Services/>
  <Testimonials/>
  <Contacts/>
  <Footer/>
  
  
  </>
  );
}

export default App;
