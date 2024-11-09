package com.amadeus.nodo.Services;

import com.amadeus.nodo.Models.*;
import com.amadeus.nodo.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AnswersService {
    @Autowired
    private AnswersRepository answerRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private DestinationRepository destinationRepository;
    @Autowired
    private WeatherRepository weatherRepository;
    @Autowired
    private ActivityRepository activityRepository;
    @Autowired
    private HostingRepository hostingRepository;
    @Autowired
    private TravelRepository travelRepository;
    @Autowired
    private AgeRepository ageRepository;

    public AnswersEntity create(AnswersEntity answer){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(answer.getUser().getName());
        userEntity.setEmail(answer.getUser().getEmail());
        userEntity = GenericEntityService.findOrCreate(
                userRepository,
                existingUser -> existingUser.getEmail().equals(answer.getUser().getEmail()),
                userEntity
        );

        DestinationEntity destinationEntity = new DestinationEntity();
        destinationEntity.setName(answer.getDestination().getName());
        destinationEntity = GenericEntityService.findOrCreate(
                destinationRepository,
                existingDestination -> existingDestination.getName().equals(answer.getDestination().getName()),
                destinationEntity
        );

        WeatherEntity weatherEntity = new WeatherEntity();
        weatherEntity.setName(answer.getWeather().getName());
        weatherEntity = GenericEntityService.findOrCreate(
                weatherRepository,
                existingWeather -> existingWeather.getName().equals(answer.getWeather().getName()),
                weatherEntity
        );
        ActivityEntity activityEntity = new ActivityEntity();
        activityEntity.setName(answer.getActivity().getName());
        activityEntity = GenericEntityService.findOrCreate(
                activityRepository,
                existingActivity -> existingActivity.getName().equals(answer.getActivity().getName()),
                activityEntity
        );
        HostingEntity hostingEntity = new HostingEntity();
        hostingEntity.setName(answer.getHosting().getName());
        hostingEntity = GenericEntityService.findOrCreate(
                hostingRepository,
                existingHosting -> existingHosting.getName().equals(answer.getHosting().getName()),
                hostingEntity
        );
        TravelEntity travelEntity = new TravelEntity();
        travelEntity.setName(answer.getTravel().getName());
        travelEntity = GenericEntityService.findOrCreate(
                travelRepository,
                existingTravel -> existingTravel.getName().equals(answer.getTravel().getName()),
                travelEntity
        );
        AgeEntity ageEntity = new AgeEntity();
        ageEntity.setName(answer.getAge().getName());
        ageEntity = GenericEntityService.findOrCreate(
                ageRepository,
                existingAge -> existingAge.getName().equals(answer.getAge().getName()),
                ageEntity
        );

        AnswersEntity answersEntity = new AnswersEntity();
        answersEntity.setUser(userEntity);
        answersEntity.setDestination(destinationEntity);
        answersEntity.setWeather(weatherEntity);
        answersEntity.setActivity(activityEntity);
        answersEntity.setHosting(hostingEntity);
        answersEntity.setTravel(travelEntity);
        answersEntity.setAge(ageEntity);

        return answerRepository.save(answersEntity);
    }

    public List<AnswersEntity> findAll() {return answerRepository.findAll();}

    public Optional<AnswersEntity> findById(Integer id) {
        return answerRepository.findById(id);
        }

    public void deleteById(Integer id) {
        answerRepository.deleteById(id);
    }
}
