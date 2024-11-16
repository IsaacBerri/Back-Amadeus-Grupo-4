package com.amadeus.nodo.Services;

import com.amadeus.nodo.Contracts.AnswersDTO;
import com.amadeus.nodo.Mappers.AnswersMapper;
import com.amadeus.nodo.Models.*;
import com.amadeus.nodo.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class  AnswersService {
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

    public void create(AnswersDTO answerDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(answerDTO.getUserDTO().getName());
        userEntity.setEmail(answerDTO.getUserDTO().getEmail());
        userEntity = GenericEntityService.findOrCreate(
                userRepository,
                existingUser -> existingUser.getEmail().equals(answerDTO.getUserDTO().getEmail()),
                existingUser -> existingUser.getName().equals(answerDTO.getUserDTO().getName()),
                userEntity
        );

        DestinationEntity destinationEntity = new DestinationEntity();
        destinationEntity.setName(answerDTO.getDestination());
        destinationEntity = GenericEntityService.findOrCreate(
                destinationRepository,
                existingDestination -> existingDestination.getName().equals(answerDTO.getDestination()),
                destinationEntity
        );

        WeatherEntity weatherEntity = new WeatherEntity();
        weatherEntity.setName(answerDTO.getWeather());
        weatherEntity = GenericEntityService.findOrCreate(
                weatherRepository,
                existingWeather -> existingWeather.getName().equals(answerDTO.getWeather()),
                weatherEntity
        );
        ActivityEntity activityEntity = new ActivityEntity();
        activityEntity.setName(answerDTO.getActivity());
        activityEntity = GenericEntityService.findOrCreate(
                activityRepository,
                existingActivity -> existingActivity.getName().equals(answerDTO.getActivity()),
                activityEntity
        );
        HostingEntity hostingEntity = new HostingEntity();
        hostingEntity.setName(answerDTO.getHosting());
        hostingEntity = GenericEntityService.findOrCreate(
                hostingRepository,
                existingHosting -> existingHosting.getName().equals(answerDTO.getHosting()),
                hostingEntity
        );
        TravelEntity travelEntity = new TravelEntity();
        travelEntity.setName(answerDTO.getTravel());
        travelEntity = GenericEntityService.findOrCreate(
                travelRepository,
                existingTravel -> existingTravel.getName().equals(answerDTO.getTravel()),
                travelEntity
        );
        AgeEntity ageEntity = new AgeEntity();
        ageEntity.setName(answerDTO.getAge());
        ageEntity = GenericEntityService.findOrCreate(
                ageRepository,
                existingAge -> existingAge.getName().equals(answerDTO.getAge()),
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

        answerRepository.save(answersEntity);
    }

    public List<AnswersDTO> findAll() {
        return answerRepository.findAll().stream().map(AnswersMapper::toDTO).collect(Collectors.toList());
    }

    public Optional<AnswersDTO> findById(int id) {
        Optional<AnswersEntity> answer = answerRepository.findById(id);
        return Optional.of(AnswersMapper.toDTO(answer.orElse(null)));
    }

    public void deleteById(Integer id) {
        answerRepository.deleteById(id);
    }
}
